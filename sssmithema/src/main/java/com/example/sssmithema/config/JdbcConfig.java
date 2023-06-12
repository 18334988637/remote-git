package com.example.sssmithema.config;

import com.alibaba.druid.pool.DruidDataSource;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;

import javax.sql.DataSource;

public class JdbcConfig {
    @Value("${driverClassName}")
    private  String driver;
    @Value("${url}")
    private  String url;
    @Value("${username}")
    private  String username;
    @Value("${password}")
    private  String password;


    @Bean
    public DataSource dataSource(){
        DruidDataSource source = new DruidDataSource();
        source.setDriverClassName(driver);
        source.setUrl(url);
        source.setUsername(username);
        source.setPassword(password);
        return  source;
    }
}
