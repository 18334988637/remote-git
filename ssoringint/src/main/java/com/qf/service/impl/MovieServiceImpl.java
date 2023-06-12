package com.qf.service.impl;

import com.qf.mapper.IMovieMapper;
import com.qf.pojo.Movie;
import com.qf.service.IMovieService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Service;

import java.util.List;


@Service("movieService")
public class MovieServiceImpl implements IMovieService {
    @Autowired
    private IMovieMapper movieMapper;

    public void setMovieMapper(IMovieMapper movieMapper) {
        this.movieMapper = movieMapper;
    }

    @Override
    public List<Movie> queryAllMovie() {
        return movieMapper.queryAllMovie();
    }
}
