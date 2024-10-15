package com.pooja.bookmyshow.Services;

import com.pooja.bookmyshow.DTO.BookingRequest;
import com.pooja.bookmyshow.DTO.CustomerRequest;
import com.pooja.bookmyshow.Models.*;
import com.pooja.bookmyshow.Repository.BookingRepository;
import com.pooja.bookmyshow.Repository.CustomerRepository;
import com.pooja.bookmyshow.Repository.MovieShowRepository;
import com.pooja.bookmyshow.Repository.MovieShowSeatRepository;
import lombok.AllArgsConstructor;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Isolation;

import java.util.Date;
import java.util.List;
import java.util.Optional;

@Service
@AllArgsConstructor
public class BookingService {
    //Get the userid
    //get the movieShow
    //check id from db whether available or not
    //check status of seats
    //if available then book
    //save in db
    private MovieShowRepository movieShowRepository;
    private CustomerRepository customerRepository;
    private MovieShowSeatRepository movieShowSeatRepository;
    private  BookingRepository bookingRepository;

    @Transactional(isolation=Isolation.SERIALIZABLE)
    public Booking createBooking(BookingRequest bookingRequest){
        Optional<Customer> customer = customerRepository.findById(bookingRequest.getCustomerId());
        if(customer.isEmpty()){
            throw new IllegalArgumentException("Customer not exist");
        }
        MovieShow movieShow = movieShowRepository.findById(bookingRequest.getShowId()).orElseThrow(()-> new IllegalArgumentException("Customer not found"));
        List<MovieShowSeat> movieShowSeats = movieShowSeatRepository.findAllById(bookingRequest.getSeatIds());
        if(movieShowSeats.size()!=bookingRequest.getSeatIds().size()){
            throw new IllegalArgumentException("All seat Ids not found");
        }
        for(MovieShowSeat movieShowSeat:movieShowSeats){
            if(movieShowSeat.getBookingStatus()!= BookingStatus.AVAILABLE){
                throw new IllegalArgumentException("Something went wrong");
            }
        }
        for(MovieShowSeat movieShowSeat:movieShowSeats){
            movieShowSeat.setBookingStatus(BookingStatus.RESERVED);
            movieShowSeatRepository.save(movieShowSeat);
        }
        Booking booking = new Booking();
        booking.setAmount(0);
        booking.setBookedAt(new Date());
        booking.setShowSeats(movieShowSeats);
        booking.setCustomer(customer.get());
        booking.setMovieShow(movieShow);
        bookingRepository.save(booking);
        return booking;
    }
}
