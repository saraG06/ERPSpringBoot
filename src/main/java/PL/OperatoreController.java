package PL;

import BLL.mapper.dto.request.FatturaRequestDTO;
import BLL.mapper.dto.request.OperatoreRequestDTO;
import BLL.mapper.dto.response.FatturaResponseDTO;
import BLL.mapper.dto.response.OperatoreResponseDTO;
import BLL.service.abstraction.OperatoreService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.persistence.EntityNotFoundException;
import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/v1/operatore")
@CrossOrigin("http://localhost:8080")
public class OperatoreController {

    private OperatoreService operatoreService;

    @PostMapping
    public ResponseEntity<Void> save(@RequestBody OperatoreRequestDTO operatoreRequestDTO){
        operatoreService.saveOperatore(operatoreRequestDTO);
        return new ResponseEntity<>(HttpStatus.CREATED);
    }

    @GetMapping(path= "/{id}")      //le graffe indicano una variabile
    public ResponseEntity<OperatoreResponseDTO> getById(@PathVariable Long id) {
        try {
            return new ResponseEntity<>(operatoreService.findById(id), HttpStatus.OK);
        } catch (EntityNotFoundException e) {
            e.printStackTrace();
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }

    @DeleteMapping(path="/{id}")
    public ResponseEntity<Void> delete(@PathVariable Long id){
        try{
            operatoreService.deleteById(id);
            return new ResponseEntity<>(HttpStatus.OK);
        } catch(EntityNotFoundException e){
            e.printStackTrace();
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }

    @GetMapping()
    public ResponseEntity<List<OperatoreResponseDTO>> getAll(){
        return new ResponseEntity<>(operatoreService.findAllOperatore(), HttpStatus.OK);
    }

    @GetMapping()
    public ResponseEntity<List<OperatoreResponseDTO>> getDipendentiMacchina(){
        return new ResponseEntity<>(operatoreService.findDipendentiMacchina(), HttpStatus.OK);
    }

    @GetMapping()
    public ResponseEntity<Long> getContaOperatori(){
        return new ResponseEntity<>(operatoreService.contaOperatori(), HttpStatus.OK);
    }
}
