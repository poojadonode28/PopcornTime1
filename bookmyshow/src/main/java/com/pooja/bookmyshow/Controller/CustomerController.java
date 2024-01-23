package com.pooja.bookmyshow.Controller;

import com.pooja.bookmyshow.DTO.CustomerRequest;
import com.pooja.bookmyshow.DTO.CustomerResponse;
import com.pooja.bookmyshow.Models.Customer;
import com.pooja.bookmyshow.Services.CustomerService;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path="/bms/v1")
@AllArgsConstructor
public class CustomerController {
    private CustomerService customerService;
    @PostMapping(path="/customer")
    public CustomerResponse createCustomer(@RequestBody CustomerRequest customerRequest){
        Customer customer = customerService.signUp(customerRequest.getName(),customerRequest.getEmail());
        return new CustomerResponse("created");
    }
}
