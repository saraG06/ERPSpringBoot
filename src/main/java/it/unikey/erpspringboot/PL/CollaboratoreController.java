package it.unikey.erpspringboot.PL;

import it.unikey.erpspringboot.BLL.dto.Request.CollaboratoreRequestDTO;
import it.unikey.erpspringboot.BLL.dto.Response.CollaboratoreResponseDTO;
import it.unikey.erpspringboot.BLL.service.abstraction.CollaboratoreService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/collaboratore")
@CrossOrigin("http://localhost:8080")
public class CollaboratoreController {

    private CollaboratoreService collaboratoreService;

    @PostMapping
    public ResponseEntity<Void> save(@RequestBody CollaboratoreRequestDTO collaboratoreRequestDTO){

        try {
            collaboratoreService.saveCollaboratore(collaboratoreRequestDTO);
            return new ResponseEntity<>(HttpStatus.CREATED);
        }catch (NullPointerException n){
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }

    @GetMapping(path="/{id}")
    public ResponseEntity<CollaboratoreResponseDTO>  getById(@PathVariable Long id){
        return new ResponseEntity<>(collaboratoreService.findById(id),HttpStatus.OK);
    }

    @GetMapping
    public ResponseEntity<List<CollaboratoreResponseDTO>>  findAllCollaboratore(){
        return new ResponseEntity<>(collaboratoreService.findAllCollaboratore(),HttpStatus.OK);
    }

    @PutMapping(path="/{id}")
    public ResponseEntity<Void> deleteCollaboratoreById(@PathVariable Long id){

        try {
            collaboratoreService.deleteCollaboratoreById(id);
            return new ResponseEntity<>(HttpStatus.OK);
        } catch (NullPointerException n){
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }
}
