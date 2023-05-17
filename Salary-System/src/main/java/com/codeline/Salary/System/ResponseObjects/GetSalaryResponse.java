package com.codeline.Salary.System.ResponseObjects;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class GetSalaryResponse {

    Double amount;

    String currency;

    Double overTimeAmount;

    Double deductions;

    Double healthCareContribution;

    Double allowances;

    Double bonus;

    Double perDiem;
}
