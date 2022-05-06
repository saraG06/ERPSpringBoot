package com.example.erpspring.PL.controller;

import com.example.erpspring.BLL.dto.request.ClienteRequestDTO;
import com.example.erpspring.BLL.dto.request.CollaboratoreRequestDTO;
import com.example.erpspring.BLL.dto.response.ClienteResponseDTO;
import com.example.erpspring.BLL.dto.response.CollaboratoreResponseDTO;
import com.example.erpspring.BLL.service.abstraction.ClienteService;
import com.example.erpspring.BLL.service.abstraction.CollaboratoreService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@RestController
@CrossOrigin("http://localhost:8080")
@RequestMapping("/collaboratore")
@RequiredArgsConstructor
public class CollaboratoreController {

    private final CollaboratoreService collaboratoreService;

    @PostMapping
    public ResponseEntity<Void> save(@RequestBody CollaboratoreRequestDTO collaboratoreRequestDTO){
        collaboratoreService.saveCollaboratore(collaboratoreRequestDTO);
        return new ResponseEntity<>(HttpStatus.CREATED);
    }

    @GetMapping(path= "/{id}")      //le graffe indicano una variabile
    public ResponseEntity<CollaboratoreResponseDTO> getById(@PathVariable Long id) {

        return new ResponseEntity<>(collaboratoreService.findById(id), HttpStatus.OK);

    }

    @PutMapping(path="/{id}")
    public ResponseEntity<Void> delete(@PathVariable Long id){

        collaboratoreService.deleteCollaboratoreById(id);
        return new ResponseEntity<>(HttpStatus.OK);
    }

    @GetMapping()
    public ResponseEntity<List<CollaboratoreResponseDTO>> getAll(){
        return new ResponseEntity<>(collaboratoreService.findAllCollaboratore(), HttpStatus.OK);
    }
}
