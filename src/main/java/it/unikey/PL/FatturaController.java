package it.unikey.PL;

import it.unikey.BLL.mapper.dto.request.ContattoRequestDTO;
import it.unikey.BLL.mapper.dto.request.FatturaRequestDTO;
import it.unikey.BLL.mapper.dto.response.FatturaResponseDTO;
import it.unikey.BLL.service.abstraction.FatturaService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.persistence.EntityNotFoundException;
import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/v1/fattura")
@CrossOrigin("http://localhost:8080")
public class FatturaController {

    private FatturaService fatturaService;

    @PostMapping
    public ResponseEntity<Void> save(@RequestBody FatturaRequestDTO fatturaRequestDTO){
        fatturaService.saveFattura(fatturaRequestDTO);
        return new ResponseEntity<>(HttpStatus.CREATED);
    }

    @GetMapping(path= "/{id}")      //le graffe indicano una variabile
    public ResponseEntity<FatturaResponseDTO> getById(@PathVariable Long id) {
        try {
            return new ResponseEntity<>(fatturaService.findById(id), HttpStatus.OK);
        } catch (EntityNotFoundException e) {
            e.printStackTrace();
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }

    @DeleteMapping(path="/{id}")
    public ResponseEntity<Void> delete(@PathVariable Long id){
        try{
            fatturaService.deleteById(id);
            return new ResponseEntity<>(HttpStatus.OK);
        } catch(EntityNotFoundException e){
            e.printStackTrace();
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }

    @GetMapping()
    public ResponseEntity<List<FatturaResponseDTO>> getAll(){
        return new ResponseEntity<>(fatturaService.findAllFattura(), HttpStatus.OK);
    }

    @GetMapping()
    public ResponseEntity<List<FatturaResponseDTO>> getAfter31122019(){
        return new ResponseEntity<>(fatturaService.findAfter31122019(), HttpStatus.OK);
    }

    @GetMapping()
    public ResponseEntity<List<FatturaResponseDTO>> getFattureReply(){
        return new ResponseEntity<>(fatturaService.findFattureReply(), HttpStatus.OK);
    }

    @GetMapping()
    public ResponseEntity<List<FatturaResponseDTO>> getAllFatturaContatto(ContattoRequestDTO contattoRequestDTO){
        return new ResponseEntity<>(fatturaService.findAllFatturaContatto(contattoRequestDTO), HttpStatus.OK);
    }
}
