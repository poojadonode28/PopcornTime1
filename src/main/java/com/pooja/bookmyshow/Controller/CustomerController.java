package com.pooja.bookmyshow.Controller;

import com.pooja.bookmyshow.Controller.Response.CustomerResponse;
import com.pooja.bookmyshow.DTO.CustomerRequest;
import com.pooja.bookmyshow.Models.Customer;
import com.pooja.bookmyshow.Services.CustomerService;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path="/bms/v1")
@AllArgsConstructor
public class CustomerController {
    private CustomerService customerService;
    @PostMapping(path="/signUp")
    public CustomerResponse createCustomer(@RequestBody CustomerRequest customerRequest){
        Customer customer = customerService.signUp(customerRequest);
        return new CustomerResponse(HttpStatus.CREATED,"Congratulations "+ customer.getName()+" your account created successfully",customer);
    }
    @GetMapping(path="/customer/{id}")
    public CustomerResponse getCustomer(@PathVariable Long id) throws Exception {
        Customer customer = customerService.getCustomer(id);
        return new CustomerResponse(HttpStatus.OK,customer);
    }

    @GetMapping(path="/allCustomers")
    public List<Customer> getAllCustomers() throws Exception {
        return customerService.getAllCustomer();
    }
}
