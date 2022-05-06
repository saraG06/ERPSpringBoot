package com.example.ERPSpringBoot.PL.Controller;

import com.example.ERPSpringBoot.BLL.dto.request.DipendenteRequestDTO;
import com.example.ERPSpringBoot.BLL.dto.response.DipendenteResponseDTO;
import com.example.ERPSpringBoot.BLL.service.abstraction.DipendenteService;
import com.example.ERPSpringBoot.DAL.Exception.IdNotFound;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/v1/dipendente")
@CrossOrigin("http://localhost:8080")
public class DipendenteController {
    private final DipendenteService dipendenteService;

    @PostMapping
    public ResponseEntity<Void> save(@RequestBody DipendenteRequestDTO dipendenteRequestDTO){
        dipendenteService.saveDipendente(dipendenteRequestDTO);
        return new ResponseEntity<>(HttpStatus.CREATED);
    }

    @GetMapping(path= "/{id}")      //le graffe indicano una variabile
    public ResponseEntity<DipendenteResponseDTO> getById(@PathVariable Long id) {
        try {
            return new ResponseEntity<>(dipendenteService.findByid(id), HttpStatus.OK);
        } catch (IdNotFound e) {
            e.printStackTrace();
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }

    @DeleteMapping(path="/{id}")
    public ResponseEntity<Void> delete(@PathVariable Long id){
        try{
            dipendenteService.deleteByid(id);
            return new ResponseEntity<>(HttpStatus.OK);
        } catch(IdNotFound e){
            e.printStackTrace();
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }

    @GetMapping()
    public ResponseEntity<List<DipendenteResponseDTO>> getAll(){
        return new ResponseEntity<>(dipendenteService.findAllDipendente(), HttpStatus.OK);
    }
}
