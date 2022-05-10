package it.unikey.erpspring.PL.controller;

import it.unikey.erpspring.BLL.DTO.request.EmployeeRequestDTO;
import it.unikey.erpspring.BLL.DTO.request.ResourceRequestDTO;
import it.unikey.erpspring.BLL.DTO.response.ResourceResponseDTO;
import it.unikey.erpspring.BLL.service.abstraction.ResourceService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/v1/resource/assign")
@CrossOrigin("http://localhost:8080")
public class ResouceControllerAssign {

    private final ResourceService resourceService;

    @PostMapping
    public ResponseEntity<Void> assignResource(@RequestBody EmployeeRequestDTO one,@RequestBody EmployeeRequestDTO two,@RequestBody ResourceRequestDTO resource){
        resourceService.assignResource(one,two,resource);
        return new ResponseEntity<>(HttpStatus.CREATED);
    }
}
