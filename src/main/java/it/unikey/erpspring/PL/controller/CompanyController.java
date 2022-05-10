package it.unikey.erpspring.PL.controller;


import it.unikey.erpspring.BLL.DTO.request.CompanyRequestDTO;
import it.unikey.erpspring.BLL.DTO.response.CompanyResponseDTO;
import it.unikey.erpspring.BLL.service.abstraction.CompanyService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/v1/company")
@CrossOrigin("http://localhost:8080")
public class CompanyController {

    private final CompanyService companyService;

    @PostMapping
    public ResponseEntity<Void> save(@RequestBody CompanyRequestDTO companyRequestDTO){
        companyService.saveCompany(companyRequestDTO);
        return new ResponseEntity<>(HttpStatus.CREATED);
    }

    @GetMapping(path = "/{id}")
    public ResponseEntity<CompanyResponseDTO> findById(@PathVariable Long id){
        return new ResponseEntity<>(companyService.findCompanyById(id), HttpStatus.OK);
    }

    @GetMapping
    public ResponseEntity<List<CompanyResponseDTO>> findAll(){
        return new ResponseEntity<>(companyService.findAllCompany(), HttpStatus.OK);
    }

    @DeleteMapping(path = "/{id}")
    public ResponseEntity<Void> delete(@PathVariable Long id){
        companyService.deleteCompanyById(id);
        return new ResponseEntity<>(HttpStatus.OK);
    }
}
