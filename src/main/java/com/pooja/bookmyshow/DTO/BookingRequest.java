package com.pooja.bookmyshow.DTO;

import lombok.Data;

import java.util.List;

@Data
public class BookingRequest {
    private Long customerId;
    private Long showId;
    private List<Long> seatIds;

}
