package com.example.erpspring.PL.controller;

import com.example.erpspring.BLL.dto.request.AziendaRequestDTO;
import com.example.erpspring.BLL.dto.response.AziendaResponseDTO;
import com.example.erpspring.BLL.service.abstraction.AziendaService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin("http://localhost:8080")
@RequestMapping("/azienda")
@RequiredArgsConstructor
public class AziendaController {
    private final AziendaService aziendaService;

    @PostMapping
    public ResponseEntity<Void> save(@RequestBody AziendaRequestDTO aziendaRequestDTO){
        aziendaService.saveAzienda(aziendaRequestDTO);
        return new ResponseEntity<>(HttpStatus.CREATED);
    }

    @GetMapping(path= "/{id}")      //le graffe indicano una variabile
    public ResponseEntity<AziendaResponseDTO> getById(@PathVariable Long id) {
       // try {
            return new ResponseEntity<>(aziendaService.findById(id), HttpStatus.OK);
//        } catch (ElementNotFoundException e) {
//            e.printStackTrace();
//            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
//        }
    }

    @DeleteMapping(path="/{id}")
    public ResponseEntity<Void> delete(@PathVariable Long id){
      //  try{
            aziendaService.deleteById(id);
            return new ResponseEntity<>(HttpStatus.OK);
//        } catch(ElementNotFoundException e){
//            e.printStackTrace();
//            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
//        }
    }

    @GetMapping()
    public ResponseEntity<List<AziendaResponseDTO>> getAll(){
        return new ResponseEntity<>(aziendaService.findAllAzienda(), HttpStatus.OK);
    }
}
