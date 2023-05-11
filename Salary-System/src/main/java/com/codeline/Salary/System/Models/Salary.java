package com.codeline.Salary.System.Models;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Getter
@Setter
@Data
@Entity

public class Salary extends BaseEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    Long id;

    Double amount;

    String currency;

    Double overTimeAmount;

    Double deductions;

    Double healthCareContribution;

    Double allowances;

    Double bonus;

    Double perDiem;
}
