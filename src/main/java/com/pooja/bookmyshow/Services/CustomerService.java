package com.pooja.bookmyshow.Services;

import com.pooja.bookmyshow.DTO.CustomerRequest;
import com.pooja.bookmyshow.Models.Customer;
import com.pooja.bookmyshow.Repository.CustomerRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@AllArgsConstructor
public class CustomerService {
    CustomerRepository customerRepository;
    public Customer signUp(CustomerRequest customerRequest){
        Customer customer = new Customer();
        customer.setName(customerRequest.getName());
        customer.setEmail(customerRequest.getEmail());
        customer.setPhoneNo(customerRequest.getMobileNo());
        customerRepository.save(customer);
        return customer;

    }
    public Customer getCustomer(Long id) throws Exception {
        Optional<Customer> customer = customerRepository.findById(id);
        if(customer.isEmpty()){
            throw new Exception("Customer doesn't exist");
        }
        return customer.get();
    }

    public List<Customer> getAllCustomer() throws Exception {
        List<Customer> customers = customerRepository.findAll();
        if(customers.isEmpty()){
            throw new Exception("No customers found");
        }
        return customers;
    }
}
