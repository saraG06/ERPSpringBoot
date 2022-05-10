package it.unikey.erpspring.PL.controller;

import it.unikey.erpspring.BLL.DTO.request.CollaboratorRequestDTO;
import it.unikey.erpspring.BLL.DTO.response.CollaboratorResponseDTO;
import it.unikey.erpspring.BLL.service.abstraction.CollaboratorService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/v1/collaborator")
@CrossOrigin("http://localhost:8080")
public class CollaboratorController {

    private final CollaboratorService collaboratorService;

    @PostMapping
    public ResponseEntity<Void> save(@RequestBody CollaboratorRequestDTO collaboratorRequestDTO){
        collaboratorService.saveCollaborator(collaboratorRequestDTO);
        return new ResponseEntity<>(HttpStatus.CREATED);
    }

    @GetMapping(path = "/{id}")
    public ResponseEntity<CollaboratorResponseDTO> findById(@PathVariable Long id){
        return new ResponseEntity<>(collaboratorService.findCollaboratorById(id), HttpStatus.OK);
    }

    @GetMapping
    public ResponseEntity<List<CollaboratorResponseDTO>> findAll(){
        return new ResponseEntity<>(collaboratorService.findAllCollaborator(),HttpStatus.OK);
    }

    @DeleteMapping(path = "/{id}")
    public ResponseEntity<Void> delete(@PathVariable Long id){
        collaboratorService.deleteCollaboratorById(id);
        return new ResponseEntity<>(HttpStatus.OK);
    }
}