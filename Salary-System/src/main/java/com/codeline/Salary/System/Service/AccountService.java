package com.codeline.Salary.System.Service;

import com.codeline.Salary.System.Models.Account;

import com.codeline.Salary.System.Repository.AccountRepository;

import com.codeline.Salary.System.ResponseObjects.GetAccountResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class AccountService {

    @Autowired
    AccountRepository accountRepository;

    public void saveAccount(Account account) {
        accountRepository.save(account);
    }

    public List<Account> getAccounts() {
        return accountRepository.findAll();
    }


    public GetAccountResponse getAccountById(Long accountId) {
        Optional<Account> optionalAccount = accountRepository.findById(accountId);
        if (!optionalAccount.isEmpty()) {
            Account account = optionalAccount.get();
            GetAccountResponse accountResponse = new GetAccountResponse(account.getBankName(), account.getAccountNumber(), account.getBankBranch(), account.getSwiftCode(), account.getAccountHolderName(), account.getAccountType(), account.getBranchCode());
            return accountResponse;
        }
        return null;
    }

    //Delete Account
    public void deleteAccountById(Long accountId) {
        accountRepository.deleteById(accountId);
    }
}


