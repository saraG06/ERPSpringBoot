package it.unikey.PL.controller;

import it.unikey.BLL.dto.request.CollaboratorRequestDTO;
import it.unikey.BLL.dto.response.CollaboratorResponseDTO;
import it.unikey.BLL.exception.IdNotFoundException;
import it.unikey.BLL.service.abstraction.CollaboratorService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequiredArgsConstructor
@RequestMapping("api/v1/collaborator")
@CrossOrigin("http://localhost:8080")
public class CollaboratorController {
    private final CollaboratorService collaboratorService;
    @PostMapping
    public ResponseEntity<Void> save(@RequestBody CollaboratorRequestDTO clientRequestDTO){
        collaboratorService.saveCollaborator(clientRequestDTO);
        return new ResponseEntity<>(HttpStatus.CREATED);
    }
    @GetMapping(path="/{id}")
    public ResponseEntity<CollaboratorResponseDTO> getById(@PathVariable Long id) throws IdNotFoundException {
        return new ResponseEntity<>(collaboratorService.findById(id),HttpStatus.OK);

    }
}
