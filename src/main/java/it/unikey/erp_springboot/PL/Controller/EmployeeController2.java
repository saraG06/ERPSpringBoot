package it.unikey.erp_springboot.PL.Controller;

import it.unikey.erp_springboot.BLL.dto.request.CompanyRequestDTO;
import it.unikey.erp_springboot.BLL.dto.response.EmployeeResponseDTO;
import it.unikey.erp_springboot.BLL.service.abstraction.EmployeeService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/v1/employee_2")
@CrossOrigin("http://localhost:8080")
public class EmployeeController2 {

    private final EmployeeService employeeService;

    @GetMapping
    public ResponseEntity<List<EmployeeResponseDTO>> getByResourceCar(){
        return new ResponseEntity<>(employeeService.findByResourceCar(), HttpStatus.OK);
    }

}
