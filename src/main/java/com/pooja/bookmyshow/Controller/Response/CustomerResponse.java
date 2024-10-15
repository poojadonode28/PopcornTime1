package com.pooja.bookmyshow.Controller.Response;

import com.pooja.bookmyshow.Models.Customer;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.http.HttpStatus;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class CustomerResponse {
        private HttpStatus status;
        private String message;
        private Customer customer;

        public CustomerResponse(HttpStatus httpStatus, Customer customer) {
                this.status = httpStatus;
                this.customer = customer;
        }
}
