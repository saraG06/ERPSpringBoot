package it.unikey.PL.controller;

import it.unikey.BLL.dto.request.CompanyRequestDTO;
import it.unikey.BLL.dto.response.CompanyResponseDTO;
import it.unikey.BLL.exception.IdNotFoundException;
import it.unikey.BLL.service.abstraction.CompanyService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequiredArgsConstructor
@RequestMapping("api/v1/company")
@CrossOrigin("http://localhost:8080")
public class CompanyController {

    private final CompanyService companyService;

    @PostMapping
    public ResponseEntity<Void> save(@RequestBody CompanyRequestDTO companyRequestDTO) {
        companyService.saveCompany(companyRequestDTO);
        return new ResponseEntity<>(HttpStatus.CREATED);
    }

    @GetMapping(path = "/{id}")
    public ResponseEntity<CompanyResponseDTO> getById(@PathVariable Long id) throws IdNotFoundException {
        return new ResponseEntity<>(companyService.findById(id), HttpStatus.OK);

    }
}
