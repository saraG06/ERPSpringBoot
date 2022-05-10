package it.unikey.erpspring.PL.controller;

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
    public ResponseEntity<Void> save(@RequestBody ClientRequestDTO clientRequestDTO){
        clientService.saveClient(clientRequestDTO);
        return new ResponseEntity<>(HttpStatus.CREATED);
    }

    @GetMapping(path = "/{id}")
    public ResponseEntity<ClientResponseDTO> getById(@PathVariable Long id){
        return new ResponseEntity<>(clientService.findClientById(id), HttpStatus.OK);
    }

    @GetMapping
    public ResponseEntity<List<ClientResponseDTO>> findAll(){
        return new ResponseEntity<>(clientService.findAllClient(), HttpStatus.OK);
    }

    @DeleteMapping(path = "/{id}")
    public ResponseEntity<Void> delete(@PathVariable Long id){
        clientService.deleteClientById(id);
        return new ResponseEntity<>(HttpStatus.OK);
    }
}
