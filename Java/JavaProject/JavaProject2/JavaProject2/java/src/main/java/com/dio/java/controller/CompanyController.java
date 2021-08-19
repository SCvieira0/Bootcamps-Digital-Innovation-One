package com.dio.java.controller;

import com.dio.java.model.Company;
import com.dio.java.service.CompanyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.NoSuchElementException;

@RestController
@RequestMapping("/company")
public class CompanyController {

    @Autowired
    CompanyService companyService;

    @PostMapping
    public Company createCompany(@RequestBody Company company){
        return companyService.saveCompany(company);
    }

    @PutMapping
    public Company updateCompany(@RequestBody Company company){
        return companyService.updateCompany(company);
    }

    @GetMapping
    public List<Company> getCompanyList(){
        return companyService.findAll();
    }

    @GetMapping("/{idCompany}")
    public ResponseEntity<Company> geCompanyById(@PathVariable("idCompany") Long idCompany) throws Exception{
        return ResponseEntity.ok(companyService.getById(idCompany).orElseThrow(() -> new NoSuchElementException("Not found")));
    }

    @DeleteMapping("/{idCompany}")
    public ResponseEntity<Company> deleteCompanyById(@PathVariable("idCompany") Long idCompany) throws Exception{
        try {
            companyService.deleteCompany(idCompany);
        }catch (Exception e){
            System.out.println(e.getMessage());
        }
        return (ResponseEntity<Company>) ResponseEntity.ok();
    }
}
