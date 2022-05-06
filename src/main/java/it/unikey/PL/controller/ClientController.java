package it.unikey.PL.controller;

import it.unikey.BLL.dto.request.ClientRequestDTO;
import it.unikey.BLL.dto.response.ClientResponseDTO;
import it.unikey.BLL.exception.IdNotFoundException;
import it.unikey.BLL.service.abstraction.ClientService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

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
    @GetMapping(path="/{id}")
    public ResponseEntity<ClientResponseDTO> getById(@PathVariable Long id) throws IdNotFoundException {
        return new ResponseEntity<>(clientService.findById(id),HttpStatus.OK);

    }
}
