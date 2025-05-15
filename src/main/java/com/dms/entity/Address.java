package com.dms.entity;

import lombok.*;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Document
public class Address {
    @Id
    private String addressId;
    private String houseNumber;
    private String street;
    private String city;
    private String state;
    private String country;
    private int pincode;
}