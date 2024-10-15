package com.pooja.bookmyshow.Services;

import com.pooja.bookmyshow.DTO.MovieRequest;
import com.pooja.bookmyshow.Models.Movie;
import com.pooja.bookmyshow.Repository.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MovieShowService {

    private CustomerRepository.MovieRepository movieRepository;

    @Autowired
    MovieShowService(CustomerRepository.MovieRepository movieRepository){
        this.movieRepository = movieRepository;
    }

    public Movie createMovie(MovieRequest movieRequest){
        Movie movie = new Movie();
        movie.setDescription(movieRequest.getDescription());
        movie.setName(movieRequest.getName());
        movie.setLanguage(movieRequest.getLanguage());
        movie.setReleaseDate(movieRequest.getReleaseDate());
        movieRepository.save(movie);
        return movie;

    }


}
