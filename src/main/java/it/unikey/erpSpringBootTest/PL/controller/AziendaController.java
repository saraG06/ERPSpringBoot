package it.unikey.erpSpringBootTest.PL.controller;

import it.unikey.erpSpringBootTest.BLL.dto.request.AziendaRequestDTO;
import it.unikey.erpSpringBootTest.BLL.service.abstraction.AziendaService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/azienda")
@CrossOrigin("http://localhost:8080")
public class AziendaController {

    private final AziendaService aziendaService;

    @PostMapping
    public ResponseEntity<AziendaService> save(@RequestBody AziendaRequestDTO aziendaRequestDTO){
        aziendaService.saveAzienda(aziendaRequestDTO);
        return new ResponseEntity<>(HttpStatus.CREATED);
    }
}
