package it.unikey.erpspringboot.PL;

import it.unikey.erpspringboot.BLL.dto.Request.FatturaRequestDTO;
import it.unikey.erpspringboot.BLL.dto.Response.FatturaResponseDTO;
import it.unikey.erpspringboot.BLL.service.abstraction.FatturaService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/fattura")
@CrossOrigin("http://localhost:8080")
public class FatturaController {

    private final FatturaService fatturaService;

    @PostMapping
    public ResponseEntity<Void> save(@RequestBody FatturaRequestDTO fatturaRequestDTO){

        try {
            fatturaService.saveFattura(fatturaRequestDTO);
            return new ResponseEntity<>(HttpStatus.CREATED);
        }catch (NullPointerException n){
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }

    @GetMapping(path="/{id}")
    public ResponseEntity<FatturaResponseDTO>  getById(@PathVariable Long id){
        return new ResponseEntity<>(fatturaService.findById(id),HttpStatus.OK);
    }

    @GetMapping
    public ResponseEntity<List<FatturaResponseDTO>>  findAllFattura(){
        return new ResponseEntity<>(fatturaService.findAllFattura(),HttpStatus.OK);
    }

    @PutMapping(path="/{id}")
    public ResponseEntity<Void> deleteFatturaById(@PathVariable Long id){

        try {
            fatturaService.deleteFatturaById(id);
            return new ResponseEntity<>(HttpStatus.OK);
        } catch (NullPointerException n){
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }
}
