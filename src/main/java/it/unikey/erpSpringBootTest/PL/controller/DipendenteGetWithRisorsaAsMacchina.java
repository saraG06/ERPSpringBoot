package it.unikey.erpSpringBootTest.PL.controller;

import it.unikey.erpSpringBootTest.BLL.dto.response.DipendenteResponseDTO;
import it.unikey.erpSpringBootTest.BLL.service.abstraction.DipendenteService;
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
@RequestMapping("/api/dipendente")
@CrossOrigin("http://localhost:8080")
public class DipendenteGetWithRisorsaAsMacchina {

    private final DipendenteService dipendenteService;

    @GetMapping(path = "/{id}")
    public ResponseEntity<List<DipendenteResponseDTO>> findDipendentiWithRisorsaAsMacchina(){
        dipendenteService.findAllDipendentiWithRisorsaAsMacchina();
        return new ResponseEntity<>(HttpStatus.FOUND);
    }
}
