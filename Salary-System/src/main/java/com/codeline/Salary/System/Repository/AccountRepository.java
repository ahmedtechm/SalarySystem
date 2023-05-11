package com.codeline.Salary.System.Repository;

import com.codeline.Salary.System.Models.Account;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AccountRepository extends JpaRepository<Account, Long>  {
}
