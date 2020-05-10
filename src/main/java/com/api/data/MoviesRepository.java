package com.api.data;

import com.api.model.Movies;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;

public interface MoviesRepository extends MongoRepository<Movies, String> {
    List<Movies> findByPlot(String plot);
}
