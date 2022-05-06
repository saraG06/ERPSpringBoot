package it.unikey.erpspring.PL.Controller;


import it.unikey.erpspring.BLL.DTO.request.CollaboratorRequestDTO;
import it.unikey.erpspring.BLL.DTO.response.CollaboratorResponseDTO;
import it.unikey.erpspring.BLL.service.abstraction.CollaboratorService;
import it.unikey.erpspring.BLL.service.exception.EntityNotFoundException;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/v1/collaborator")
@CrossOrigin("http://localhost:8080")
public class CollaboratorController {

    public final CollaboratorService collaboratorService;

    @PostMapping
    public ResponseEntity<Void> save(@RequestBody CollaboratorRequestDTO collaboratorRequestDTO){

        collaboratorService.saveCollaborator(collaboratorRequestDTO);

        return new ResponseEntity<>(HttpStatus.CREATED);
    }

    @GetMapping(path = "/{id}")
    public ResponseEntity<CollaboratorResponseDTO> getById(@PathVariable Long id) {
        try {
            return new ResponseEntity<>(collaboratorService.getCollaboratorById(id), HttpStatus.OK);
        } catch (EntityNotFoundException e) {
            e.printStackTrace();
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }

    }
}