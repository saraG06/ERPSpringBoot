package it.unikey.erpSpringBootTest.PL.controller;

import it.unikey.erpSpringBootTest.BLL.dto.request.ClienteRequestDTO;
import it.unikey.erpSpringBootTest.BLL.dto.request.FatturaRequestDTO;
import it.unikey.erpSpringBootTest.BLL.dto.response.ClienteResponseDTO;
import it.unikey.erpSpringBootTest.BLL.service.abstraction.FatturaService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/fattura")
@CrossOrigin("http://localhost:8080")
public class FatturaController {

    private final FatturaService fatturaService;

    @PostMapping
    public ResponseEntity<Void> save(@RequestBody FatturaRequestDTO fatturaRequestDTO){
        fatturaService.saveFattura(fatturaRequestDTO);
        return new ResponseEntity<>(HttpStatus.CREATED);
    }

    @GetMapping(path = "/{id}")
    public ResponseEntity<List<ClienteResponseDTO>> findFattureByCliente(@RequestBody ClienteRequestDTO clienteRequestDTO){
        fatturaService.findAllFattureByCliente(clienteRequestDTO);
        return new ResponseEntity<>(HttpStatus.FOUND);
    }
}
