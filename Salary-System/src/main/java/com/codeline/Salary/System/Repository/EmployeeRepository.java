package com.codeline.Salary.System.Repository;

import com.codeline.Salary.System.Models.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Long>  {

}
