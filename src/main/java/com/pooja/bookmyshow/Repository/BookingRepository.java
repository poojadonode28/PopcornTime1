package com.pooja.bookmyshow.Repository;

import com.pooja.bookmyshow.Models.Booking;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface BookingRepository  extends JpaRepository<Booking,Long> {


    @Override
    Booking save(Booking booking);

}
