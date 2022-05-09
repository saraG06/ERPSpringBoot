package it.unikey.erpSpringBootTest.PL.controller;

import it.unikey.erpSpringBootTest.BLL.dto.request.AziendaRequestDTO;
import it.unikey.erpSpringBootTest.BLL.dto.request.DipendenteRequestDTO;
import it.unikey.erpSpringBootTest.BLL.dto.response.DipendenteResponseDTO;
import it.unikey.erpSpringBootTest.BLL.service.abstraction.DipendenteService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/dipendente")
@CrossOrigin("http://localhost:8080")
public class DipendenteController{

    private final DipendenteService dipendenteService;

    @PostMapping
    public ResponseEntity<Void> save(@RequestBody DipendenteRequestDTO dipendenteRequestDTO){
        dipendenteService.saveDipendente(dipendenteRequestDTO);
        return new ResponseEntity<>(HttpStatus.CREATED);
    }

    @GetMapping(path = "/{id}")
    public ResponseEntity<List<DipendenteResponseDTO>> findDipendentiByAzienda(@RequestBody AziendaRequestDTO aziendaRequestDTO){
        return new ResponseEntity<>(dipendenteService.findAllDipendentiByAzienda(aziendaRequestDTO),HttpStatus.FOUND);
    }
}
