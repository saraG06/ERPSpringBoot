package it.unikey.erpspringboot.PL;

import it.unikey.erpspringboot.BLL.dto.Request.RisorsaRequestDTO;
import it.unikey.erpspringboot.BLL.dto.Response.RisorsaResponseDTO;
import it.unikey.erpspringboot.BLL.service.abstraction.RisorsaService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/risorsa")
@CrossOrigin("http://localhost:8080")
public class RisorsaController {

    private final RisorsaService risorsaService;

    @PostMapping
    public ResponseEntity<Void> save(@RequestBody RisorsaRequestDTO risorsaRequestDTO){

        try {
            risorsaService.saveRisorsa(risorsaRequestDTO);
            return new ResponseEntity<>(HttpStatus.CREATED);
        }catch (NullPointerException n){
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }

    @GetMapping(path="/{id}")
    public ResponseEntity<RisorsaResponseDTO>  getById(@PathVariable Long id){
        return new ResponseEntity<>(risorsaService.findById(id),HttpStatus.OK);
    }

    @GetMapping
    public ResponseEntity<List<RisorsaResponseDTO>>  findAllRisorsa(){
        return new ResponseEntity<>(risorsaService.findAllRisorsa(),HttpStatus.OK);
    }

    @PutMapping(path="/{id}")
    public ResponseEntity<Void> deleteRisorsaById(@PathVariable Long id){

        try {
            risorsaService.deleteRisorsaById(id);
            return new ResponseEntity<>(HttpStatus.OK);
        } catch (NullPointerException n){
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }
}
