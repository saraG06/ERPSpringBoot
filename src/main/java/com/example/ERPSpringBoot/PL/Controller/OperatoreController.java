package com.example.ERPSpringBoot.PL.Controller;


import com.example.ERPSpringBoot.BLL.dto.request.OperatoreRequestDTO;
import com.example.ERPSpringBoot.BLL.dto.response.OperatoreResponseDTO;
import com.example.ERPSpringBoot.BLL.service.abstraction.OperatoreService;
import com.example.ERPSpringBoot.DAL.Exception.IdNotFound;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/v1/operatore")
@CrossOrigin("http://localhost:8080")
public class OperatoreController {
    private final OperatoreService operatoreService;

    @PostMapping
    public ResponseEntity<Void> save(@RequestBody OperatoreRequestDTO operatoreRequestDTO){
        operatoreService.saveOperatore(operatoreRequestDTO);
        return new ResponseEntity<>(HttpStatus.CREATED);
    }
    @GetMapping(path= "/{id}")      //le graffe indicano una variabile
    public ResponseEntity<OperatoreResponseDTO> getById(@PathVariable Long id) {
        try {
            return new ResponseEntity<>(operatoreService.findByid(id), HttpStatus.OK);
        } catch (IdNotFound e) {
            e.printStackTrace();
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }
    @DeleteMapping(path="/{id}")
    public ResponseEntity<Void> delete(@PathVariable Long id){
        try{
            operatoreService.deleteByid(id);
            return new ResponseEntity<>(HttpStatus.OK);
        } catch(IdNotFound e){
            e.printStackTrace();
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }
    @GetMapping()
    public ResponseEntity<List<OperatoreResponseDTO>> getAll(){
        return new ResponseEntity<>(operatoreService.findAllOperatore(), HttpStatus.OK);
    }
}
