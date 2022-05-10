package it.unikey.PL;

import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;
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
    @ApiOperation(value= "Metodo per cercare i clienti con almeno 10 contatti")
    @ApiResponses(value= {
            @ApiResponse(code= 200, message= "richiesta ricevuta ed eseguita"),
            @ApiResponse(code= 404, message= "risorsa non trovata")
    })
    public ResponseEntity<List<ClienteResponseDTO>> getclienti10Contatti(){
        return new ResponseEntity<>(clienteService.clienti10Contatti(), HttpStatus.OK);
    }
}
