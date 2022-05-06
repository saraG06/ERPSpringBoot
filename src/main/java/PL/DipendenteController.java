package PL;

import BLL.mapper.dto.request.ContattoRequestDTO;
import BLL.mapper.dto.request.DipendenteRequestDTO;
import BLL.mapper.dto.response.ContattoResponseDTO;
import BLL.mapper.dto.response.DipendenteResponseDTO;
import BLL.service.abstraction.DipendenteService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.persistence.EntityNotFoundException;
import java.time.LocalDate;
import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/v1/dipendente")
@CrossOrigin("http://localhost:8080")
public class DipendenteController {

    private DipendenteService dipendenteService;

    @PostMapping
    public ResponseEntity<Void> save(@RequestBody DipendenteRequestDTO dipendenteRequestDTO){
        dipendenteService.saveDipendente(dipendenteRequestDTO);
        return new ResponseEntity<>(HttpStatus.CREATED);
    }

    @GetMapping(path= "/{id}")      //le graffe indicano una variabile
    public ResponseEntity<DipendenteResponseDTO> getById(@PathVariable Long id) {
        try {
            return new ResponseEntity<>(dipendenteService.findById(id), HttpStatus.OK);
        } catch (EntityNotFoundException e) {
            e.printStackTrace();
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }

    @DeleteMapping(path="/{id}")
    public ResponseEntity<Void> delete(@PathVariable Long id){
        try{
            dipendenteService.deleteById(id);
            return new ResponseEntity<>(HttpStatus.OK);
        } catch(EntityNotFoundException e){
            e.printStackTrace();
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }

    @GetMapping()
    public ResponseEntity<List<DipendenteResponseDTO>> getAll(){
        return new ResponseEntity<>(dipendenteService.findAllDipendente(), HttpStatus.OK);
    }

    @GetMapping(path="/{now}")
    public ResponseEntity<List<DipendenteResponseDTO>> getUltimiDipendentiAssunti(@PathVariable LocalDate now){
        return new ResponseEntity<>(dipendenteService.ultimiDipendentiAssunti(now), HttpStatus.OK);
    }

    @GetMapping(path="/{now}")
    public ResponseEntity<List<DipendenteResponseDTO>> getDipendentiConMacchina(){
        return new ResponseEntity<>(dipendenteService.dipendentiConMacchina(), HttpStatus.OK);
    }

}
