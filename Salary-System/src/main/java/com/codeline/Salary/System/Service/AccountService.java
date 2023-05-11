package com.codeline.Salary.System.Service;

import com.codeline.Salary.System.Models.Account;
import com.codeline.Salary.System.Models.Employee;
import com.codeline.Salary.System.Repository.AccountRepository;
import com.codeline.Salary.System.Repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AccountService {

    @Autowired
    AccountRepository accountRepository;

    public void saveAccount(Account account) {
        accountRepository.save(account);
    }

    }

