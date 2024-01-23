package com.pooja.bookmyshow.Controller;

import com.pooja.bookmyshow.DTO.BookingRequest;
import com.pooja.bookmyshow.DTO.BookingResponse;
import com.pooja.bookmyshow.Models.Booking;
import com.pooja.bookmyshow.Services.BookingService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path="/bms/v1")
@AllArgsConstructor
public class BookingController {

    private BookingService bookingService;


    @PostMapping(path="/booking")
    public BookingResponse createBooking(@RequestBody BookingRequest bookingRequest){
        Booking booking=bookingService.createBooking(bookingRequest.getCustomerId(),bookingRequest.getShowId(),bookingRequest.getSeatIds());
        return new BookingResponse("SUCCESS");
    }
}
