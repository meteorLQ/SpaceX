package com.lq.spacex.common.utils;

import co.elastic.clients.elasticsearch.ElasticsearchClient;
import co.elastic.clients.elasticsearch._types.Result;
import co.elastic.clients.elasticsearch.core.BulkRequest;
import co.elastic.clients.elasticsearch.core.DeleteResponse;
import co.elastic.clients.elasticsearch.core.InfoResponse;
import co.elastic.clients.elasticsearch.core.SearchResponse;
import co.elastic.clients.elasticsearch.core.bulk.BulkOperation;
import co.elastic.clients.elasticsearch.core.bulk.CreateOperation;
import co.elastic.clients.elasticsearch.core.search.Hit;
import co.elastic.clients.elasticsearch.indices.DeleteIndexResponse;
import co.elastic.clients.elasticsearch.indices.GetIndexResponse;
import co.elastic.clients.elasticsearch.indices.IndexState;
import com.google.common.collect.Lists;
import com.lq.spacex.domain.dto.Processor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * es 工具类
 */
@Component
@Slf4j
public class EsUtils {
    @Autowired
    @Qualifier("getEsClient")
    private ElasticsearchClient elasticsearchClient;

    public void getInfoResponse() {
        InfoResponse info;
        try {
            info = elasticsearchClient.info();
            log.info("info.name() ={}", info.tagline());
            log.info("info.version() ={}", info.version().number());
            log.info("info.clusterName() ={}", info.clusterName());
        } catch (IOException e) {
            throw new RuntimeException(e);
        } finally {
            try {
                elasticsearchClient.close();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
    }

    public void createIndex(String index) {
        try {
            elasticsearchClient.indices().create(req -> req.index(index));
        } catch (IOException e) {
            throw new RuntimeException(e);
        } finally {
            try {
                elasticsearchClient.close();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
    }

    public void getIndex(String index) {
        GetIndexResponse getIndexResponse;
        try {
            getIndexResponse = elasticsearchClient.indices().get(req -> req.index(index));
            IndexState indexState = getIndexResponse.get(index);
            log.info("index:{},indexState:{} ", index, indexState);
        } catch (IOException e) {
            log.error("异常:{}", e.getMessage(), e);
        } finally {
            try {
                elasticsearchClient.close();
            } catch (Exception e) {
                log.error("异常:{}", e.getMessage(), e);
            }
        }
    }

    public void deleteIndex(String index) {
        DeleteIndexResponse response;
        try {
            response = elasticsearchClient.indices().delete(req -> req.index(index));
        } catch (IOException e) {
            throw new RuntimeException(e);
        } finally {
            try {
                elasticsearchClient.close();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
        System.out.println("response = " + response.acknowledged());

    }

    public void deleteDocument(String id,String index) {
        try {
            DeleteResponse delete = elasticsearchClient.delete(d -> d.id(id).index(index));
            Result result = delete.result();
            log.info("result:{},id:{}",result,delete.id());
        } catch (IOException e) {
            log.error("deleteDocument:{}",e.getMessage(),e);
        }
    }

    public void addDocument(String index, String id, Object o) {
        try {
            elasticsearchClient.create(i -> i.index(index).id(id).document(o));
        } catch (IOException e) {
            throw new RuntimeException(e);
        } finally {
            try {
                elasticsearchClient.close();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
    }

    public void addDocumentBulk(String index, String id, Object o) {
        try {

            elasticsearchClient.bulk(f-> f.operations(x-> x.create(s-> s.index(index).id("").document(Processor.builder()))));
            BulkRequest.of(f-> f.operations(x-> x.create(s-> s.index("").id("").document(Processor.builder().build()))));


            List<BulkOperation> list=new ArrayList<>();
            CreateOperation<Processor> build = new CreateOperation.Builder<Processor>().document(Processor.builder().build()).build();
            BulkOperation build1 = new BulkOperation.Builder().create(build).build();
            list.add(build1);
            BulkRequest request = new BulkRequest.Builder().operations(list).build();
            elasticsearchClient.bulk(request);
        } catch (IOException e) {
            throw new RuntimeException(e);
        } finally {
            try {
                elasticsearchClient.close();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
    }

    public void search(String index, Object c) {
        SearchResponse<?> search;
        try {
            search = elasticsearchClient.search(s -> s.index(index).from(0).size(20), c.getClass());
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
        List<? extends Hit<?>> hits = search.hits().hits();
        hits.forEach(h -> System.out.println("h.source() = " + h.source()));
    }

    public  <TDocument> List<TDocument> searchMatch(String field,String value,String index, Class<TDocument> c) {
        try {
            SearchResponse<TDocument> response = elasticsearchClient.search(req -> req.index(index).size(1000).query(q -> q.match(t -> t.field(field).query(value))), c);
            List<Hit<TDocument>> hits = response.hits().hits();
            List<TDocument> documents = Lists.newArrayListWithCapacity(hits.size());
            hits.forEach(d -> documents.add(d.source()));
            return documents;
        } catch (Exception e) {
           log.error("searchMatch异常:{}",e.getMessage(),e);
        }
        return null;
    }
}
