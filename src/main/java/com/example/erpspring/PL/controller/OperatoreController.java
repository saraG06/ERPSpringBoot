package com.example.erpspring.PL.controller;

import com.example.erpspring.BLL.dto.request.FatturaRequestDTO;
import com.example.erpspring.BLL.dto.request.OperatoreRequestDTO;
import com.example.erpspring.BLL.dto.response.FatturaResponseDTO;
import com.example.erpspring.BLL.dto.response.OperatoreResponseDTO;
import com.example.erpspring.BLL.service.abstraction.FatturaService;
import com.example.erpspring.BLL.service.abstraction.OperatoreService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@RestController
@CrossOrigin("http://localhost:8080")
@RequestMapping("/operatore")
@RequiredArgsConstructor
public class OperatoreController {
    private final OperatoreService operatoreService;

    @PostMapping
    public ResponseEntity<Void> save(@RequestBody OperatoreRequestDTO operatoreRequestDTO){
        operatoreService.saveOperatore(operatoreRequestDTO);
        return new ResponseEntity<>(HttpStatus.CREATED);
    }

    @GetMapping(path= "/{id}")      //le graffe indicano una variabile
    public ResponseEntity<OperatoreResponseDTO> getById(@PathVariable Long id) {

        return new ResponseEntity<>(operatoreService.findById(id), HttpStatus.OK);

    }

    @PutMapping(path="/{id}")
    public ResponseEntity<Void> delete(@PathVariable Long id){

        operatoreService.deleteOperatoreById(id);
        return new ResponseEntity<>(HttpStatus.OK);
    }

    @GetMapping()
    public ResponseEntity<List<OperatoreResponseDTO>> getAll(){
        return new ResponseEntity<>(operatoreService.findAllOperatore(), HttpStatus.OK);
    }
}
