package com.pooja.bookmyshow.DTO;

import lombok.Data;

@Data
public class CustomerResponse {
    private String message;

    public CustomerResponse(String message) {
        this.message = message;
    }
}
