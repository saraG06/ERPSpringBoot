package it.unikey.erpspringboot.PL;

import it.unikey.erpspringboot.BLL.dto.Request.DipendenteRequestDTO;
import it.unikey.erpspringboot.BLL.dto.Response.DipendenteResponseDTO;
import it.unikey.erpspringboot.BLL.service.abstraction.DipendenteService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/dipendente")
@CrossOrigin("http://localhost:8080")
public class DipendenteController {

    private DipendenteService dipendenteService;

    @PostMapping
    public ResponseEntity<Void> save(@RequestBody DipendenteRequestDTO dipendenteRequestDTO){

        try {
            dipendenteService.saveDipendente(dipendenteRequestDTO);
            return new ResponseEntity<>(HttpStatus.CREATED);
        }catch (NullPointerException n){
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }

    @GetMapping(path="/{id}")
    public ResponseEntity<DipendenteResponseDTO>  getById(@PathVariable Long id){
        return new ResponseEntity<>(dipendenteService.findById(id),HttpStatus.OK);
    }

    @GetMapping
    public ResponseEntity<List<DipendenteResponseDTO>>  findAllDipendente(){
        return new ResponseEntity<>(dipendenteService.findAllDipendente(),HttpStatus.OK);
    }

    @PutMapping(path="/{id}")
    public ResponseEntity<Void> deleteDipendenteById(@PathVariable Long id){

        try {
            dipendenteService.deleteDipendenteById(id);
            return new ResponseEntity<>(HttpStatus.OK);
        } catch (NullPointerException n){
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }
}
