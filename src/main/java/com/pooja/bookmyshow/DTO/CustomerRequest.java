package com.pooja.bookmyshow.DTO;

import lombok.Data;

@Data
public class CustomerRequest {
    private String name;
    private String email;
    private String password;
    private String mobileNo;
}
