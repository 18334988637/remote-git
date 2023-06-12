package com.qf.controller;

import com.qf.pojo.Movie;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Bean;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("/mvc")

public class TestController {

    @RequestMapping("/test")
    public String test01(){
        System.out.println("=======");
        return "{status:200}";
    }
    private static Map<Integer, Movie> movies;
    public static int id = 6;
    static {
        movies = new HashMap<>();
        Movie movie01 = new Movie(1,"战狼2",new Date(),"1号放映厅",45.9,0);
        Movie movie02 = new Movie(2,"熊出没大电影",new Date(),"5号放映厅",49.9,0);
        Movie movie03 = new Movie(3,"你的名字",new Date(),"2号放映厅",35.9,0);
        Movie movie04 = new Movie(4,"肖申克的救赎",new Date(),"6号放映厅",99.9,0);
        Movie movie05 = new Movie(5,"阿甘正传",new Date(),"8号放映厅",78.9,0);
        movies.put(movie01.getId(),movie01);
        movies.put(movie02.getId(),movie02);
        movies.put(movie03.getId(),movie03);
        movies.put(movie04.getId(),movie04);
        movies.put(movie05.getId(),movie05);
    }

    @GetMapping("/list")
    public Map<Integer, Movie> queryAllMovie(){
        return movies;
    }
}
