package com.example.sssmithema.config;

import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.mybatis.spring.mapper.MapperScannerConfigurer;

import javax.sql.DataSource;

public class MybatisConfig {

    public SqlSessionFactoryBean sqlSessionFactory(DataSource dataSource){
        SqlSessionFactoryBean factoryBean = new SqlSessionFactoryBean();
        factoryBean.setDataSource(dataSource);
        factoryBean.setTypeAliasesPackage("com.example.sssmithema.domain");
        return  factoryBean;
    }

    public MapperScannerConfigurer mapperScannerConfigurer(){
        MapperScannerConfigurer mapperScannerConfigurer = new MapperScannerConfigurer();
  mapperScannerConfigurer.setBasePackage("com.example.sssmithema.dao");
   return mapperScannerConfigurer;
    }


}
