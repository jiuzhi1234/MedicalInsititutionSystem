package com.example.entity;

import lombok.Data;

import java.time.LocalTime;

@Data
public class People {
    private static final long serialVersionUID = 1L;
    private Integer peopleId;
    private Integer type;
    private String id;
    private String name;
    private Integer sex;
    private Integer nationality;
    private Integer birthday;
    private LocalTime workDate;
    private LocalTime retirementDate;
    private Integer retirement;
    private Integer residenceType;
    private Integer residenceAddress;
    private Integer education;
    private Integer politicalStatus;
    private Integer identity;
    private Integer employment;
    private Integer technicalPosition;
    private Integer workerLevel;
    private Integer marriage;
    private Integer administrativePosition;
    private Integer note;
    private Integer companyId;
    private Integer medicalPersonnel;
    private Integer health;
    private Integer modelWorker;
    private Integer cadre;
    private Integer civilServant;
    private Integer authorizedStrength;
    private Integer residentType;
    private Integer flexibleEmployment;
    private Integer migrantWorker;
    private Integer employer;
    private Integer militaryPersonnel;
    private String socialSecurityId;
    private String medinsId;
}
