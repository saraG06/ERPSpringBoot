package it.unikey.erpSpringBootTest.PL.controller;

import it.unikey.erpSpringBootTest.BLL.service.abstraction.DipendenteService;
import it.unikey.erpSpringBootTest.DAL.Enum.Risorse;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/dipendente/assign/resource")
@CrossOrigin("http://localhost:8080")
public class DipendenteAssignResourceController {

    private final DipendenteService dipendenteService;

    @PutMapping(path = "/{id}")
    public ResponseEntity<Void> assegnaRisorsa(@PathVariable Long id,@RequestBody Risorse risorse){
        dipendenteService.assegnaRisorsa(id, risorse);
        return new ResponseEntity<>(HttpStatus.ACCEPTED);
    }
}
