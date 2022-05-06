package com.example.erpspring.PL.controller;

import com.example.erpspring.BLL.dto.request.ClienteRequestDTO;
import com.example.erpspring.BLL.dto.response.ClienteResponseDTO;
import com.example.erpspring.BLL.service.abstraction.ClienteService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin("http://localhost:8080")
@RequestMapping("/cliente")
@RequiredArgsConstructor
public class ClienteController {
    private final ClienteService clienteService;

    @PostMapping
    public ResponseEntity<Void> save(@RequestBody ClienteRequestDTO clienteRequestDTO){
        clienteService.saveCliente(clienteRequestDTO);
        return new ResponseEntity<>(HttpStatus.CREATED);
    }

    @GetMapping(path= "/{id}")      //le graffe indicano una variabile
    public ResponseEntity<ClienteResponseDTO> getById(@PathVariable Long id) {

        return new ResponseEntity<>(clienteService.findById(id), HttpStatus.OK);

    }

    @PutMapping(path="/{id}")
    public ResponseEntity<Void> delete(@PathVariable Long id){

        clienteService.deleteClienteById(id);
        return new ResponseEntity<>(HttpStatus.OK);
    }

    @GetMapping()
    public ResponseEntity<List<ClienteResponseDTO>> getAll(){
        return new ResponseEntity<>(clienteService.findAllCliente(), HttpStatus.OK);
    }
}
