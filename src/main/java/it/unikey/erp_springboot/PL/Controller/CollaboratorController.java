package it.unikey.erp_springboot.PL.Controller;

import it.unikey.erp_springboot.BLL.dto.request.CollaboratorRequestDTO;
import it.unikey.erp_springboot.BLL.dto.response.CollaboratorResponseDTO;
import it.unikey.erp_springboot.BLL.service.abstraction.CollaboratorService;
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
    public ResponseEntity<CollaboratorResponseDTO> getById(@PathVariable Long id){
        return new ResponseEntity<>(collaboratorService.findById(id), HttpStatus.OK);
    }

    @DeleteMapping(path = "/{id}")
    public ResponseEntity<Void> deleteById(@PathVariable Long id){
        collaboratorService.deleteCollaboratorById(id);
        return new ResponseEntity<>(HttpStatus.OK);
    }

    @GetMapping
    public ResponseEntity<List<CollaboratorResponseDTO>> getAll(){
        return new ResponseEntity<>(collaboratorService.findAllCollaborator(), HttpStatus.OK);
    }

}
