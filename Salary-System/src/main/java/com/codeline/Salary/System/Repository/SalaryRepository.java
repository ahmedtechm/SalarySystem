package com.codeline.Salary.System.Repository;

import com.codeline.Salary.System.Models.Account;
import com.codeline.Salary.System.Models.Salary;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SalaryRepository extends JpaRepository<Salary, Long> {
}
