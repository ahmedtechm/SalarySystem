package com.codeline.Salary.System.Controller;

import com.codeline.Salary.System.Models.Account;
import com.codeline.Salary.System.Models.Employee;
import com.codeline.Salary.System.Service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;
import java.util.List;

@RestController
public class EmployeeController {

    @Autowired
    EmployeeService employeeService;

    @RequestMapping("employee/create")
    public void saveEmployee () {
        createEmployee();
    }

    @RequestMapping("employee/get")
    public List<Employee> getEmployee (){
        return employeeService.getEmployees();
    }


    public void createEmployee() {

        Employee employee = new Employee();
        employee.setName("AHMED");
        employee.setGender("Male");
        employee.setDesignation("QA Testing");
        employee.setSalary(650.0);
        employee.setDepartment("Information Technology");
        employee.setCompanyName("TechM");
        employee.setCreatedDate(new Date());
        employee.setIsActive(true);
        employeeService.saveEmployee(employee);
    }

}
