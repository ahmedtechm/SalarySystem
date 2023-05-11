package com.codeline.Salary.System.Service;

import com.codeline.Salary.System.Models.Employee;
import com.codeline.Salary.System.Repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EmployeeService {

    @Autowired
    EmployeeRepository employeeRepository;

    public void saveEmployee(Employee employee) {
        employeeRepository.save(employee);
    }
}
