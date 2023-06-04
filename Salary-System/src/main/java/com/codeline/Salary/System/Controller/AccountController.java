package com.codeline.Salary.System.Controller;

import com.codeline.Salary.System.Models.Account;

import com.codeline.Salary.System.RequestObjects.GetAccountRequestObject;
import com.codeline.Salary.System.ResponseObjects.GetAccountResponse;

import com.codeline.Salary.System.Service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;
import java.util.List;

@RequestMapping(value = "account")
@RestController
public class AccountController {
    @Autowired
    AccountService accountService;

    @RequestMapping("create")
    public void saveAccount (@RequestBody GetAccountRequestObject accountRequestObject) {
        createAccount(accountRequestObject);
    }

    @RequestMapping("get")
    public List<Account> getAccounts () {

        return accountService.getAccounts();
    }
    @RequestMapping ("get/{accountId}")
    public GetAccountResponse createAccount (@PathVariable Long accountId){
        return accountService.getAccountById(accountId);
    }

    //Delete Account
    @RequestMapping("delete/{Id}")
    public void deleteAccount (@PathVariable Long Id) {
        accountService.deleteAccountById(Id);
    }


    public void createAccount(GetAccountRequestObject accountRequestObject) {
        Account account = new Account();
        account.setBankName(accountRequestObject.getBankName());
        account.setAccountNumber(accountRequestObject.getAccountNumber());
        account.setBankBranch(accountRequestObject.getBankBranch());
        account.setSwiftCode(accountRequestObject.getSwiftCode());
        account.setAccountHolderName(accountRequestObject.getAccountHolderName());
        account.setAccountType(accountRequestObject.getAccountType());
        account.setBranchCode(accountRequestObject.getBranchCode());
        account.setCreatedDate(new Date());
        account.setIsActive(true);
        accountService.saveAccount(account);
    }
}
