package com.codeline.Salary.System.RequestObjects;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class GetEmployeeRequestObject {

    String name;
    String department;
    String gender;
    String designation;
    Double salary;
    String companyName;
}