package com.codeline.Salary.System.Service;


import com.codeline.Salary.System.Models.Salary;
import com.codeline.Salary.System.Repository.SalaryRepository;
import com.codeline.Salary.System.ResponseObjects.GetSalaryResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class SalaryService {

    @Autowired
    SalaryRepository salaryRepository;

    public void saveSalary(Salary salary) {
        salaryRepository.save(salary);

    }

    public List<Salary> getSalary() {
        return salaryRepository.findAll();
    }

    public GetSalaryResponse getSalaryById(Long salaryId) {
        Optional<Salary> optionalSalary = salaryRepository.findById(salaryId);
        if (!optionalSalary.isEmpty()) {
            Salary salary = optionalSalary.get();
            GetSalaryResponse salaryResponse = new GetSalaryResponse(salary.getAmount(), salary.getCurrency(), salary.getOverTimeAmount(), salary.getDeductions(), salary.getHealthCareContribution(), salary.getAllowances(), salary.getBonus(), salary.getPerDiem());
            return salaryResponse;
        }
        return null;
    }
    //Delete Salary
    public void deleteSalaryById(Long salaryId) {
        salaryRepository.deleteById(salaryId);
    }
}
