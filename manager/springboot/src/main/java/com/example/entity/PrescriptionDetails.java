package com.example.entity;

import lombok.Data;

@Data
public class PrescriptionDetails {
    private static final long serialVersionUID = 1L;
    private Integer id;
    private Integer chargeableItemCategory;
    private String projectCoding;
    private String projectName;
    private Integer unitPrice;
    private Integer quantity;
    private Integer amount;
}
