package com.codeline.Salary.System.Controller;

import com.codeline.Salary.System.Models.Salary;
import com.codeline.Salary.System.RequestObjects.GetSalaryRequestObject;
import com.codeline.Salary.System.ResponseObjects.GetSalaryResponse;
import com.codeline.Salary.System.Service.SalaryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;
import java.util.List;

@RestController
@RequestMapping(value = "salary")
public class SalaryController {

    @Autowired
    SalaryService salaryService;

    @RequestMapping("create")
    public void saveSalary(@RequestBody GetSalaryRequestObject salaryRequestObject){
        createSalary(salaryRequestObject);
    }

    @RequestMapping ("get")
    public List<Salary> getSalary (){
        return salaryService.getSalary();
    }
    //Path Variable For Response Object
    @RequestMapping("get/{salaryId}")
    public GetSalaryResponse createSalary(@PathVariable Long salaryId){
        return salaryService.getSalaryById(salaryId);
    }

    //Delete Salary
    @RequestMapping("delete/{Id}")
    public void deleteSalary (@PathVariable Long Id) {
        salaryService.deleteSalaryById(Id);
    }

    public void createSalary(GetSalaryRequestObject salaryRequestObject) {

        Salary salary = new Salary();
        salary.setAmount(salaryRequestObject.getAmount());
        salary.setCurrency(salaryRequestObject.getCurrency());
        salary.setOverTimeAmount(salaryRequestObject.getOverTimeAmount());
        salary.setDeductions(salaryRequestObject.getDeductions());
        salary.setHealthCareContribution(salaryRequestObject.getHealthCareContribution());
        salary.setAllowances(salaryRequestObject.getAllowances());
        salary.setBonus(salaryRequestObject.getBonus());
        salary.setPerDiem(salaryRequestObject.getPerDiem());
        salary.setCreatedDate(new Date());
        salary.setIsActive(true);
        salaryService.saveSalary(salary);


    }

}

