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
import org.springframework.context.annotation.Primary;
import org.springframework.core.io.Resource;
import org.springframework.core.io.support.PathMatchingResourcePatternResolver;
import org.springframework.jdbc.datasource.DataSourceTransactionManager;

import javax.sql.DataSource;
import java.sql.SQLException;

@Configuration
@MapperScan(basePackages = MultiDataSourceConfig.COMMON_BASE_PACKAGE,sqlSessionFactoryRef = "commonSqlSessionFactory")
public class CommonDataSourceConfig {
    private Logger logger = LoggerFactory.getLogger(CommonDataSourceConfig.class);

    @Value("${spring.datasource.bd-common.url}")
    private String dbUrl;

    @Value("${spring.datasource.bd-common.username}")
    private String username;

    @Value("${spring.datasource.bd-common.password}")
    private String password;

    @Value("${spring.datasource.bd-common.driverClassName}")
    private String driverClassName;

    @Value("${spring.datasource.bd-common.initialSize}")
    private int initialSize;

    @Value("${spring.datasource.bd-common.minIdle}")
    private int minIdle;

    @Value("${spring.datasource.bd-common.maxActive}")
    private int maxActive;

    @Value("${spring.datasource.bd-common.maxWait}")
    private int maxWait;

    @Value("${spring.datasource.bd-common.timeBetweenEvictionRunsMillis}")
    private int timeBetweenEvictionRunsMillis;

    @Value("${spring.datasource.bd-common.minEvictableIdleTimeMillis}")
    private int minEvictableIdleTimeMillis;

    @Value("${spring.datasource.bd-common.validationQuery}")
    private String validationQuery;

    @Value("${spring.datasource.bd-common.testWhileIdle}")
    private boolean testWhileIdle;

    @Value("${spring.datasource.bd-common.testOnBorrow}")
    private boolean testOnBorrow;

    @Value("${spring.datasource.bd-common.testOnReturn}")
    private boolean testOnReturn;

    @Value("${spring.datasource.bd-common.poolPreparedStatements}")
    private boolean poolPreparedStatements;

    @Value("${spring.datasource.bd-common.maxPoolPreparedStatementPerConnectionSize}")
    private int maxPoolPreparedStatementPerConnectionSize;

    @Value("${spring.datasource.bd-common.filters}")
    private String filters;

    @Value("{spring.datasource.bd-common.connectionProperties}")
    private String connectionProperties;

    @Bean(name="commonDataSource", initMethod = "init", destroyMethod = "close")   //声明其为Bean实例
    @Primary
    public DataSource commonDataSource() {
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
    @Bean(name="commonDataSourceTransactionManager")
    @Primary
    public DataSourceTransactionManager commonDataSourceTransactionManager(){
        DataSourceTransactionManager dataSourceTransactionManager = new DataSourceTransactionManager();
        dataSourceTransactionManager.setDataSource(commonDataSource());
        return dataSourceTransactionManager;
    }

    //创建Session
    @Bean(name="commonSqlSessionFactory")
    @Primary
    public SqlSessionFactory commonSqlSessionFactory(@Qualifier("commonDataSource") DataSource commonDataSource) throws Exception{

        // DefaultVFS在获取jar上存在问题，使用springboot只能修改
        VFS.addImplClass(SpringBootVFS.class);

        final SqlSessionFactoryBean sqlSessionFactoryBean = new SqlSessionFactoryBean();
        sqlSessionFactoryBean.setDataSource(commonDataSource);

        // 扫描 mapper 资源
        Resource[] mapperLocations = new PathMatchingResourcePatternResolver().getResources(MultiDataSourceConfig.COMMON_MAPPER_LOCATION);
        sqlSessionFactoryBean.setMapperLocations(mapperLocations);


        // 开启驼峰功能
        org.apache.ibatis.session.Configuration ibatisConfiguration = new org.apache.ibatis.session.Configuration();
        ibatisConfiguration.setMapUnderscoreToCamelCase(true);
        sqlSessionFactoryBean.setConfiguration(ibatisConfiguration);

        return sqlSessionFactoryBean.getObject();
    }

//    @Bean
//    public ServletRegistrationBean druidServlet() {
//        ServletRegistrationBean reg = new ServletRegistrationBean();
//        reg.setServlet(new StatViewServlet());
//        reg.addUrlMappings("/druid/*");
//        reg.addInitParameter("allow", ""); //白名单
//        return reg;
//    }
//
//    @Bean
//    public FilterRegistrationBean filterRegistrationBean() {
//        FilterRegistrationBean filterRegistrationBean = new FilterRegistrationBean();
//        filterRegistrationBean.setFilter(new WebStatFilter());
//        filterRegistrationBean.addUrlPatterns("/*");
//        filterRegistrationBean.addInitParameter("exclusions", "*.js,*.gif,*.jpg,*.png,*.css,*.ico,/druid/*");
//        filterRegistrationBean.addInitParameter("profileEnable", "true");
//        filterRegistrationBean.addInitParameter("principalCookieName","USER_COOKIE");
//        filterRegistrationBean.addInitParameter("principalSessionName","USER_SESSION");
//        filterRegistrationBean.addInitParameter("DruidWebStatFilter","/*");
//        return filterRegistrationBean;
//    }
}
