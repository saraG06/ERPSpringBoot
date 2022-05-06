package it.unikey.ERPSpringBoot.Controller;

import it.unikey.ERPSpringBoot.BLL.dto.request.EmployeeRequestDto;
import it.unikey.ERPSpringBoot.BLL.dto.response.EmployeeResponseDto;
import it.unikey.ERPSpringBoot.BLL.service.abstraction.EmployeeService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController //dice a spring ..
@RequiredArgsConstructor //per lombok
@RequestMapping("/api/v1/employee")
@CrossOrigin("http://localhost:8080")
public class EmployeeController {

    private final EmployeeService employeeService;

    @PostMapping
    public ResponseEntity<Void> save (@RequestBody EmployeeRequestDto employeeRequestDto){
        employeeService.save(employeeRequestDto);
        return new ResponseEntity<>(HttpStatus.CREATED);
    }

    @GetMapping(path = "/{id}")
    public ResponseEntity<EmployeeResponseDto> getById(@PathVariable Long id){
        return new ResponseEntity<>(employeeService.findById(id), HttpStatus.OK);
    }
}
