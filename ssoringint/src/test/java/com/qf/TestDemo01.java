package com.qf;

import com.qf.mapper.ITUserMapper;
import com.qf.pojo.Movie;
import com.qf.service.IMovieService;
import com.qf.service.impl.MovieServiceImpl;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.GenericApplicationContext;

import java.util.List;

public class TestDemo01 {

    @Test
    public void test01(){
        ApplicationContext ac = new ClassPathXmlApplicationContext("applicationContext.xml");
        System.out.println(ac.getClass().getSimpleName());
    }

    @Test
    public void test02(){
        ApplicationContext ac = new ClassPathXmlApplicationContext("applicationContext.xml");
        SqlSessionFactory sqfSession =  (SqlSessionFactory)ac.getBean("sessionFactory");
        System.out.println(sqfSession);
    }

    @Test
    public void test03(){
        ApplicationContext ac = new ClassPathXmlApplicationContext("applicationContext.xml");
        IMovieService movieService = (IMovieService)ac.getBean("movieService");
        List<Movie> movies = movieService.queryAllMovie();
        for (Movie movie : movies) {
            System.out.println(movie);
        }
    }

    @Test
    public void test04(){
        ApplicationContext ac = new ClassPathXmlApplicationContext("applicationContext.xml");
        SqlSessionFactory sqfSession =  (SqlSessionFactory)ac.getBean("sessionFactory");
        SqlSession sqlSession = sqfSession.openSession();
        ITUserMapper mapper = sqlSession.getMapper(ITUserMapper.class);
        System.out.println(mapper.queryAllTUser());
    }
}
