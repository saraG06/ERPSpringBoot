package it.unikey.erpSpringBootTest.PL.controller;

import it.unikey.erpSpringBootTest.BLL.dto.response.DipendenteResponseDTO;
import it.unikey.erpSpringBootTest.BLL.service.abstraction.DipendenteService;
import it.unikey.erpSpringBootTest.DAL.Entity.Dipendente;
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
@RequestMapping("/api/dipendente/employed/last/month")
@CrossOrigin("http://localhost:8080")
public class DipendentiGetEmployedLastMonthController {

    private final DipendenteService dipendenteService;

    /*@GetMapping
    public ResponseEntity<List<DipendenteResponseDTO>> GetEmployedLastMonth(){
        return new ResponseEntity<>(dipendenteService.findDipendentiEmployedLastMonth() ,HttpStatus.FOUND);
    }*/
}
