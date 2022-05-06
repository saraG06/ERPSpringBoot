package com.example.erpspring.PL.controller;


import com.example.erpspring.BLL.dto.request.OrdineRequestDTO;
import com.example.erpspring.BLL.dto.response.OrdineResponseDTO;
import com.example.erpspring.BLL.service.abstraction.OrdineService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin("http://localhost:8080")
@RequestMapping("/ordine")
@RequiredArgsConstructor
public class OrdineController {

    private final OrdineService ordineService;

    @PostMapping
    public ResponseEntity<Void> save(@RequestBody OrdineRequestDTO ordineRequestDTO){
        ordineService.saveOrdine(ordineRequestDTO);
        return new ResponseEntity<>(HttpStatus.CREATED);
    }

    @GetMapping(path= "/{id}")      //le graffe indicano una variabile
    public ResponseEntity<OrdineResponseDTO> getById(@PathVariable Long id) {

        return new ResponseEntity<>(ordineService.findById(id), HttpStatus.OK);

    }

    @PutMapping(path="/{id}")
    public ResponseEntity<Void> delete(@PathVariable Long id){

        ordineService.deleteOrdineById(id);
        return new ResponseEntity<>(HttpStatus.OK);
    }

    @GetMapping()
    public ResponseEntity<List<OrdineResponseDTO>> getAll(){
        return new ResponseEntity<>(ordineService.findAllOrdine(), HttpStatus.OK);
    }

}
