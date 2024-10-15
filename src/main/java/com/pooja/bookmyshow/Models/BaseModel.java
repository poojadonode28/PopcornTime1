package com.pooja.bookmyshow.Models;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.MappedSuperclass;
import lombok.Data;

import javax.annotation.processing.Generated;

@MappedSuperclass
@Data
public class BaseModel {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
}
