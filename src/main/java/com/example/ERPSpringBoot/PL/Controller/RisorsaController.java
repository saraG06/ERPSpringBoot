package com.example.ERPSpringBoot.PL.Controller;

import com.example.ERPSpringBoot.BLL.dto.request.RisorsaRequestDTO;
import com.example.ERPSpringBoot.BLL.dto.response.RisorsaResponseDTO;
import com.example.ERPSpringBoot.BLL.service.abstraction.RisorsaService;
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
@RequestMapping("/api/v1/risorsa")
@CrossOrigin("http://localhost:8080")
public class RisorsaController {
    private final RisorsaService risorsaService;

    @PostMapping
    @ApiOperation(value = "Metodo per aggiungere una risorsa", notes = "Per aggiungere la risorsa mi serve un oggetto")
    @ApiResponses(value = {
            @ApiResponse(code =201, message = "ha creato effettivamente la risorsa"),
            @ApiResponse(code = 403, message = "Non hai le autorizazioni per aggiungere una risorsa")})
    public ResponseEntity<Void> save(@RequestBody RisorsaRequestDTO risorsaRequestDTO){
        risorsaService.saveRisorsa(risorsaRequestDTO);
        return new ResponseEntity<>(HttpStatus.CREATED);
    }

    @GetMapping(path= "/{id}")      //le graffe indicano una variabile
    @ApiOperation(value = "Metodo per recuperare una risorsa", notes = "Per trovare il contatto devi mettere l'id")
    @ApiResponses(value = {
            @ApiResponse(code = 403, message = "Non hai le autorizazioni per recuperare la risorsa")})
    public ResponseEntity<RisorsaResponseDTO> getById(@PathVariable Long id) {
        try {
            return new ResponseEntity<>(risorsaService.findByid(id), HttpStatus.OK);
        } catch (IdNotFound e) {
            e.printStackTrace();
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }

    @DeleteMapping(path="/{id}")
    @ApiOperation(value = "Metodo per cancellare una risorsa", notes = "Per cancellare il contatto devi mettere l'id")
    @ApiResponses(value = {
            @ApiResponse(code = 403, message = "Non hai le autorizazioni per cancellare la risorsa")})
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
    @ApiOperation(value = "Metodo per recuperare tutti le risorse")
    @ApiResponses(value = {
            @ApiResponse(code = 403, message = "Non hai le autorizazioni per recuperare le risorse")})
    public ResponseEntity<List<RisorsaResponseDTO>> getAll(){
        return new ResponseEntity<>(risorsaService.findAllRisorsa(), HttpStatus.OK);
    }
}
