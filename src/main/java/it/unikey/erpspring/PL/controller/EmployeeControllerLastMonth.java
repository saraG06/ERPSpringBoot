package it.unikey.erpspring.PL.controller;

import it.unikey.erpspring.BLL.DTO.response.EmployeeResponseDTO;
import it.unikey.erpspring.BLL.service.abstraction.EmployeeService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/v1/employee/lastmonth")
@CrossOrigin("http://localhost:8080")
public class EmployeeControllerLastMonth {

    private final EmployeeService employeeService;

    @GetMapping
    public ResponseEntity<List<EmployeeResponseDTO>> getOperatorsHiredLastMonth(){
        return new ResponseEntity<>(employeeService.getOperatorsHiredLastMonth(), HttpStatus.OK);
    }
}
