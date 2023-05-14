package com.codeline.Salary.System.Service;

import com.codeline.Salary.System.Models.Account;
import com.codeline.Salary.System.Models.Salary;
import org.springframework.stereotype.Service;

@Service
public class SalaryService {

    public void saveSalary(Salary salary){
        salaryRepository.save(salary);

    }
}
