package com.codeline.Salary.System.RequestObjects;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class GetSalaryRequestObject {
    Double amount;

    String currency;

    Double overTimeAmount;

    Double deductions;

    Double healthCareContribution;

    Double allowances;

    Double bonus;

    Double perDiem;
}
