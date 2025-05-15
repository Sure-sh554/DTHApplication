package com.dms.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Document
public class SetupBox {
    private String setupBoxId;
    private String ipAddress;
    private String setBoxType;
    private String software;
    private String version;
    private String status;
}