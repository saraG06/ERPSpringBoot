package it.unikey.erpspringboot.PL;

import it.unikey.erpspringboot.BLL.dto.Request.RuoloRequestDTO;
import it.unikey.erpspringboot.BLL.dto.Response.RuoloResponseDTO;
import it.unikey.erpspringboot.BLL.service.abstraction.RuoloService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/ruolo")
@CrossOrigin("http://localhost:8080")
public class RuoloController {

    private final RuoloService ruoloService;

    @PostMapping
    public ResponseEntity<Void> save(@RequestBody RuoloRequestDTO ruoloRequestDTO){

        try {
            ruoloService.saveRuolo(ruoloRequestDTO);
            return new ResponseEntity<>(HttpStatus.CREATED);
        }catch (NullPointerException n){
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }

    @GetMapping(path="/{id}")
    public ResponseEntity<RuoloResponseDTO>  getById(@PathVariable Long id){
        return new ResponseEntity<>(ruoloService.findById(id),HttpStatus.OK);
    }

    @GetMapping
    public ResponseEntity<List<RuoloResponseDTO>>  findAllRuolo(){
        return new ResponseEntity<>(ruoloService.findAllRuolo(),HttpStatus.OK);
    }

    @PutMapping(path="/{id}")
    public ResponseEntity<Void> deleteRuoloById(@PathVariable Long id){

        try {
            ruoloService.deleteRuoloById(id);
            return new ResponseEntity<>(HttpStatus.OK);
        } catch (NullPointerException n){
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }
}

