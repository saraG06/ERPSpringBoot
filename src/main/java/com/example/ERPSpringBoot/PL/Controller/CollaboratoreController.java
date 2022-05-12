package com.example.ERPSpringBoot.PL.Controller;

import com.example.ERPSpringBoot.BLL.dto.request.CollaboratoreRequestDTO;
import com.example.ERPSpringBoot.BLL.dto.response.CollaboratoreResponseDTO;
import com.example.ERPSpringBoot.BLL.service.abstraction.CollaboratoreService;
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
@RequestMapping("/api/v1/collaboratore")
@CrossOrigin("http://localhost:8080")
public class CollaboratoreController {
    private final CollaboratoreService collaboratoreService;
    @PostMapping
    @ApiOperation(value = "Metodo per aggiungere un collaboratore", notes = "Per aggiungere la risorsa mi serve un oggetto")
    @ApiResponses(value = {
            @ApiResponse(code =201, message = "ha creato effettivamente la risorsa"),
            @ApiResponse(code = 403, message = "Non hai le autorizazioni per aggiungere un collaboratore")})
    public ResponseEntity<Void> save(@RequestBody CollaboratoreRequestDTO collaboratoreRequestDTO){
        collaboratoreService.saveCollaboratore(collaboratoreRequestDTO);
        return new ResponseEntity<>(HttpStatus.CREATED);
    }

    @GetMapping(path= "/{id}")      //le graffe indicano una variabile
    @ApiOperation(value = "Metodo per recuperare un collaboratore", notes = "Per trovare il collaboratore devi mettere l'id")
    @ApiResponses(value = {
            @ApiResponse(code = 403, message = "Non hai le autorizazioni per recuperare il collaboratore")})
    public ResponseEntity<CollaboratoreResponseDTO> getById(@PathVariable Long id) {
        try {
            return new ResponseEntity<>(collaboratoreService.findByid(id), HttpStatus.OK);
        } catch (IdNotFound e) {
            e.printStackTrace();
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }

    @DeleteMapping(path="/{id}")
    @ApiOperation(value = "Metodo per cancellare un collaboratore", notes = "Per cancellare il collaboratore devi mettere l'id")
    @ApiResponses(value = {
            @ApiResponse(code = 403, message = "Non hai le autorizazioni per cancellare il collaboratore")})
    public ResponseEntity<Void> delete(@PathVariable Long id){
        try{
            collaboratoreService.deleteByid(id);
            return new ResponseEntity<>(HttpStatus.OK);
        } catch(IdNotFound e){
            e.printStackTrace();
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }

    @GetMapping()
    @ApiOperation(value = "Metodo per recuperare tutti i collaboratori")
    @ApiResponses(value = {
            @ApiResponse(code = 403, message = "Non hai le autorizazioni per recuperare i collaboratori")})
    public ResponseEntity<List<CollaboratoreResponseDTO>> getAll(){
        return new ResponseEntity<>(collaboratoreService.findAllCollaboratore(), HttpStatus.OK);
    }
}