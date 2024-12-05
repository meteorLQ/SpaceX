package com.lq.spacex.common.utils;

import co.elastic.clients.elasticsearch.ElasticsearchClient;
import co.elastic.clients.elasticsearch.core.InfoResponse;
import co.elastic.clients.elasticsearch.core.SearchResponse;
import co.elastic.clients.elasticsearch.core.search.Hit;
import co.elastic.clients.elasticsearch.indices.DeleteIndexResponse;
import co.elastic.clients.elasticsearch.indices.GetIndexResponse;
import co.elastic.clients.elasticsearch.indices.IndexState;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import java.io.IOException;
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

    public void deleteIndices(String index) {
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

    public void addDocumentB(String index, String id, Object o) {
        try {
            elasticsearchClient.bulk();
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

    public void search(String index, Object c) {
        SearchResponse<?> search;
        try {
            search = elasticsearchClient.search(s -> s.index(index).from(0).size(20), c.getClass());
        } catch (Exception e) {
            throw new RuntimeException(e);
        } finally {
            try {
                elasticsearchClient.close();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
        List<? extends Hit<?>> hits = search.hits().hits();
        hits.forEach(h -> System.out.println("h.source() = " + h.source()));
    }

    public  <TDocument> SearchResponse<TDocument> searchMatch(String field,String value,String index, Class<TDocument> c) {
        try {
//            SearchRequest request = SearchRequest.of(builder ->
//                    builder.index("user")
//                            .query(query -> query.match(match ->
//                                    match.field("name").query("zhansang"))));
//            SearchResponse<?> response = elasticsearchClient.search(request, c.getClass());
          return   elasticsearchClient.search(req-> req.index(index).query(q -> q.match(t -> t.field(field).query(value))), c);
        } catch (Exception e) {
            throw new RuntimeException(e);
        } finally {
            try {
                elasticsearchClient.close();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
