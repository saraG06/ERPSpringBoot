package it.unikey.PL;

import it.unikey.BLL.mapper.dto.response.OrdineResponseDTO;
import it.unikey.BLL.service.abstraction.OrdineService;
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
@RequestMapping("/api/v1/ordineSenzaFattura")
@CrossOrigin("http://localhost:8080")
public class OrdineSenzaFatturaController {

    private final OrdineService ordineService;

    @GetMapping()
    public ResponseEntity<List<OrdineResponseDTO>> getOrdiniSenzaFattura(){
        return new ResponseEntity<>(ordineService.findOrdiniSenzaFattura(), HttpStatus.OK);
    }
}
