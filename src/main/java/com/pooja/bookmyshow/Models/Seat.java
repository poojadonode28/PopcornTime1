package com.pooja.bookmyshow.Models;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
public class Seat extends BaseModel{
    @Column(name = "seat_row_number")
    private int rowNumber;
    private int colNumber;
    private SeatType seatType;
}
