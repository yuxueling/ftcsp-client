package com.cloudht;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.boot.web.servlet.ServletComponentScan;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.transaction.annotation.EnableTransactionManagement;
//指定aop事务执行顺序，已保证在切换数据源的后面
@EnableTransactionManagement(order = 2)
@ServletComponentScan
@MapperScan("com.cloudht.*.dao")
//排除数据源自动配置
@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class})
@EnableCaching
public class FtcspApplication {
    public static void main(String[] args) {
        SpringApplication.run(FtcspApplication.class, args);
        System.out.println("ヾ(◍°∇°◍)ﾉﾞ    ftcsp启动成功      ヾ(◍°∇°◍)ﾉﾞ\n");
    }
}
