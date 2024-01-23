package com.pooja.bookmyshow.Models;

import jakarta.persistence.Entity;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
public class Seat extends BaseModel{
    private int rowNumber;
    private int colNumber;
    private SeatType seatType;
}
