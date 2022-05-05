package it.unikey.erpspringboot.PL;

import it.unikey.erpspringboot.BLL.dto.Request.ContattoRequestDTO;
import it.unikey.erpspringboot.BLL.dto.Response.ContattoResponseDTO;
import it.unikey.erpspringboot.BLL.service.abstraction.ContattoService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/contatto")
@CrossOrigin("http://localhost:8080")
public class ContattoController {

    private ContattoService contattoService;

    @PostMapping
    public ResponseEntity<Void> save(@RequestBody ContattoRequestDTO contattoRequestDTO){

        try {
            contattoService.saveContatto(contattoRequestDTO);
            return new ResponseEntity<>(HttpStatus.CREATED);
        }catch (NullPointerException n){
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }

    @GetMapping(path="/{id}")
    public ResponseEntity<ContattoResponseDTO>  getById(@PathVariable Long id){
        return new ResponseEntity<>(contattoService.findById(id),HttpStatus.OK);
    }

    @GetMapping
    public ResponseEntity<List<ContattoResponseDTO>>  findAllContatto(){
        return new ResponseEntity<>(contattoService.findAllContatto(),HttpStatus.OK);
    }

    @PutMapping(path="/{id}")
    public ResponseEntity<Void> deleteContattoById(@PathVariable Long id){

        try {
            contattoService.deleteContattoById(id);
            return new ResponseEntity<>(HttpStatus.OK);
        } catch (NullPointerException n){
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }
}
