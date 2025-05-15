package com.dms.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Document
public class Registration {
    private String registrationId;
    private String sellerId;
    private String idProofNumber;
    private String idProofType;
    private Date registrationDate;
    private CustomerProfile customerProfile;
    private SetupBox setupBox;
}