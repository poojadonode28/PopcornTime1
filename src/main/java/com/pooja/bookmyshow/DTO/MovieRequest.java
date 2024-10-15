package com.pooja.bookmyshow.DTO;

import lombok.Data;

import java.util.Date;

@Data
public class MovieRequest {

    private String description;
    private String language;
    private String name;
    private Date releaseDate;
}
