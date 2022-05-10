package it.unikey.erpspring.PL.controller;

import it.unikey.erpspring.BLL.DTO.request.CompanyRequestDTO;
import it.unikey.erpspring.BLL.DTO.response.CompanyResponseDTO;
import it.unikey.erpspring.BLL.service.abstraction.CompanyService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/v1/contact")
@CrossOrigin("http://localhost:8080")
public class CompanyController {

    private final CompanyService companyService;

    @PostMapping
    public ResponseEntity<Void> saveCompany(@RequestBody CompanyRequestDTO companyRequestDTO) {
        companyService.saveCompany(companyRequestDTO);
        return new ResponseEntity<>(HttpStatus.CREATED);
    }

    @GetMapping(path = "/{id}")
    public ResponseEntity<CompanyResponseDTO> getById (@PathVariable Long id) {
        return new ResponseEntity<>(companyService.getById(id), HttpStatus.OK);
    }

    @GetMapping
    public ResponseEntity<Integer> getNumberEmployee() {
        return new ResponseEntity<>(companyService.getNumberEmployee(), HttpStatus.OK);
    }




}
