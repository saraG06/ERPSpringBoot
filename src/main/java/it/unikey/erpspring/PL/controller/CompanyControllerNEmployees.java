package it.unikey.erpspring.PL.controller;

import it.unikey.erpspring.BLL.service.abstraction.CompanyService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/v1/company/nemployees")
@CrossOrigin("http://localhost:8080")
public class CompanyControllerNEmployees {

    private final CompanyService companyService;

    @GetMapping
    public ResponseEntity<Integer> findNumberOfEmployees(){
        return new ResponseEntity<>(companyService.findNumberOfEmployees(), HttpStatus.OK);
    }
}
