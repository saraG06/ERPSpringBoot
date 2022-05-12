package com.example.ERPSpringBoot.PL.Controller;

import com.example.ERPSpringBoot.BLL.dto.request.CollaboratoreRequestDTO;
import com.example.ERPSpringBoot.BLL.dto.request.ContattoRequestDTO;
import com.example.ERPSpringBoot.BLL.dto.response.CollaboratoreResponseDTO;
import com.example.ERPSpringBoot.BLL.dto.response.ContattoResponseDTO;
import com.example.ERPSpringBoot.BLL.service.abstraction.ContattoService;
import com.example.ERPSpringBoot.DAL.Exception.IdNotFound;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/v1/contatto")
@CrossOrigin("http://localhost:8080")
public class ContattoController {
    private final ContattoService contattoService;

    @PostMapping
    @ApiOperation(value = "Metodo per aggiungere un contatto", notes = "Per aggiungere la risorsa mi serve un oggetto")
    @ApiResponses(value = {
            @ApiResponse(code =201, message = "ha creato effettivamente la risorsa"),
            @ApiResponse(code = 403, message = "Non hai le autorizazioni per aggiungere un contatto")})
    public ResponseEntity<Void> save(@RequestBody ContattoRequestDTO contattoRequestDTO){
        contattoService.saveContatto(contattoRequestDTO);
        return new ResponseEntity<>(HttpStatus.CREATED);
    }

    @GetMapping(path= "/{id}")      //le graffe indicano una variabile
    @ApiOperation(value = "Metodo per recuperare un contatto", notes = "Per trovare il contatto devi mettere l'id")
    @ApiResponses(value = {
            @ApiResponse(code = 403, message = "Non hai le autorizazioni per recuperare il contatto")})
    public ResponseEntity<ContattoResponseDTO> getById(@PathVariable Long id) {
        try {
            return new ResponseEntity<>(contattoService.findByid(id), HttpStatus.OK);
        } catch (IdNotFound e) {
            e.printStackTrace();
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }

    @DeleteMapping(path="/{id}")
    @ApiOperation(value = "Metodo per cancellare un contatto", notes = "Per cancellare il contatto devi mettere l'id")
    @ApiResponses(value = {
            @ApiResponse(code = 403, message = "Non hai le autorizazioni per cancellare il contatto")})
    public ResponseEntity<Void> delete(@PathVariable Long id){
        try{
            contattoService.deleteByid(id);
            return new ResponseEntity<>(HttpStatus.OK);
        } catch(IdNotFound e){
            e.printStackTrace();
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }

    @GetMapping()
    @ApiOperation(value = "Metodo per recuperare tutti i contatti")
    @ApiResponses(value = {
            @ApiResponse(code = 403, message = "Non hai le autorizazioni per recuperare i contatti")})
    public ResponseEntity<List<ContattoResponseDTO>> getAll(){
        return new ResponseEntity<>(contattoService.findAllContatto(), HttpStatus.OK);
    }
}
