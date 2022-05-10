package it.unikey.erpspring.PL.controller;

import it.unikey.erpspring.BLL.DTO.request.EmployeeRequestDTO;
import it.unikey.erpspring.BLL.DTO.response.EmployeeResponseDTO;
import it.unikey.erpspring.BLL.service.abstraction.EmployeeService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/v1/employee")
@CrossOrigin("http://localhost:8080")
public class EmployeeController {

    private final EmployeeService employeeService;

    @PostMapping
    public ResponseEntity<Void> save(@RequestBody EmployeeRequestDTO employeeRequestDTO){
        employeeService.saveEmployee(employeeRequestDTO);
        return new ResponseEntity<>(HttpStatus.CREATED);
    }

    @GetMapping(path = "/{id}")
    public ResponseEntity<EmployeeResponseDTO> findById(@PathVariable Long id){
        return new ResponseEntity<>(employeeService.findEmployeeById(id), HttpStatus.OK);
    }

    @GetMapping
    public ResponseEntity<List<EmployeeResponseDTO>> findAll(){
        return new ResponseEntity<>(employeeService.findAllEmployee(), HttpStatus.OK);
    }

    @DeleteMapping(path = "/{id}")
    public ResponseEntity<Void> delete(@PathVariable Long id){
        employeeService.deleteEmployeeById(id);
        return new ResponseEntity<>(HttpStatus.OK);
    }
}
