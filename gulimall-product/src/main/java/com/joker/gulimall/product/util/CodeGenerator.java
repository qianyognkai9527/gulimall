package com.share.gen.util;

import com.baomidou.mybatisplus.generator.FastAutoGenerator;
import com.baomidou.mybatisplus.generator.config.*;
import com.baomidou.mybatisplus.generator.config.rules.DateType;
import com.baomidou.mybatisplus.generator.config.rules.NamingStrategy;
import com.baomidou.mybatisplus.generator.engine.FreemarkerTemplateEngine;

import java.util.Collections;

public class CodeGenerator {
    
    // 数据库配置
    private static final String JDBC_URL = "jdbc:mysql://localhost:3306/gulimall-payment?useUnicode=true&characterEncoding=utf8&useSSL=false&serverTimezone=GMT%2B8";
    private static final String JDBC_USERNAME = "root";
    private static final String JDBC_PASSWORD = "root123456";
    
    // 项目配置
    private static final String AUTHOR = "joker";
    private static final String OUTPUT_DIR = System.getProperty("user.dir") + "/share-modules/share-payment/src/main/java";
    private static final String PACKAGE_NAME = "com.share";
    
    // 表配置
    private static final String[] TABLE_NAMES = {"payment_info"}; // 要生成的表名
    private static final String TABLE_PREFIX = ""; // 表前缀（可空）

    public static void main(String[] args) {
        FastAutoGenerator.create(JDBC_URL, JDBC_USERNAME, JDBC_PASSWORD)
                // 全局配置
                .globalConfig(builder -> {
                    builder
                            .author(AUTHOR) // 设置作者
                            .outputDir(OUTPUT_DIR) // 指定输出目录
                            .disableOpenDir() // 禁止打开输出目录
                            .dateType(DateType.ONLY_DATE) // 时间策略
                            .commentDate("yyyy-MM-dd") // 注释日期格式
                            .fileOverride() // 覆盖已生成文件（谨慎使用）
                            .enableSwagger() // 开启 swagger 模式
                            .build();
                })
                
                // 包配置
                .packageConfig(builder -> {
                    builder
                            .parent(PACKAGE_NAME) // 设置父包名
                            .moduleName("pament") // 设置父包模块名
                            .entity("entity") // 实体类包名
                            .mapper("mapper") // Mapper包名
                            .service("service") // Service包名
                            .serviceImpl("service.impl") // ServiceImpl包名
                            .controller("controller") // Controller包名
                            .xml("mapper.xml") // Mapper XML包名
                            .pathInfo(Collections.singletonMap(OutputFile.xml, 
                                    System.getProperty("user.dir") + "/share-modules/share-payment/src/main/resources/mapper/payment")) // XML文件路径
                            .build();
                })
                
                // 策略配置
                .strategyConfig(builder -> {
                    builder
                            .addInclude(TABLE_NAMES) // 设置需要生成的表名
                            .addTablePrefix(TABLE_PREFIX) // 设置过滤表前缀
                            
                            // Entity 策略配置
                            .entityBuilder()
                            .enableLombok() // 启用Lombok
                            .enableFileOverride()
                            .enableTableFieldAnnotation() // 开启生成字段注解
                            .naming(NamingStrategy.underline_to_camel) // 数据库表映射到实体的命名策略
                            .columnNaming(NamingStrategy.underline_to_camel) // 数据库表字段映射到实体属性的命名策略
                            .logicDeleteColumnName("deleted") // 逻辑删除字段名
//                            .versionColumnName("version") // 乐观锁字段名
//                            .enableChainModel() // 链式模型
                            .enableActiveRecord() // 开启 ActiveRecord 模式
                            .formatFileName("%s") // 实体命名方式：%sEntity 生成 UserEntity
                            
                            // Controller 策略配置
                            .controllerBuilder()
                            .enableFileOverride()
                            .enableRestStyle() // 开启生成@RestController控制器
                            .formatFileName("%sController") // 控制器命名方式
                            
                            // Service 策略配置
                            .serviceBuilder()
                            .enableFileOverride()
                            .formatServiceFileName("%sService") // Service接口命名方式
                            .formatServiceImplFileName("%sServiceImpl") // ServiceImpl命名方式
                            
                            // Mapper 策略配置
                            .mapperBuilder()
                            .enableFileOverride()
                            .enableMapperAnnotation() // 开启 @Mapper 注解
                            .enableBaseResultMap() // 启用BaseResultMap生成
                            .enableBaseColumnList() // 启用BaseColumnList生成
                            .formatMapperFileName("%sMapper") // Mapper接口命名方式
                            .formatXmlFileName("%sMapper") // Mapper XML命名方式
                            .build();
                })
                
                // 模板配置
//                .templateConfig(builder -> {
//                    builder
//                            .disable(TemplateType.CONTROLLER) // 禁用控制器模板
//                            .disable(TemplateType.SERVICE) // 禁用服务接口模板
//                            .disable(TemplateType.SERVICE_IMPL) // 禁用服务实现模板
//                            .build();
//                })
                
                // 模板引擎
                .templateEngine(new FreemarkerTemplateEngine())
                
                // 执行
                .execute();
    }
}