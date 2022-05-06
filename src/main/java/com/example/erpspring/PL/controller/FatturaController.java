package com.example.erpspring.PL.controller;

import com.example.erpspring.BLL.dto.request.FatturaRequestDTO;
import com.example.erpspring.BLL.dto.response.FatturaResponseDTO;
import com.example.erpspring.BLL.service.abstraction.FatturaService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin("http://localhost:8080")
@RequestMapping("/fattura")
@RequiredArgsConstructor
public class FatturaController {

    private final FatturaService fatturaService;

    @PostMapping
    public ResponseEntity<Void> save(@RequestBody FatturaRequestDTO fatturaRequestDTO){
        fatturaService.saveFattura(fatturaRequestDTO);
        return new ResponseEntity<>(HttpStatus.CREATED);
    }

    @GetMapping(path= "/{id}")      //le graffe indicano una variabile
    public ResponseEntity<FatturaResponseDTO> getById(@PathVariable Long id) {

        return new ResponseEntity<>(fatturaService.findById(id), HttpStatus.OK);

    }

    @PutMapping(path="/{id}")
    public ResponseEntity<Void> delete(@PathVariable Long id){

        fatturaService.deleteFatturaById(id);
        return new ResponseEntity<>(HttpStatus.OK);
    }

    @GetMapping()
    public ResponseEntity<List<FatturaResponseDTO>> getAll(){
        return new ResponseEntity<>(fatturaService.findAllFattura(), HttpStatus.OK);
    }
}
