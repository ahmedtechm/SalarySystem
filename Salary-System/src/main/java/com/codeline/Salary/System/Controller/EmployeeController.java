package com.codeline.Salary.System.Controller;

import com.codeline.Salary.System.Models.Account;
import com.codeline.Salary.System.Models.Employee;
import com.codeline.Salary.System.RequestObjects.GetEmployeeRequestObject;
import com.codeline.Salary.System.Service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;
import java.util.List;

@RestController
public class EmployeeController {

    @Autowired
    EmployeeService employeeService;

    @RequestMapping("employee/create")
    public void saveEmployee (@RequestBody GetEmployeeRequestObject employeeRequestObject) {
        createEmployee(employeeRequestObject);
    }

    @RequestMapping("employee/get")
    public List<Employee> getEmployees (){
        return employeeService.getEmployees();
    }


    public void createEmployee(GetEmployeeRequestObject employeeRequestObject) {

        Employee employee = new Employee();
        employee.setName(employeeRequestObject.getName());
        employee.setGender(employeeRequestObject.getGender());
        employee.setDesignation(employeeRequestObject.getDesignation());
        employee.setSalary(employeeRequestObject.getSalary());
        employee.setDepartment(employeeRequestObject.getDepartment());
        employee.setCompanyName(employeeRequestObject.getCompanyName());
        employee.setCreatedDate(new Date());
        employee.setIsActive(true);
        employeeService.saveEmployee(employee);
    }

}
