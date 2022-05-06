package it.unikey.PL;

import it.unikey.BLL.mapper.dto.request.CollaboratoreRequestDTO;
import it.unikey.BLL.mapper.dto.response.CollaboratoreResponseDTO;
import it.unikey.BLL.service.abstraction.CollaboratoreService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.persistence.EntityNotFoundException;
import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/v1/collaboratore")
@CrossOrigin("http://localhost:8080")
public class CollaboratoreController {

    private CollaboratoreService collaboratoreService;

    @PostMapping
    public ResponseEntity<Void> save(@RequestBody CollaboratoreRequestDTO collaboratoreRequestDTO){
        collaboratoreService.saveCollaboratore(collaboratoreRequestDTO);
        return new ResponseEntity<>(HttpStatus.CREATED);
    }

    @GetMapping(path= "/{id}")      //le graffe indicano una variabile
    public ResponseEntity<CollaboratoreResponseDTO> getById(@PathVariable Long id) {
        try {
            return new ResponseEntity<>(collaboratoreService.findById(id), HttpStatus.OK);
        } catch (EntityNotFoundException e) {
            e.printStackTrace();
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }

    @DeleteMapping(path="/{id}")
    public ResponseEntity<Void> delete(@PathVariable Long id){
        try{
            collaboratoreService.deleteById(id);
            return new ResponseEntity<>(HttpStatus.OK);
        } catch(EntityNotFoundException e){
            e.printStackTrace();
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }

    @GetMapping()
    public ResponseEntity<List<CollaboratoreResponseDTO>> getAll(){
        return new ResponseEntity<>(collaboratoreService.findAllCollaboratore(), HttpStatus.OK);
    }
}
