package com.example.ERPSpringBoot.PL.Controller;


import com.example.ERPSpringBoot.BLL.dto.request.OperatoreRequestDTO;
import com.example.ERPSpringBoot.BLL.dto.response.OperatoreResponseDTO;
import com.example.ERPSpringBoot.BLL.service.abstraction.OperatoreService;
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
@RequestMapping("/api/v1/operatore")
@CrossOrigin("http://localhost:8080")
public class OperatoreController {
    private final OperatoreService operatoreService;

    @PostMapping
    @ApiOperation(value = "Metodo per aggiungere un operatore", notes = "Per aggiungere la risorsa mi serve un oggetto")
    @ApiResponses(value = {
            @ApiResponse(code =201, message = "ha creato effettivamente la risorsa"),
            @ApiResponse(code = 403, message = "Non hai le autorizazioni per aggiungere un operatore")})
    public ResponseEntity<Void> save(@RequestBody OperatoreRequestDTO operatoreRequestDTO){
        operatoreService.saveOperatore(operatoreRequestDTO);
        return new ResponseEntity<>(HttpStatus.CREATED);
    }
    @GetMapping(path= "/{id}")      //le graffe indicano una variabile
    @ApiOperation(value = "Metodo per recuperare un operatore", notes = "Per trovare il contatto devi mettere l'id")
    @ApiResponses(value = {
            @ApiResponse(code = 403, message = "Non hai le autorizazioni per recuperare l operatore")})
    public ResponseEntity<OperatoreResponseDTO> getById(@PathVariable Long id) {
        try {
            return new ResponseEntity<>(operatoreService.findByid(id), HttpStatus.OK);
        } catch (IdNotFound e) {
            e.printStackTrace();
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }
    @DeleteMapping(path="/{id}")
    @ApiOperation(value = "Metodo per cancellare un operatore", notes = "Per cancellare il contatto devi mettere l'id")
    @ApiResponses(value = {
            @ApiResponse(code = 403, message = "Non hai le autorizazioni per cancellare l operatore")})
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
    @ApiOperation(value = "Metodo per recuperare tutti gli operatori")
    @ApiResponses(value = {
            @ApiResponse(code = 403, message = "Non hai le autorizazioni per recuperare gli operatori")})
    public ResponseEntity<List<OperatoreResponseDTO>> getAll(){
        return new ResponseEntity<>(operatoreService.findAllOperatore(), HttpStatus.OK);
    }
}
