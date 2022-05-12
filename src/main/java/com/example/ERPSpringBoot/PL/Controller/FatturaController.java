package com.example.ERPSpringBoot.PL.Controller;

import com.example.ERPSpringBoot.BLL.dto.request.DipendenteRequestDTO;
import com.example.ERPSpringBoot.BLL.dto.request.FatturaRequestDTO;
import com.example.ERPSpringBoot.BLL.dto.response.DipendenteResponseDTO;
import com.example.ERPSpringBoot.BLL.dto.response.FatturaResponseDTO;
import com.example.ERPSpringBoot.BLL.service.abstraction.DipendenteService;
import com.example.ERPSpringBoot.BLL.service.abstraction.FatturaService;
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
@RequestMapping("/api/v1/fattura")
@CrossOrigin("http://localhost:8080")
public class FatturaController  {

    private final FatturaService fatturaService;

    @PostMapping
    @ApiOperation(value = "Metodo per aggiungere una fattura", notes = "Per aggiungere la risorsa mi serve un oggetto")
    @ApiResponses(value = {
            @ApiResponse(code =201, message = "ha creato effettivamente la risorsa"),
            @ApiResponse(code = 403, message = "Non hai le autorizazioni per aggiungere una fattura")})
    public ResponseEntity<Void> save(@RequestBody FatturaRequestDTO fatturaRequestDTO){
        fatturaService.saveFattura(fatturaRequestDTO);
        return new ResponseEntity<>(HttpStatus.CREATED);
    }

    @GetMapping(path= "/{id}")      //le graffe indicano una variabile
    @ApiOperation(value = "Metodo per recuperare una fattura", notes = "Per trovare la fattura devi mettere l'id")
    @ApiResponses(value = {
            @ApiResponse(code = 403, message = "Non hai le autorizazioni per recuperare la fattura")})
    public ResponseEntity<FatturaResponseDTO> getById(@PathVariable Long id) {
        try {
            return new ResponseEntity<>(fatturaService.findByid(id), HttpStatus.OK);
        } catch (IdNotFound e) {
            e.printStackTrace();
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }

    @DeleteMapping(path="/{id}")
    @ApiOperation(value = "Metodo per cancellare una fattura", notes = "Per cancellare la fattura devi mettere l'id")
    @ApiResponses(value = {
            @ApiResponse(code = 403, message = "Non hai le autorizazioni per cancellare la fattura")})
    public ResponseEntity<Void> delete(@PathVariable Long id){
        try{
            fatturaService.deleteByid(id);
            return new ResponseEntity<>(HttpStatus.OK);
        } catch(IdNotFound e){
            e.printStackTrace();
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }

    @GetMapping()
    @ApiOperation(value = "Metodo per recuperare tutte le fatture")
    @ApiResponses(value = {
            @ApiResponse(code = 403, message = "Non hai le autorizazioni per recuperare le fatture")})
    public ResponseEntity<List<FatturaResponseDTO>> getAll(){
        return new ResponseEntity<>(fatturaService.findAllFattura(), HttpStatus.OK);
    }
}
