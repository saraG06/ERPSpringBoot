package com.example.erpspring.PL.controller;

import com.example.erpspring.BLL.dto.request.ClienteRequestDTO;
import com.example.erpspring.BLL.dto.request.ContattoRequestDTO;
import com.example.erpspring.BLL.dto.response.ClienteResponseDTO;
import com.example.erpspring.BLL.dto.response.ContattoResponseDTO;
import com.example.erpspring.BLL.service.abstraction.ClienteService;
import com.example.erpspring.BLL.service.abstraction.ContattoService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin("http://localhost:8080")
@RequestMapping("/contatto")
@RequiredArgsConstructor
public class ContattoController {
    private final ContattoService contattoService;

    @PostMapping
    public ResponseEntity<Void> save(@RequestBody ContattoRequestDTO contattoRequestDTO){
        contattoService.saveContatto(contattoRequestDTO);
        return new ResponseEntity<>(HttpStatus.CREATED);
    }

    @GetMapping(path= "/{id}")      //le graffe indicano una variabile
    public ResponseEntity<ContattoResponseDTO> getById(@PathVariable Long id) {

        return new ResponseEntity<>(contattoService.findById(id), HttpStatus.OK);

    }

    @PutMapping(path="/{id}")
    public ResponseEntity<Void> delete(@PathVariable Long id){

        contattoService.deleteContattoById(id);
        return new ResponseEntity<>(HttpStatus.OK);
    }

    @GetMapping()
    public ResponseEntity<List<ContattoResponseDTO>> getAll(){
        return new ResponseEntity<>(contattoService.findAllContatto(), HttpStatus.OK);
    }
}
