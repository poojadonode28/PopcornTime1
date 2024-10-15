package com.pooja.bookmyshow.Repository;

import com.pooja.bookmyshow.Models.Customer;
import com.pooja.bookmyshow.Models.Movie;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface CustomerRepository extends JpaRepository<Customer, Long> {
    @Override
    Optional<Customer> findById(Long id);

    @Override
    Customer save(Customer customer);

    interface MovieRepository extends JpaRepository<Movie,Long> {

    }
}
