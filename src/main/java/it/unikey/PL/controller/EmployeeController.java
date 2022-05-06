package it.unikey.PL.controller;

import it.unikey.BLL.dto.request.EmployeeRequestDTO;
import it.unikey.BLL.dto.response.EmployeeResponseDTO;
import it.unikey.BLL.exception.IdNotFoundException;
import it.unikey.BLL.service.abstraction.EmployeeService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequiredArgsConstructor
@RequestMapping("api/v1/employee")
@CrossOrigin("http://localhost:8080")
public class EmployeeController {

    private final EmployeeService employeeService;

    @PostMapping
    public ResponseEntity<Void> save(@RequestBody EmployeeRequestDTO employeeRequestDTO) {
        employeeService.saveEmployee(employeeRequestDTO);
        return new ResponseEntity<>(HttpStatus.CREATED);
    }

    @GetMapping(path = "/{id}")
    public ResponseEntity<EmployeeResponseDTO> getById(@PathVariable Long id) throws IdNotFoundException {
        return new ResponseEntity<>(employeeService.findById(id), HttpStatus.OK);
    }
}
