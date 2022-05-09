package it.unikey.erpSpringBootTest.PL.controller;

import it.unikey.erpSpringBootTest.BLL.dto.request.ClienteRequestDTO;
import it.unikey.erpSpringBootTest.BLL.dto.response.ClienteResponseDTO;
import it.unikey.erpSpringBootTest.BLL.service.abstraction.ClienteService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/cliente")
@CrossOrigin("http://localhost:8080")
public class ClienteController {

    private final ClienteService clienteService;

    @PostMapping
    public ResponseEntity<Void> save(@RequestBody ClienteRequestDTO clienteRequestDTO){
        clienteService.saveCliente(clienteRequestDTO);
        return new ResponseEntity<>(HttpStatus.CREATED);
    }

    @GetMapping()
    public ResponseEntity<List<ClienteResponseDTO>> findClientiWithMoreThan10Contatti(){
        return new ResponseEntity<>(clienteService.findAllClientiWithMoreThan10Contatti(),HttpStatus.FOUND);
    }
}
