package com.codeline.Salary.System.ResponseObjects;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor

public class GetEmployeeResponse {
    String name;
    String gender;
    String department;
    Double salary;
}
