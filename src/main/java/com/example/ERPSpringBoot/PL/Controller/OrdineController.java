package com.example.ERPSpringBoot.PL.Controller;

import com.example.ERPSpringBoot.BLL.dto.request.OrdineRequestDTO;
import com.example.ERPSpringBoot.BLL.dto.response.OrdineResponseDTO;
import com.example.ERPSpringBoot.BLL.service.abstraction.OrdineService;
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
@RequestMapping("/api/v1/ordine")
@CrossOrigin("http://localhost:8080")
public class OrdineController {
    private final OrdineService ordineService;

    @PostMapping
    @ApiOperation(value = "Metodo per aggiungere un ordine", notes = "Per aggiungere la risorsa mi serve un oggetto")
    @ApiResponses(value = {
            @ApiResponse(code =201, message = "ha creato effettivamente la risorsa"),
            @ApiResponse(code = 403, message = "Non hai le autorizazioni per aggiungere un ordine")})
    public ResponseEntity<Void> save(@RequestBody OrdineRequestDTO ordineRequestDTO){
        ordineService.saveOrdine(ordineRequestDTO);
        return new ResponseEntity<>(HttpStatus.CREATED);
    }

    @GetMapping(path= "/{id}")      //le graffe indicano una variabile
    @ApiOperation(value = "Metodo per recuperare un ordine", notes = "Per trovare il contatto devi mettere l'id")
    @ApiResponses(value = {
            @ApiResponse(code = 403, message = "Non hai le autorizazioni per recuperare l ordine")})
    public ResponseEntity<OrdineResponseDTO> getById(@PathVariable Long id) {
        try {
            return new ResponseEntity<>(ordineService.findByid(id), HttpStatus.OK);
        } catch (IdNotFound e) {
            e.printStackTrace();
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }

    @DeleteMapping(path="/{id}")
    @ApiOperation(value = "Metodo per cancellare un ordine", notes = "Per cancellare il contatto devi mettere l'id")
    @ApiResponses(value = {
            @ApiResponse(code = 403, message = "Non hai le autorizazioni per cancellare l ordine")})
    public ResponseEntity<Void> delete(@PathVariable Long id){
        try{
            ordineService.deleteByid(id);
            return new ResponseEntity<>(HttpStatus.OK);
        } catch(IdNotFound e){
            e.printStackTrace();
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }

    @GetMapping()
    @ApiOperation(value = "Metodo per recuperare tutti gli ordini")
    @ApiResponses(value = {
            @ApiResponse(code = 403, message = "Non hai le autorizazioni per recuperare gli ordini")})
    public ResponseEntity<List<OrdineResponseDTO>> getAll(){
        return new ResponseEntity<>(ordineService.findAllOrdine(), HttpStatus.OK);
    }
}
