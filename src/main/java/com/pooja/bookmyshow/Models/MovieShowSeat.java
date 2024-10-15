package com.pooja.bookmyshow.Models;

import jakarta.persistence.Entity;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
public class MovieShowSeat extends BaseModel{
    @ManyToOne
    private MovieShow movieShow;
    @ManyToOne
    private Seat seat;
    private BookingStatus bookingStatus;
}
