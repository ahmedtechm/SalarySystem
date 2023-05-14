package com.codeline.Salary.System.Controller;

import com.codeline.Salary.System.Models.Employee;
import com.codeline.Salary.System.Models.Salary;
import com.codeline.Salary.System.Service.SalaryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;
import java.util.List;

@RestController
public class SalaryController {

    @Autowired
    SalaryService salaryService;

    @RequestMapping("salary/create")
    public void saveSalary(){
        createSalary();
    }

    @RequestMapping ("salary/get")
    public List<Salary> getSalary (){
        return employeeService.getSalary();
    }

    public void createSalary() {

        Salary salary = new Salary();
        salary.setAmount(450.0);
        salary.setCurrency("Omani Rial");
        salary.setOverTimeAmount(20.0);
        salary.setDeductions(30.0);
        salary.setHealthCareContribution(50.0);
        salary.setAllowances(600.0);
        salary.setCreatedDate(new Date());
        salary.setIsActive(true);
        salaryService.saveSalary(salary);


    }

}

