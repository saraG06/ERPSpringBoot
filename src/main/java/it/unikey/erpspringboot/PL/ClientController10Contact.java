package it.unikey.erpspringboot.PL;

import it.unikey.erpspringboot.BLL.dto.Response.ClienteResponseDTO;
import it.unikey.erpspringboot.BLL.service.abstraction.ClienteService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/cliente/10contatti")
@CrossOrigin("http://localhost:8080")
public class ClientController10Contact {

    private final ClienteService clienteService;

    @GetMapping
    public ResponseEntity<List<ClienteResponseDTO>> getAllClientiWith10OrMoreContatti(){
        return new ResponseEntity<>(clienteService.getAllClientiWith10OrMoreContatti(), HttpStatus.OK);
    }
}
