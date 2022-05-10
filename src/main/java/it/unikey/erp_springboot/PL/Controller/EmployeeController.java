package it.unikey.erp_springboot.PL.Controller;

import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;
import it.unikey.erp_springboot.BLL.dto.request.EmployeeRequestDTO;
import it.unikey.erp_springboot.BLL.dto.response.EmployeeResponseDTO;
import it.unikey.erp_springboot.BLL.service.abstraction.EmployeeService;
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
    @ApiOperation(value = "Method to save an employee")
    @ApiResponses(value = {
            @ApiResponse(code = 201, message = "Created"),
            @ApiResponse(code = 403, message = "Authorization Denied")
    })
    public ResponseEntity<Void> save(@RequestBody EmployeeRequestDTO employeeRequestDTO){
        employeeService.saveEmployee(employeeRequestDTO);
        return new ResponseEntity<>(HttpStatus.CREATED);
    }

    @GetMapping(path = "/{id}")
    @ApiOperation(value = "Method to get an employee")
    @ApiResponses(value = {
            @ApiResponse(code = 200, message = "Done"),
            @ApiResponse(code = 404, message = "Element not found")
    })
    public ResponseEntity<EmployeeResponseDTO> getById(@PathVariable Long id){
        return new ResponseEntity<>(employeeService.findById(id), HttpStatus.OK);
    }

    @DeleteMapping(path = "/{id}")
    @ApiOperation(value = "Method to delete an employee")
    @ApiResponses(value = {
            @ApiResponse(code = 200, message = "Deleted"),
            @ApiResponse(code = 404, message = "Element not found")
    })
    public ResponseEntity<Void> deleteById(@PathVariable Long id){
        employeeService.deleteEmployeeById(id);
        return new ResponseEntity<>(HttpStatus.OK);
    }

    @GetMapping
    @ApiOperation(value = "Method to get a list of employee")
    @ApiResponses(value = {
            @ApiResponse(code = 200, message = "Done"),
            @ApiResponse(code = 404, message = "List not found")
    })
    public ResponseEntity<List<EmployeeResponseDTO>> getAll(){
        return new ResponseEntity<>(employeeService.findAllEmployee(), HttpStatus.OK);
    }

}
