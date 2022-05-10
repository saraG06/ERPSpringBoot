package it.unikey.erpspring.PL.controller;

import it.unikey.erpspring.BLL.DTO.response.ClientResponseDTO;
import it.unikey.erpspring.BLL.service.abstraction.ClientService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/v1/client/10contact")
@CrossOrigin("http://localhost:8080")
public class ClientController10Contact {

    private final ClientService clientService;

    @GetMapping
    public ResponseEntity<List<ClientResponseDTO>> getClientsContactGreater10(){
        return new ResponseEntity<>(clientService.getClientsContactGreater10(), HttpStatus.OK);
    }
}
