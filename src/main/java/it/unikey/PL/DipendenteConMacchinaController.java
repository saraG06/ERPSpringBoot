package it.unikey.PL;

import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;
import it.unikey.BLL.mapper.dto.response.DipendenteResponseDTO;
import it.unikey.BLL.service.abstraction.DipendenteService;
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
@RequestMapping("/api/v1/dipendenteConMacchina")
@CrossOrigin("http://localhost:8080")
public class DipendenteConMacchinaController {

    private final DipendenteService dipendenteService;

    @GetMapping()
    @ApiOperation(value= "Metodo per cercare i dipendenti con la macchina aziendale")
    @ApiResponses(value= {
            @ApiResponse(code= 200, message= "richiesta ricevuta ed eseguita"),
            @ApiResponse(code= 404, message= "risorsa non trovata")
    })
    public ResponseEntity<List<DipendenteResponseDTO>> getDipendentiConMacchina(){
        return new ResponseEntity<>(dipendenteService.dipendentiConMacchina(), HttpStatus.OK);
    }
}
