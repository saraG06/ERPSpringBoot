package PL;

import BLL.mapper.dto.request.DipendenteRequestDTO;
import BLL.mapper.dto.request.OrdineRequestDTO;
import BLL.mapper.dto.request.RisorsaRequestDTO;
import BLL.mapper.dto.response.OrdineResponseDTO;
import BLL.mapper.dto.response.RisorsaResponseDTO;
import BLL.service.abstraction.RisorsaService;
import DAL.Entity.Dipendente;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.persistence.EntityNotFoundException;
import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/v1/risorsa")
@CrossOrigin("http://localhost:8080")
public class RisorsaController {

    private RisorsaService risorsaService;

    @PostMapping
    public ResponseEntity<Void> save(@RequestBody RisorsaRequestDTO risorsaRequestDTO){
        risorsaService.saveRisorsa(risorsaRequestDTO);
        return new ResponseEntity<>(HttpStatus.CREATED);
    }

    @GetMapping(path= "/{id}")      //le graffe indicano una variabile
    public ResponseEntity<RisorsaResponseDTO> getById(@PathVariable Long id) {
        try {
            return new ResponseEntity<>(risorsaService.findById(id), HttpStatus.OK);
        } catch (EntityNotFoundException e) {
            e.printStackTrace();
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }

    @DeleteMapping(path="/{id}")
    public ResponseEntity<Void> delete(@PathVariable Long id){
        try{
            risorsaService.deleteById(id);
            return new ResponseEntity<>(HttpStatus.OK);
        } catch(EntityNotFoundException e){
            e.printStackTrace();
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }

    @GetMapping()
    public ResponseEntity<List<RisorsaResponseDTO>> getAll(){
        return new ResponseEntity<>(risorsaService.findAllRisorsa(), HttpStatus.OK);
    }

    @PostMapping
    public ResponseEntity<Void> assegnaRisorsa(DipendenteRequestDTO capo, DipendenteRequestDTO dip, @RequestBody RisorsaRequestDTO risorsaRequestDTO){
        risorsaService.assegnaRisorsa(capo, dip, risorsaRequestDTO);
        return new ResponseEntity<>(HttpStatus.CREATED);
    }
}
