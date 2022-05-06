package it.unikey.PL;

import it.unikey.BLL.mapper.dto.response.ClienteResponseDTO;
import it.unikey.BLL.service.abstraction.ClienteService;
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
@RequestMapping("/api/v1/cliente10Contatti")
@CrossOrigin("http://localhost:8080")
public class Cliente10ContattiController {

    private final ClienteService clienteService;

    @GetMapping()
    public ResponseEntity<List<ClienteResponseDTO>> getclienti10Contatti(){
        return new ResponseEntity<>(clienteService.clienti10Contatti(), HttpStatus.OK);
    }
}
