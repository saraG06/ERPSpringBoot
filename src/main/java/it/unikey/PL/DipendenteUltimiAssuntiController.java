package it.unikey.PL;

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
    public ResponseEntity<List<DipendenteResponseDTO>> getUltimiDipendentiAssunti(@PathVariable LocalDate now){
        return new ResponseEntity<>(dipendenteService.ultimiDipendentiAssunti(now), HttpStatus.OK);
    }
}
