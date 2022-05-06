package it.unikey.PL;

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
    public ResponseEntity<List<DipendenteResponseDTO>> getDipendentiConMacchina(){
        return new ResponseEntity<>(dipendenteService.dipendentiConMacchina(), HttpStatus.OK);
    }
}
