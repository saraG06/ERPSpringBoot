package com.example.ERPSpringBoot.PL.Controller;

import com.example.ERPSpringBoot.BLL.dto.request.RisorsaRequestDTO;
import com.example.ERPSpringBoot.BLL.dto.response.RisorsaResponseDTO;
import com.example.ERPSpringBoot.BLL.service.abstraction.RisorsaService;
import com.example.ERPSpringBoot.DAL.Exception.IdNotFound;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/v1/risorsa")
@CrossOrigin("http://localhost:8080")
public class RisorsaController {
    private final RisorsaService risorsaService;

    @PostMapping
    public ResponseEntity<Void> save(@RequestBody RisorsaRequestDTO risorsaRequestDTO){
        risorsaService.saveRisorsa(risorsaRequestDTO);
        return new ResponseEntity<>(HttpStatus.CREATED);
    }

    @GetMapping(path= "/{id}")      //le graffe indicano una variabile
    public ResponseEntity<RisorsaResponseDTO> getById(@PathVariable Long id) {
        try {
            return new ResponseEntity<>(risorsaService.findByid(id), HttpStatus.OK);
        } catch (IdNotFound e) {
            e.printStackTrace();
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }

    @DeleteMapping(path="/{id}")
    public ResponseEntity<Void> delete(@PathVariable Long id){
        try{
            risorsaService.deleteByid(id);
            return new ResponseEntity<>(HttpStatus.OK);
        } catch(IdNotFound e){
            e.printStackTrace();
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }

    @GetMapping()
    public ResponseEntity<List<RisorsaResponseDTO>> getAll(){
        return new ResponseEntity<>(risorsaService.findAllRisorsa(), HttpStatus.OK);
    }
}
