package it.unikey.erpspring.PL.Controller;


import it.unikey.erpspring.BLL.DTO.request.CompanyRequestDTO;
import it.unikey.erpspring.BLL.DTO.response.CompanyResponseDTO;
import it.unikey.erpspring.BLL.DTO.response.OrderResponseDTO;
import it.unikey.erpspring.BLL.service.abstraction.CompanyService;
import it.unikey.erpspring.BLL.service.exception.EntityNotFoundException;
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

    public final CompanyService companyService;

    @PostMapping
    public ResponseEntity<Void> save(@RequestBody CompanyRequestDTO companyRequestDTO){

        companyService.saveCompany(companyRequestDTO);

        return new ResponseEntity<>(HttpStatus.CREATED);
    }

    @GetMapping(path = "/{id}")
    public ResponseEntity<CompanyResponseDTO> getById(@PathVariable Long id) {
        try {
            return new ResponseEntity<>(companyService.getCompanyById(id), HttpStatus.OK);
        } catch (EntityNotFoundException e) {
            e.printStackTrace();
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }

    }

    @GetMapping
    public ResponseEntity<List<CompanyResponseDTO>> getAll(){

        return new ResponseEntity<>(companyService.getAllCompany(), HttpStatus.OK);

    }

    @DeleteMapping(path = "/{id}")
    public ResponseEntity<Void> deleteById(@PathVariable Long id) {
        try {
            companyService.deleteCompanyById(id);
            return new ResponseEntity<>(HttpStatus.OK);
        } catch (EntityNotFoundException e) {
            e.printStackTrace();
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }
}
