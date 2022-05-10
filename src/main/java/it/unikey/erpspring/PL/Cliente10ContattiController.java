package it.unikey.erpspring.PL;

import it.unikey.erpspring.BLL.service.astratti.ClienteService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/v1/cliente10contatti")
@CrossOrigin("http://localhost:8080")
public class Cliente10ContattiController {

    private ClienteService clienteService;

    /*@GetMapping(path = "/{id}")
    public ResponseEntity<List<ClienteResponseDTO>> Cliente10Contatti*/

}



