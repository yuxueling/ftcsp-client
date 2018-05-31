package com.cloudht.common.config.datasource;

import com.alibaba.druid.pool.DruidDataSource;
import org.apache.ibatis.io.VFS;
import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.mybatis.spring.annotation.MapperScan;
import org.mybatis.spring.boot.autoconfigure.SpringBootVFS;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.io.Resource;
import org.springframework.core.io.support.PathMatchingResourcePatternResolver;
import org.springframework.jdbc.datasource.DataSourceTransactionManager;

import javax.sql.DataSource;
import java.sql.SQLException;

@Configuration
@MapperScan(basePackages = MultiDataSourceConfig.IM_BASE_PACKAGE,
        sqlSessionFactoryRef = "imSqlSessionFactory")
public class ImDataSourceConfig {
    private Logger logger = LoggerFactory.getLogger(ImDataSourceConfig.class);

    @Value("${spring.datasource.bd-im.url}")
    private String dbUrl;

    @Value("${spring.datasource.bd-im.username}")
    private String username;

    @Value("${spring.datasource.bd-im.password}")
    private String password;

    @Value("${spring.datasource.bd-im.driverClassName}")
    private String driverClassName;

    @Value("${spring.datasource.bd-im.initialSize}")
    private int initialSize;

    @Value("${spring.datasource.bd-im.minIdle}")
    private int minIdle;

    @Value("${spring.datasource.bd-im.maxActive}")
    private int maxActive;

    @Value("${spring.datasource.bd-im.maxWait}")
    private int maxWait;

    @Value("${spring.datasource.bd-im.timeBetweenEvictionRunsMillis}")
    private int timeBetweenEvictionRunsMillis;

    @Value("${spring.datasource.bd-im.minEvictableIdleTimeMillis}")
    private int minEvictableIdleTimeMillis;

    @Value("${spring.datasource.bd-im.validationQuery}")
    private String validationQuery;

    @Value("${spring.datasource.bd-im.testWhileIdle}")
    private boolean testWhileIdle;

    @Value("${spring.datasource.bd-im.testOnBorrow}")
    private boolean testOnBorrow;

    @Value("${spring.datasource.bd-im.testOnReturn}")
    private boolean testOnReturn;

    @Value("${spring.datasource.bd-im.poolPreparedStatements}")
    private boolean poolPreparedStatements;

    @Value("${spring.datasource.bd-im.maxPoolPreparedStatementPerConnectionSize}")
    private int maxPoolPreparedStatementPerConnectionSize;

    @Value("${spring.datasource.bd-im.filters}")
    private String filters;

    @Value("{spring.datasource.bd-im.connectionProperties}")
    private String connectionProperties;

    @Bean(name="imDataSource", initMethod = "init", destroyMethod = "close")   //声明其为Bean实例
    public DataSource imDataSource() {
        DruidDataSource datasource = new DruidDataSource();

        datasource.setUrl(this.dbUrl);
        datasource.setUsername(username);
        datasource.setPassword(password);
        datasource.setDriverClassName(driverClassName);

        //configuration
        datasource.setInitialSize(initialSize);
        datasource.setMinIdle(minIdle);
        datasource.setMaxActive(maxActive);
        datasource.setMaxWait(maxWait);
        datasource.setTimeBetweenEvictionRunsMillis(timeBetweenEvictionRunsMillis);
        datasource.setMinEvictableIdleTimeMillis(minEvictableIdleTimeMillis);
        datasource.setValidationQuery(validationQuery);
        datasource.setTestWhileIdle(testWhileIdle);
        datasource.setTestOnBorrow(testOnBorrow);
        datasource.setTestOnReturn(testOnReturn);
        datasource.setPoolPreparedStatements(poolPreparedStatements);
        datasource.setMaxPoolPreparedStatementPerConnectionSize(maxPoolPreparedStatementPerConnectionSize);
        try {
            datasource.setFilters(filters);
        } catch (SQLException e) {
            logger.error("druid configuration initialization filter", e);
        }
        datasource.setConnectionProperties(connectionProperties);

        return datasource;
    }

    //数据源事务管理器
    @Bean(name="imDataSourceTransactionManager")
    public DataSourceTransactionManager imDataSourceTransactionManager(){
        DataSourceTransactionManager dataSourceTransactionManager = new DataSourceTransactionManager();
        dataSourceTransactionManager.setDataSource(imDataSource());
        return dataSourceTransactionManager;
    }

    //创建Session
    @Bean(name="imSqlSessionFactory")
    public SqlSessionFactory imSqlSessionFactory(@Qualifier("imDataSource") DataSource imDataSource) throws Exception{

        // DefaultVFS在获取jar上存在问题，使用springboot只能修改
        VFS.addImplClass(SpringBootVFS.class);

        final SqlSessionFactoryBean sqlSessionFactoryBean = new SqlSessionFactoryBean();
        sqlSessionFactoryBean.setDataSource(imDataSource);

        // 扫描 mapper 资源
        Resource[] mapperLocations = new PathMatchingResourcePatternResolver().getResources(MultiDataSourceConfig.IM_MAPPER_LOCATION);
        sqlSessionFactoryBean.setMapperLocations(mapperLocations);


        // 开启驼峰功能
        org.apache.ibatis.session.Configuration ibatisConfiguration = new org.apache.ibatis.session.Configuration();
        ibatisConfiguration.setMapUnderscoreToCamelCase(true);
        sqlSessionFactoryBean.setConfiguration(ibatisConfiguration);

        return sqlSessionFactoryBean.getObject();
    }

}
