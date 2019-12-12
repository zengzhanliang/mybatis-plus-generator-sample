package com.zeng.generator.util;

import com.zeng.model.GeneratorProperties;
import com.zeng.service.MysqlGenerator;

/**
 * <p>
 * mysql 代码生成器演示例子
 * </p>
 *
 * @author jobob
 * @since 2018-09-12
 */
public class Generator {

    public static void main(String[] args) {

        GeneratorProperties generatorProperties = new GeneratorProperties();
        generatorProperties.setPackageName("com.zeng");
        generatorProperties.setModuleName( "generator" );
        generatorProperties.setMysqlUrl( "jdbc:mysql://localhost:3306/report?serverTimezone=GMT%2B8&useUnicode=true&useSSL=false&characterEncoding=utf8" );
        generatorProperties.setMysqlPasswd( "dsl#@!root!@#" );
        generatorProperties.setMysqlUsername( "root" );
        generatorProperties.setTableName( "user" );

        MysqlGenerator mysqlGenerator = new MysqlGenerator( generatorProperties );

        mysqlGenerator.generator();
    }

}
