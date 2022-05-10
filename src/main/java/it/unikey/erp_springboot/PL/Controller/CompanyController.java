package it.unikey.erp_springboot.PL.Controller;

import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;
import it.unikey.erp_springboot.BLL.dto.request.CompanyRequestDTO;
import it.unikey.erp_springboot.BLL.dto.response.CompanyResponseDTO;
import it.unikey.erp_springboot.BLL.service.abstraction.CompanyService;
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
    @ApiOperation(value = "Method to save a company")
    @ApiResponses(value = {
            @ApiResponse(code = 201, message = "Created"),
            @ApiResponse(code = 403, message = "Authorization Denied")
    })
    public ResponseEntity<Void> save(@RequestBody CompanyRequestDTO companyRequestDTO){
        companyService.saveCompany(companyRequestDTO);
        return new ResponseEntity<>(HttpStatus.CREATED);
    }

    @GetMapping(path = "/{id}")
    @ApiOperation(value = "Method to get a company")
    @ApiResponses(value = {
            @ApiResponse(code = 200, message = "Done"),
            @ApiResponse(code = 404, message = "Element not found")
    })
    public ResponseEntity<CompanyResponseDTO> getById(@PathVariable Long id){
        return new ResponseEntity<>(companyService.findById(id), HttpStatus.OK);
    }

    @DeleteMapping(path = "/{id}")
    @ApiOperation(value = "Method to delete a company")
    @ApiResponses(value = {
            @ApiResponse(code = 200, message = "Deleted"),
            @ApiResponse(code = 404, message = "Element not found")
    })
    public ResponseEntity<Void> deleteById(@PathVariable Long id){
        companyService.deleteCompanyById(id);
        return new ResponseEntity<>(HttpStatus.OK);
    }

    @GetMapping
    @ApiOperation(value = "Method to get a list of company")
    @ApiResponses(value = {
            @ApiResponse(code = 200, message = "Done"),
            @ApiResponse(code = 404, message = "List not found")
    })
    public ResponseEntity<List<CompanyResponseDTO>> getAll(){
        return new ResponseEntity<>(companyService.findAllCompany(), HttpStatus.OK);
    }


}
