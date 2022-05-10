package it.unikey.erpspring.PL.controller;

import it.unikey.erpspring.BLL.DTO.request.ClientRequestDTO;
import it.unikey.erpspring.BLL.DTO.response.ClientResponseDTO;
import it.unikey.erpspring.BLL.service.abstraction.ClientService;
import it.unikey.erpspring.DAL.exceptions.EntityNonFoundException;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.persistence.EntityNotFoundException;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/v1/contact")
@CrossOrigin("http://localhost:8080")
public class ClientController {

    private final ClientService clientService;

    @PostMapping
    public ResponseEntity<Void> save(@RequestBody ClientRequestDTO clientRequestDTO) {
        clientService.saveClient(clientRequestDTO);
        return new ResponseEntity<>(HttpStatus.CREATED);
    }

    @GetMapping(path = "/{id}")
    public ResponseEntity<ClientResponseDTO> getById(@PathVariable Long id) throws EntityNonFoundException {
        return new ResponseEntity<>(clientService.getById(id), HttpStatus.OK);
    }


}
