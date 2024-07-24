package com.example.entity;

import lombok.Data;

import java.time.LocalDate;

@Data
public class PersonnelVisitsInfo {
    private static final long serialVersionUID = 1L;
    private Integer id;
    private String hospitalizationNumber;
    private Integer designatedNumber;
    private Integer medicalCategory;
    private LocalDate admissionDate;
    private LocalDate dischargeDate;
    private Integer diseaseCode;
    private Integer hospitalGrade;
    private Integer admissionCode;
    private Integer diagnosedName;
    private Integer dischargeReason;
    private Boolean settlementFlag;
}
