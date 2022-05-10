package it.unikey.erpspring.PL.controller;

import it.unikey.erpspring.BLL.DTO.request.EmployeeRequestDTO;
import it.unikey.erpspring.BLL.DTO.request.ResourceRequestDTO;
import it.unikey.erpspring.BLL.DTO.response.ResourceResponseDTO;
import it.unikey.erpspring.BLL.service.abstraction.ResourceService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/v1/resource")
@CrossOrigin("http://localhost:8080")
public class ResourceController {

    private final ResourceService resourceService;

    @PostMapping
    public ResponseEntity<Void> save(@RequestBody ResourceRequestDTO resourceRequestDTO){
        resourceService.saveResource(resourceRequestDTO);
        return new ResponseEntity<>(HttpStatus.CREATED);
    }

    @GetMapping(path = "/{id}")
    public ResponseEntity<ResourceResponseDTO> findById(@PathVariable Long id){
        return new ResponseEntity<>(resourceService.findResourceById(id), HttpStatus.OK);
    }

    @GetMapping
    public ResponseEntity<List<ResourceResponseDTO>> findAll(){
        return new ResponseEntity<>(resourceService.findAllResource(), HttpStatus.OK);
    }

    @DeleteMapping(path = "/{id}")
    public ResponseEntity<Void> delete(@PathVariable Long id){
        resourceService.deleteResourceById(id);
        return new ResponseEntity<>(HttpStatus.OK);
    }


}
