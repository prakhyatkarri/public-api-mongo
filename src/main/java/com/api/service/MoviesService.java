package com.api.service;

import com.api.data.MoviesRepository;
import com.api.model.Movies;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MoviesService {

    @Autowired
    private MongoTemplate mongoTemplate;

    @Autowired
    private MoviesRepository moviesRepository;

    public List<Movies> getMoviesList() {
        List<Movies> list = moviesRepository.findByPlot("Three men hammer on an anvil and pass a bottle of beer around.");
        list = moviesRepository.findAll();
        return list;
    }
}
