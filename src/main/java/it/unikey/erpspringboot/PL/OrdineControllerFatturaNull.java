package it.unikey.erpspringboot.PL;

import it.unikey.erpspringboot.BLL.dto.Response.OrdineResponseDTO;
import it.unikey.erpspringboot.BLL.service.abstraction.OrdineService;
import it.unikey.erpspringboot.DAL.Entity.Ordine;
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
@RequestMapping("/api/ordine/filterfatturanull")
@CrossOrigin("http://localhost:8080")
public class OrdineControllerFatturaNull {

    private final OrdineService ordineService;

    @GetMapping
    public ResponseEntity<List<OrdineResponseDTO>> getAllOrdiniSenzaFattura() {
        return new ResponseEntity<>(ordineService.getAllOrdiniSenzaFattura(), HttpStatus.OK);
    }
}
