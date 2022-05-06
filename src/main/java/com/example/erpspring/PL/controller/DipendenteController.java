package com.example.erpspring.PL.controller;

import com.example.erpspring.BLL.dto.request.ContattoRequestDTO;
import com.example.erpspring.BLL.dto.request.DipendenteRequestDTO;
import com.example.erpspring.BLL.dto.response.ContattoResponseDTO;
import com.example.erpspring.BLL.dto.response.DipendenteResponseDTO;
import com.example.erpspring.BLL.service.abstraction.ContattoService;
import com.example.erpspring.BLL.service.abstraction.DipendenteService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin("http://localhost:8080")
@RequestMapping("/dipendente")
@RequiredArgsConstructor
public class DipendenteController {

    private final DipendenteService dipendenteService;

    @PostMapping
    public ResponseEntity<Void> save(@RequestBody DipendenteRequestDTO dipendenteRequestDTO){
        dipendenteService.saveDipendete(dipendenteRequestDTO);
        return new ResponseEntity<>(HttpStatus.CREATED);
    }

    @GetMapping(path= "/{id}")      //le graffe indicano una variabile
    public ResponseEntity<DipendenteResponseDTO> getById(@PathVariable Long id) {

        return new ResponseEntity<>(dipendenteService.findById(id), HttpStatus.OK);

    }

    @PutMapping(path="/{id}")
    public ResponseEntity<Void> delete(@PathVariable Long id){

        dipendenteService.deleteDipendenteById(id);
        return new ResponseEntity<>(HttpStatus.OK);
    }

    @GetMapping()
    public ResponseEntity<List<DipendenteResponseDTO>> getAll(){
        return new ResponseEntity<>(dipendenteService.findAllDipendente(), HttpStatus.OK);
    }
}
