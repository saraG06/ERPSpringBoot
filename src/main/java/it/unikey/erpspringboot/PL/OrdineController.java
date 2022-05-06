package it.unikey.erpspringboot.PL;

import it.unikey.erpspringboot.BLL.dto.Request.OrdineRequestDTO;
import it.unikey.erpspringboot.BLL.dto.Response.OrdineResponseDTO;
import it.unikey.erpspringboot.BLL.service.abstraction.OrdineService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/ordine")
@CrossOrigin("http://localhost:8080")
public class OrdineController {

    private final OrdineService ordineService;

    @PostMapping
    public ResponseEntity<Void> save(@RequestBody OrdineRequestDTO ordineRequestDTO){

        try {
            ordineService.saveOrdine(ordineRequestDTO);
            return new ResponseEntity<>(HttpStatus.CREATED);
        }catch (NullPointerException n){
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }

    @GetMapping(path="/{id}")
    public ResponseEntity<OrdineResponseDTO>  getById(@PathVariable Long id){
        return new ResponseEntity<>(ordineService.findById(id),HttpStatus.OK);
    }

    @GetMapping
    public ResponseEntity<List<OrdineResponseDTO>>  findAllOrdine(){
        return new ResponseEntity<>(ordineService.findAllOrdine(),HttpStatus.OK);
    }

    @PutMapping(path="/{id}")
    public ResponseEntity<Void> deleteOrdineById(@PathVariable Long id){

        try {
            ordineService.deleteOrdineById(id);
            return new ResponseEntity<>(HttpStatus.OK);
        } catch (NullPointerException n){
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }
}
