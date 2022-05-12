package com.example.ERPSpringBoot.PL.Controller;

import com.example.ERPSpringBoot.BLL.dto.request.AziendaRequestDTO;
import com.example.ERPSpringBoot.BLL.dto.response.AziendaResponseDTO;
import com.example.ERPSpringBoot.BLL.service.abstraction.AziendaService;
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
@RequestMapping("/api/v1/azienda")
@CrossOrigin("http://localhost:8080")
public class AziendaController {

    private final AziendaService aziendaService;

    @PostMapping
    @ApiOperation(value = "Metodo per aggiungere un azienda", notes = "Per aggiungere la risorsa mi serve un oggetto")
    @ApiResponses(value = {
            @ApiResponse(code =201, message = "ha creato effettivamente la risorsa"),
            @ApiResponse(code = 403, message = "Non hai le autorizazioni per aggiungere un azienda")})
    public ResponseEntity<Void> save(@RequestBody AziendaRequestDTO aziendaRequestDTO){
        aziendaService.saveAzienda(aziendaRequestDTO);
        return new ResponseEntity<>(HttpStatus.CREATED);
    }

    @GetMapping(path= "/{id}")      //le graffe indicano una variabile
    @ApiOperation(value = "Metodo per recuperare un azienda", notes = "Per trovare l azienda mettere l'id")
    @ApiResponses(value = {
            @ApiResponse(code = 403, message = "Non hai le autorizazioni per recuperare l azienda")})
    public ResponseEntity<AziendaResponseDTO> getById(@PathVariable Long id) {
        try {
            return new ResponseEntity<>(aziendaService.findByid(id), HttpStatus.OK);
        } catch (IdNotFound e) {
            e.printStackTrace();
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }

    @DeleteMapping(path="/{id}")
    @ApiOperation(value = "Metodo per cancellare un azienda", notes = "Per cancellare l azienda mettere l'id")
    @ApiResponses(value = {
            @ApiResponse(code = 403, message = "Non hai le autorizazioni per cancellare l azienda")})
    public ResponseEntity<Void> delete(@PathVariable Long id){
        try{
            aziendaService.deleteByid(id);
            return new ResponseEntity<>(HttpStatus.OK);
        } catch(IdNotFound e){
            e.printStackTrace();
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }

    @GetMapping()
    @ApiOperation(value = "Metodo per recuperare tutte le aziende")
    @ApiResponses(value = {
            @ApiResponse(code = 403, message = "Non hai le autorizazioni per recuperare le aziende")})
    public ResponseEntity<List<AziendaResponseDTO>> getAll(){
        return new ResponseEntity<>(aziendaService.findAllAzienda(), HttpStatus.OK);
    }

}
