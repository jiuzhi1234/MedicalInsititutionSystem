package com.example.entity;

import lombok.Data;

@Data
public class Medicine {
    private static final long serialVersionUID = 1L;
    private Integer id;
    private String name;
    private String expType;
    private String expLevel;
    private String measurement;
    private Integer maxPrize;
    private Boolean approvalMark;
    private String hosLevel;
    private String size;
    private String tradeName;
    private String startTime;
    private String endTime;
    private Boolean valid;
    private Boolean specialMark;
}
