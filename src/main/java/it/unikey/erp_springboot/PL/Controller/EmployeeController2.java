package it.unikey.erp_springboot.PL.Controller;

import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;
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
    @ApiOperation(value = "Method to get a list of employee with car as resource")
    @ApiResponses(value = {
            @ApiResponse(code = 200, message = "Done"),
            @ApiResponse(code = 404, message = "List not found")
    })
    public ResponseEntity<List<EmployeeResponseDTO>> getByResourceCar(){
        return new ResponseEntity<>(employeeService.findByResourceCar(), HttpStatus.OK);
    }

}
