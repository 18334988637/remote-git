package com.qf.mapper;

import com.qf.service.impl.TUserServiceImpl;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TUserMapperTests {

    @Test
    public void queryAllTUser(){
        ApplicationContext ac = new ClassPathXmlApplicationContext("applicationContext.xml");
        SqlSessionFactory sqfSession =  (SqlSessionFactory)ac.getBean("sessionFactory");
        SqlSession sqlSession = sqfSession.openSession();
        ITUserMapper mapper = sqlSession.getMapper(ITUserMapper.class);
        System.out.println(mapper.queryAllTUser());
    }
}
