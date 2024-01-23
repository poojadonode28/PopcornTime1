package com.pooja.bookmyshow.Repository;

import com.pooja.bookmyshow.Models.MovieShowSeat;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MovieShowSeatRepository extends JpaRepository<MovieShowSeat,Long> {
}
