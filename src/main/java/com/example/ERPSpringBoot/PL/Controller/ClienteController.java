package com.example.ERPSpringBoot.PL.Controller;

import com.example.ERPSpringBoot.BLL.dto.request.ClienteRequestDTO;
import com.example.ERPSpringBoot.BLL.dto.response.ClienteResponseDTO;
import com.example.ERPSpringBoot.BLL.service.abstraction.ClienteService;
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
@RequestMapping("/api/v1/cliente")
@CrossOrigin("http://localhost:8080")
public class ClienteController {
    private final ClienteService clienteService;

    @PostMapping
    @ApiOperation(value = "Metodo per aggiungere un cliente", notes = "Per aggiungere la risorsa mi serve un oggetto")
    @ApiResponses(value = {
            @ApiResponse(code =201, message = "Ha creato effettivamente la risorsa"),
            @ApiResponse(code = 403, message = "Non hai le autorizazioni per aggiungere un cliente")})
    public ResponseEntity<Void> save(@RequestBody ClienteRequestDTO clienteRequestDTO){
        clienteService.saveCliente(clienteRequestDTO);
        return new ResponseEntity<>(HttpStatus.CREATED);
    }

    @GetMapping(path= "/{id}")      //le graffe indicano una variabile
    @ApiOperation(value = "Metodo per recuperare un cliente", notes = "Per trovare il cliente mettere l'id")
    @ApiResponses(value = {
            @ApiResponse(code = 403, message = "Non hai le autorizazioni per recuperare il cliente")})
    public ResponseEntity<ClienteResponseDTO> getById(@PathVariable Long id) {
        try {
            return new ResponseEntity<>(clienteService.findByid(id), HttpStatus.OK);
        } catch (IdNotFound e) {
            e.printStackTrace();
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }

    @DeleteMapping(path="/{id}")
    @ApiOperation(value = "Metodo per cancellare un cliente", notes = "Per cancellare il cliente mettere l'id")
    @ApiResponses(value = {
            @ApiResponse(code = 403, message = "Non hai le autorizazioni per cancellare il cliente")})
    public ResponseEntity<Void> delete(@PathVariable Long id){
        try{
            clienteService.deleteByid(id);
            return new ResponseEntity<>(HttpStatus.OK);
        } catch(IdNotFound e){
            e.printStackTrace();
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }

    @GetMapping()
    @ApiOperation(value = "Metodo per recuperare tutti i clienti")
    @ApiResponses(value = {
            @ApiResponse(code = 403, message = "Non hai le autorizazioni per recuperare i clienti")})
    public ResponseEntity<List<ClienteResponseDTO>> getAll(){
        return new ResponseEntity<>(clienteService.findAllCliente(), HttpStatus.OK);
    }
}
