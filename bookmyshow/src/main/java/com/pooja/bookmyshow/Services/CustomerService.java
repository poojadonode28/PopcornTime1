package com.pooja.bookmyshow.Services;

import com.pooja.bookmyshow.Models.Customer;
import com.pooja.bookmyshow.Repository.CustomerRepository;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class CustomerService {
    CustomerRepository customerRepository;
    public Customer signUp(String name, String email){
        Customer customer = new Customer();
        customer.setName(name);
        customer.setEmail(email);
        customerRepository.save(customer);
        return customer;


    }
}
