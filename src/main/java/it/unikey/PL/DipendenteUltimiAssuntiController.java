package it.unikey.PL;

import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;
import it.unikey.BLL.mapper.dto.response.DipendenteResponseDTO;
import it.unikey.BLL.service.abstraction.DipendenteService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDate;
import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/v1/dipendenteUltimiAssunti")
@CrossOrigin("http://localhost:8080")
public class DipendenteUltimiAssuntiController {

    private final DipendenteService dipendenteService;

    @GetMapping(path="/{now}")
    @ApiOperation(value= "Metodo per cercare i dipendenti assunti nell'ultimo mese")
    @ApiResponses(value= {
            @ApiResponse(code= 200, message= "richiesta ricevuta ed eseguita"),
            @ApiResponse(code= 404, message= "risorsa non trovata")
    })
    public ResponseEntity<List<DipendenteResponseDTO>> getUltimiDipendentiAssunti(@PathVariable LocalDate now){
        return new ResponseEntity<>(dipendenteService.ultimiDipendentiAssunti(now), HttpStatus.OK);
    }
}
