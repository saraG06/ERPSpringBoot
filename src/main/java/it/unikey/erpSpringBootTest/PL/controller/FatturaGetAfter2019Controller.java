package it.unikey.erpSpringBootTest.PL.controller;


import it.unikey.erpSpringBootTest.BLL.dto.response.FatturaResponseDTO;
import it.unikey.erpSpringBootTest.BLL.service.abstraction.FatturaService;
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
@RequestMapping("/api/fattura")
@CrossOrigin("http://localhost:8080")
public class FatturaGetAfter2019Controller {

    private final FatturaService fatturaService;

    @GetMapping(path = "/{id}")
    public ResponseEntity<List<FatturaResponseDTO>> findFattureAfter2019(){
        fatturaService.findAllFattureAfter2019();
        return new ResponseEntity<>(HttpStatus.FOUND);
    }
}
