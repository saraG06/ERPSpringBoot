package it.unikey.erpspring.PL.controller;

import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;
import it.unikey.erpspring.BLL.DTO.request.ClientRequestDTO;
import it.unikey.erpspring.BLL.DTO.response.ClientResponseDTO;
import it.unikey.erpspring.BLL.service.abstraction.ClientService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/v1/client")
@CrossOrigin("http://localhost:8080")
public class ClientController {

    private final ClientService clientService;

    @PostMapping
    @ApiOperation(value = "Add client method", notes = "Need an object to add")
    @ApiResponses(value = {
            @ApiResponse(code = 201, message = "Created the client"),
            @ApiResponse(code = 403, message = "No authorization to reach client")})
    public ResponseEntity<Void> save(@RequestBody ClientRequestDTO clientRequestDTO){
        clientService.saveClient(clientRequestDTO);
        return new ResponseEntity<>(HttpStatus.CREATED);
    }

    @GetMapping(path = "/{id}")
    @ApiOperation(value = "Get client by Id method", notes = "Need an Id to find a client")
    @ApiResponses(value = {
            @ApiResponse(code = 200, message = "Client found"),
            @ApiResponse(code = 404, message = "Client not found")})
    public ResponseEntity<ClientResponseDTO> getById(@PathVariable Long id){
        return new ResponseEntity<>(clientService.findClientById(id), HttpStatus.OK);
    }

    @GetMapping
    @ApiOperation(value = "Get all clients method")
    @ApiResponses(value = {
            @ApiResponse(code = 200, message = "Clients found"),
            @ApiResponse(code = 403, message = "No authorization to reach clients")})
    public ResponseEntity<List<ClientResponseDTO>> findAll(){
        return new ResponseEntity<>(clientService.findAllClient(), HttpStatus.OK);
    }

    @DeleteMapping(path = "/{id}")
    @ApiOperation(value = "Delete client by Id method", notes = "Need an Id to delete a client")
    @ApiResponses(value = {
            @ApiResponse(code = 200, message = "Client deleted"),
            @ApiResponse(code = 404, message = "Not found")})
    public ResponseEntity<Void> delete(@PathVariable Long id){
        clientService.deleteClientById(id);
        return new ResponseEntity<>(HttpStatus.OK);
    }
}
