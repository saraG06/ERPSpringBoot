package com.example.ERPSpringBoot.PL.Controller;

import com.example.ERPSpringBoot.BLL.dto.request.DipendenteRequestDTO;
import com.example.ERPSpringBoot.BLL.dto.response.DipendenteResponseDTO;
import com.example.ERPSpringBoot.BLL.service.abstraction.DipendenteService;
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
@RequestMapping("/api/v1/dipendente")
@CrossOrigin("http://localhost:8080")
public class DipendenteController {
    private final DipendenteService dipendenteService;

    @PostMapping
    @ApiOperation(value = "Metodo per aggiungere un Dipendente", notes = "Per aggiungere la risorsa mi serve un oggetto")
    @ApiResponses(value = {
            @ApiResponse(code =201, message = "ha creato effettivamente la risorsa"),
            @ApiResponse(code = 403, message = "Non hai le autorizazioni per aggiungere un dipendente")})
    public ResponseEntity<Void> save(@RequestBody DipendenteRequestDTO dipendenteRequestDTO){
        dipendenteService.saveDipendente(dipendenteRequestDTO);
        return new ResponseEntity<>(HttpStatus.CREATED);
    }

    @GetMapping(path= "/{id}")      //le graffe indicano una variabile
    @ApiOperation(value = "Metodo per recuperare un Dipendente", notes = "Per trovare il contatto devi mettere l'id")
    @ApiResponses(value = {
            @ApiResponse(code = 403, message = "Non hai le autorizazioni per recuperare il dipendente")})
    public ResponseEntity<DipendenteResponseDTO> getById(@PathVariable Long id) {
        try {
            return new ResponseEntity<>(dipendenteService.findByid(id), HttpStatus.OK);
        } catch (IdNotFound e) {
            e.printStackTrace();
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }

    @DeleteMapping(path="/{id}")
    @ApiOperation(value = "Metodo per cancellare un dipendente", notes = "Per cancellare il contatto devi mettere l'id")
    @ApiResponses(value = {
            @ApiResponse(code = 403, message = "Non hai le autorizazioni per cancellare il dipendente")})
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
    @ApiOperation(value = "Metodo per recuperare tutti i dipendenti")
    @ApiResponses(value = {
            @ApiResponse(code = 403, message = "Non hai le autorizazioni per recuperare i dipendenti")})
    public ResponseEntity<List<DipendenteResponseDTO>> getAll(){
        return new ResponseEntity<>(dipendenteService.findAllDipendente(), HttpStatus.OK);
    }
}
