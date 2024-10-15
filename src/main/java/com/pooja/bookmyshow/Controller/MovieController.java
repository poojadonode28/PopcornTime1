package com.pooja.bookmyshow.Controller;

import com.pooja.bookmyshow.Controller.Response.CustomerResponse;
import com.pooja.bookmyshow.DTO.CustomerRequest;
import com.pooja.bookmyshow.DTO.MovieRequest;
import com.pooja.bookmyshow.Models.Customer;
import com.pooja.bookmyshow.Models.Movie;
import com.pooja.bookmyshow.Services.MovieShowService;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path="/bms/v1")
public class MovieController {

    private MovieShowService movieShowService;
    @Autowired
    MovieController(MovieShowService movieShowService){
        this.movieShowService = movieShowService;
    }

    @PostMapping(path="/movie")
    public String createMovie(@RequestBody MovieRequest movieRequest){
        Movie movie = movieShowService.createMovie(movieRequest);
        return "Movie released!";
    }

}
