package com.codeline.Salary.System.Repository;

import com.codeline.Salary.System.Models.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Long>  {
    @Query("SELECT a FROM Employee a WHERE a.department=:nameOfDepartment")
    List<Employee> getEmployeeByDepartment(@Param("nameOfDepartment") String dept);

    @Query("SELECT a FROM Employee a WHERE a.name =:nameOfEmployee")
    List<Employee> getEmployeeByName(@Param("nameOfEmployee") String name);

    @Query("SELECT a FROM Employee a WHERE a.gender =:gender")
    Employee getEmployeeByGender(@Param("gender") String gender);
}