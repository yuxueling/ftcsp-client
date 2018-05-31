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
@MapperScan(basePackages = MultiDataSourceConfig.FT_BASE_PACKAGE,
        sqlSessionFactoryRef = "ftSqlSessionFactory")
public class FtDataSourceConfig {
    private Logger logger = LoggerFactory.getLogger(FtDataSourceConfig.class);

    @Value("${spring.datasource.bd-ft.url}")
    private String dbUrl;

    @Value("${spring.datasource.bd-ft.username}")
    private String username;

    @Value("${spring.datasource.bd-ft.password}")
    private String password;

    @Value("${spring.datasource.bd-ft.driverClassName}")
    private String driverClassName;

    @Value("${spring.datasource.bd-ft.initialSize}")
    private int initialSize;

    @Value("${spring.datasource.bd-ft.minIdle}")
    private int minIdle;

    @Value("${spring.datasource.bd-ft.maxActive}")
    private int maxActive;

    @Value("${spring.datasource.bd-ft.maxWait}")
    private int maxWait;

    @Value("${spring.datasource.bd-ft.timeBetweenEvictionRunsMillis}")
    private int timeBetweenEvictionRunsMillis;

    @Value("${spring.datasource.bd-ft.minEvictableIdleTimeMillis}")
    private int minEvictableIdleTimeMillis;

    @Value("${spring.datasource.bd-ft.validationQuery}")
    private String validationQuery;

    @Value("${spring.datasource.bd-ft.testWhileIdle}")
    private boolean testWhileIdle;

    @Value("${spring.datasource.bd-ft.testOnBorrow}")
    private boolean testOnBorrow;

    @Value("${spring.datasource.bd-ft.testOnReturn}")
    private boolean testOnReturn;

    @Value("${spring.datasource.bd-ft.poolPreparedStatements}")
    private boolean poolPreparedStatements;

    @Value("${spring.datasource.bd-ft.maxPoolPreparedStatementPerConnectionSize}")
    private int maxPoolPreparedStatementPerConnectionSize;

    @Value("${spring.datasource.bd-ft.filters}")
    private String filters;

    @Value("{spring.datasource.bd-ft.connectionProperties}")
    private String connectionProperties;

    @Bean(name="ftDataSource", initMethod = "init", destroyMethod = "close")   //声明其为Bean实例
    public DataSource ftDataSource() {
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
    @Bean(name="ftDataSourceTransactionManager")
    public DataSourceTransactionManager ftDataSourceTransactionManager(){
        DataSourceTransactionManager dataSourceTransactionManager = new DataSourceTransactionManager();
        dataSourceTransactionManager.setDataSource(ftDataSource());
        return dataSourceTransactionManager;
    }

    //创建Session
    @Bean(name="ftSqlSessionFactory")
    public SqlSessionFactory ftSqlSessionFactory(@Qualifier("ftDataSource") DataSource ftDataSource) throws Exception{

        // DefaultVFS在获取jar上存在问题，使用springboot只能修改
        VFS.addImplClass(SpringBootVFS.class);

        final SqlSessionFactoryBean sqlSessionFactoryBean = new SqlSessionFactoryBean();
        sqlSessionFactoryBean.setDataSource(ftDataSource);

        // 扫描 mapper 资源
        Resource[] mapperLocations = new PathMatchingResourcePatternResolver().getResources(MultiDataSourceConfig.FT_MAPPER_LOCATION);
        sqlSessionFactoryBean.setMapperLocations(mapperLocations);


        // 开启驼峰功能
        org.apache.ibatis.session.Configuration ibatisConfiguration = new org.apache.ibatis.session.Configuration();
        ibatisConfiguration.setMapUnderscoreToCamelCase(true);
        sqlSessionFactoryBean.setConfiguration(ibatisConfiguration);

        return sqlSessionFactoryBean.getObject();
    }

}
