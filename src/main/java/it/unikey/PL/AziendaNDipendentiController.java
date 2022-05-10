package it.unikey.PL;

import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;
import it.unikey.BLL.service.abstraction.AziendaService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/v1/aziendaNDipendenti")
@CrossOrigin("http://localhost:8080")
public class AziendaNDipendentiController {

    private final AziendaService aziendaService;

    @GetMapping()
    @ApiOperation(value= "Metodo per cercare il numero di dipendenti dell'azienda")
    @ApiResponses(value= {
            @ApiResponse(code= 200, message= "richiesta ricevuta ed eseguita"),
            @ApiResponse(code= 404, message= "risorsa non trovata")
    })
    public ResponseEntity<Integer> getNDipendenti(){
        return new ResponseEntity<>(aziendaService.numeroDipendenti(), HttpStatus.OK);
    }
}
