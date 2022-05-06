package com.example.ERPSpringBoot.PL.Controller;

import com.example.ERPSpringBoot.BLL.dto.request.CollaboratoreRequestDTO;
import com.example.ERPSpringBoot.BLL.dto.request.ContattoRequestDTO;
import com.example.ERPSpringBoot.BLL.dto.response.CollaboratoreResponseDTO;
import com.example.ERPSpringBoot.BLL.dto.response.ContattoResponseDTO;
import com.example.ERPSpringBoot.BLL.service.abstraction.ContattoService;
import com.example.ERPSpringBoot.DAL.Exception.IdNotFound;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/v1/contatto")
@CrossOrigin("http://localhost:8080")
public class ContattoController {
    private final ContattoService contattoService;

    @PostMapping
    public ResponseEntity<Void> save(@RequestBody ContattoRequestDTO contattoRequestDTO){
        contattoService.saveContatto(contattoRequestDTO);
        return new ResponseEntity<>(HttpStatus.CREATED);
    }

    @GetMapping(path= "/{id}")      //le graffe indicano una variabile
    public ResponseEntity<ContattoResponseDTO> getById(@PathVariable Long id) {
        try {
            return new ResponseEntity<>(contattoService.findByid(id), HttpStatus.OK);
        } catch (IdNotFound e) {
            e.printStackTrace();
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }

    @DeleteMapping(path="/{id}")
    public ResponseEntity<Void> delete(@PathVariable Long id){
        try{
            contattoService.deleteByid(id);
            return new ResponseEntity<>(HttpStatus.OK);
        } catch(IdNotFound e){
            e.printStackTrace();
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }

    @GetMapping()
    public ResponseEntity<List<ContattoResponseDTO>> getAll(){
        return new ResponseEntity<>(contattoService.findAllContatto(), HttpStatus.OK);
    }
}
