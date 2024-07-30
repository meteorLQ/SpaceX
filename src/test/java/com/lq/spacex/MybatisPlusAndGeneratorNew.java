package com.lq.spacex;

import com.baomidou.mybatisplus.generator.FastAutoGenerator;
import com.baomidou.mybatisplus.generator.config.OutputFile;
import com.baomidou.mybatisplus.generator.config.rules.DbColumnType;

import java.sql.Types;
import java.util.Collections;

public class MybatisPlusAndGeneratorNew {
//    static String url = "jdbc:postgresql://localhost:5432/cms?currentSchema=ry-vue";
//    static String url = "jdbc:postgresql://localhost:5432/cms";
//    static String url = "Test-Platform-MySQL-A.msfl.com.cn";
    static String url = "jdbc:postgresql://207.211.162.191:5432/spaceX";

    static String username = "user_QFwaZs";
    static String password = "password_pS3pEM";

    public static void main(String[] args) {
        String projectPath = System.getProperty("user.dir");

        FastAutoGenerator.create(url, username, password)
                .globalConfig(builder -> {
                    builder.author("LQ") // 设置作者
//                            .enableSwagger() // 开启 swagger 模式
                            .outputDir(projectPath + "/src/test/java") // 指定输出目录
                            .disableOpenDir();// 禁止打开输出目录
                })
                .dataSourceConfig(builder ->
                        builder.typeConvertHandler((globalConfig, typeRegistry, metaInfo) -> {
                            int typeCode = metaInfo.getJdbcType().TYPE_CODE;
                            if (typeCode == Types.SMALLINT) {
                                // 自定义类型转换
                                return DbColumnType.INTEGER;
                            }
                            return typeRegistry.getColumnType(metaInfo);
                        })
                )
                .packageConfig(builder ->
                        builder.parent("com.lq.space") // 设置父包名
                                .moduleName("system") // 设置父包模块名
                                .pathInfo(Collections.singletonMap(OutputFile.xml, projectPath + "/src/test/java")) // 设置mapperXml生成路径
                )
                .strategyConfig(builder ->
                            builder.addInclude("sys_role") // 设置需要生成的表名
                                    .entityBuilder()
                                    .enableLombok() // 启用 Lombok
                                    .enableTableFieldAnnotation() // 启用字段注解
                                    .controllerBuilder()
                                    .enableRestStyle() // 启用 REST 风格
//                        builder.addInclude("sys_dict_type") // 设置需要生成的表名
//                                .addTablePrefix("t_", "c_") // 设置过滤表前缀
                )
//                .templateEngine(new FreemarkerTemplateEngine()) // 使用Freemarker引擎模板，默认的是Velocity引擎模板
                .execute();
    }
}
