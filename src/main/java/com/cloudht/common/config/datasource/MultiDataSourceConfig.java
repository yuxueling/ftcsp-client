package com.cloudht.common.config.datasource;

public class MultiDataSourceConfig {

    public static final String BLOG_NAME = "blog";
    public static final String BLOG_BASE_PACKAGE = "com.cloudht.blog.dao";
    public static final String BLOG_MAPPER_LOCATION = "mybatis/blog/*Mapper.xml";

    public static final String COMMON_NAME = "common";
    public static final String COMMON_BASE_PACKAGE = "com.cloudht.common.dao";
    public static final String COMMON_MAPPER_LOCATION = "mybatis/common/*Mapper.xml";

    public static final String OA_NAME = "oa";
    public static final String OA_BASE_PACKAGE = "com.cloudht.oa.dao";
    public static final String OA_MAPPER_LOCATION = "mybatis/oa/*Mapper.xml";

    public static final String SYSTEM_NAME = "system";
    public static final String SYSTEM_BASE_PACKAGE = "com.cloudht.system.dao";
    public static final String SYSTEM_MAPPER_LOCATION = "mybatis/system/*Mapper.xml";

    public static final String EX_NAME = "ex";
    public static final String EX_BASE_PACKAGE = "com.cloudht.ex.dao";
    public static final String EX_MAPPER_LOCATION = "mybatis/ex/*Mapper.xml";

}
