package com.pooja.bookmyshow.Models;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.Date;
import java.util.List;
@Getter
@Setter
@Entity
public class Booking extends BaseModel{
    @ManyToOne
    private Customer customer;
    @OneToMany
    private List<MovieShowSeat> showSeats;
    @OneToOne
    private MovieShow movieShow;
    private Date bookedAt;
    @Column(nullable=true)
    private int amount;


}
