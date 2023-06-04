package com.codeline.Salary.System.Service;

import com.codeline.Salary.System.Models.Employee;
import com.codeline.Salary.System.Repository.EmployeeRepository;
import com.codeline.Salary.System.ResponseObjects.GetEmployeeResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class EmployeeService {

    @Autowired
    EmployeeRepository employeeRepository;

    public void saveEmployee(Employee employee) {
        employeeRepository.save(employee);
    }

    public List<Employee> getEmployees() {
        return employeeRepository.findAll();
    }

    public GetEmployeeResponse getEmployeeById(Long employeeId) {
        Optional<Employee> optionalEmployee = employeeRepository.findById(employeeId);
        if (!optionalEmployee.isEmpty()) {
            Employee employee = optionalEmployee.get();
            GetEmployeeResponse employeeResponse = new GetEmployeeResponse(employee.getName(), employee.getGender(), employee.getDepartment(), employee.getSalary());
            return employeeResponse;
        }
        return null;
    }

    //Delete Employee
    public void deleteEmployeeById(Long employeeId) {
        employeeRepository.deleteById(employeeId);
    }

    //=======================================================================//
    public List<Employee> getEmployeesByName(String name) {
        return employeeRepository.getEmployeeByName(name);
    }

    public Employee getEmployeesByGender(String gender) {
        return employeeRepository.getEmployeeByGender(gender);
    }
    public Employee getEmployeesByDesignation(String designation) {
        return employeeRepository.getEmployeeByDesignation(designation);
    }
    public Employee getEmployeesBySalary(Double salary) {
        return employeeRepository.getEmployeeBySalary(salary);
    }
    public List<Employee> getEmployeesByDept(String deptName) {
        return employeeRepository.getEmployeeByDepartment(deptName);
    }
    public Employee getEmployeesByCompanyName(String companyName) {
        return employeeRepository.getEmployeeByCompanyName(companyName);
    }
}
