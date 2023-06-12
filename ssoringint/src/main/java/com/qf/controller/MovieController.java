package com.qf.controller;

import com.qf.pojo.Movie;
import com.qf.service.IMovieService;
import com.qf.service.impl.MovieServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class MovieController {

    @Autowired
    @Qualifier("movieService")
    private IMovieService movieService;

    @RequestMapping("/list")
    public List<Movie> test01(){
        List<Movie> movies = movieService.queryAllMovie();
        System.out.println(movies);
        return movies;
    }
}
