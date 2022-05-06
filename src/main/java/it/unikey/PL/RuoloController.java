package it.unikey.PL;

import it.unikey.BLL.mapper.dto.request.RuoloRequestDTO;
import it.unikey.BLL.mapper.dto.response.RuoloResponseDTO;
import it.unikey.BLL.service.abstraction.RuoloService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.persistence.EntityNotFoundException;
import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/v1/ruolo")
@CrossOrigin("http://localhost:8080")
public class RuoloController {

    private final RuoloService ruoloService;

    @PostMapping
    public ResponseEntity<Void> save(@RequestBody RuoloRequestDTO ruoloRequestDTO){
        ruoloService.saveRuolo(ruoloRequestDTO);
        return new ResponseEntity<>(HttpStatus.CREATED);
    }

    @GetMapping(path= "/{id}")      //le graffe indicano una variabile
    public ResponseEntity<RuoloResponseDTO> getById(@PathVariable Long id) {
        try {
            return new ResponseEntity<>(ruoloService.findById(id), HttpStatus.OK);
        } catch (EntityNotFoundException e) {
            e.printStackTrace();
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }

    @PutMapping(path="/{id}")
    public ResponseEntity<Void> delete(@PathVariable Long id){
        try{
            ruoloService.deleteById(id);
            return new ResponseEntity<>(HttpStatus.OK);
        } catch(EntityNotFoundException e){
            e.printStackTrace();
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }

    @GetMapping()
    public ResponseEntity<List<RuoloResponseDTO>> getAll(){
        return new ResponseEntity<>(ruoloService.findAllRuolo(), HttpStatus.OK);
    }
}
