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
@MapperScan(basePackages = MultiDataSourceConfig.EX_BASE_PACKAGE,
        sqlSessionFactoryRef = "exSqlSessionFactory")
public class ExDataSourceConfig {
    private Logger logger = LoggerFactory.getLogger(ExDataSourceConfig.class);

    @Value("${spring.datasource.bd-ex.url}")
    private String dbUrl;

    @Value("${spring.datasource.bd-ex.username}")
    private String username;

    @Value("${spring.datasource.bd-ex.password}")
    private String password;

    @Value("${spring.datasource.bd-ex.driverClassName}")
    private String driverClassName;

    @Value("${spring.datasource.bd-ex.initialSize}")
    private int initialSize;

    @Value("${spring.datasource.bd-ex.minIdle}")
    private int minIdle;

    @Value("${spring.datasource.bd-ex.maxActive}")
    private int maxActive;

    @Value("${spring.datasource.bd-ex.maxWait}")
    private int maxWait;

    @Value("${spring.datasource.bd-ex.timeBetweenEvictionRunsMillis}")
    private int timeBetweenEvictionRunsMillis;

    @Value("${spring.datasource.bd-ex.minEvictableIdleTimeMillis}")
    private int minEvictableIdleTimeMillis;

    @Value("${spring.datasource.bd-ex.validationQuery}")
    private String validationQuery;

    @Value("${spring.datasource.bd-ex.testWhileIdle}")
    private boolean testWhileIdle;

    @Value("${spring.datasource.bd-ex.testOnBorrow}")
    private boolean testOnBorrow;

    @Value("${spring.datasource.bd-ex.testOnReturn}")
    private boolean testOnReturn;

    @Value("${spring.datasource.bd-ex.poolPreparedStatements}")
    private boolean poolPreparedStatements;

    @Value("${spring.datasource.bd-ex.maxPoolPreparedStatementPerConnectionSize}")
    private int maxPoolPreparedStatementPerConnectionSize;

    @Value("${spring.datasource.bd-ex.filters}")
    private String filters;

    @Value("{spring.datasource.bd-ex.connectionProperties}")
    private String connectionProperties;

    @Bean(name="exDataSource", initMethod = "init", destroyMethod = "close")   //声明其为Bean实例
    public DataSource exDataSource() {
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
    @Bean(name="exDataSourceTransactionManager")
    public DataSourceTransactionManager exDataSourceTransactionManager(){
        DataSourceTransactionManager dataSourceTransactionManager = new DataSourceTransactionManager();
        dataSourceTransactionManager.setDataSource(exDataSource());
        return dataSourceTransactionManager;
    }

    //创建Session
    @Bean(name="exSqlSessionFactory")
    public SqlSessionFactory exSqlSessionFactory(@Qualifier("exDataSource") DataSource exDataSource) throws Exception{

        // DefaultVFS在获取jar上存在问题，使用springboot只能修改
        VFS.addImplClass(SpringBootVFS.class);

        final SqlSessionFactoryBean sqlSessionFactoryBean = new SqlSessionFactoryBean();
        sqlSessionFactoryBean.setDataSource(exDataSource);

        // 扫描 mapper 资源
        Resource[] mapperLocations = new PathMatchingResourcePatternResolver().getResources(MultiDataSourceConfig.EX_MAPPER_LOCATION);
        sqlSessionFactoryBean.setMapperLocations(mapperLocations);


        // 开启驼峰功能
        org.apache.ibatis.session.Configuration ibatisConfiguration = new org.apache.ibatis.session.Configuration();
        ibatisConfiguration.setMapUnderscoreToCamelCase(true);
        sqlSessionFactoryBean.setConfiguration(ibatisConfiguration);

        return sqlSessionFactoryBean.getObject();
    }

}
