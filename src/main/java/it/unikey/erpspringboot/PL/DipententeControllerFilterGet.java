package it.unikey.erpspringboot.PL;

import it.unikey.erpspringboot.BLL.dto.Response.ClienteResponseDTO;
import it.unikey.erpspringboot.BLL.dto.Response.DipendenteResponseDTO;
import it.unikey.erpspringboot.BLL.service.abstraction.DipendenteService;
import it.unikey.erpspringboot.DAL.Entity.Dipendente;
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
@RequestMapping("/api/dipendente/filterget")
@CrossOrigin("http://localhost:8080")
public class DipententeControllerFilterGet {

    private DipendenteService dipendenteService;

    @GetMapping(path = "/{aziendaId}")
    public ResponseEntity<Integer> getNDipendentiByAziendaId(Integer aziendaId) {
        return new ResponseEntity<>(dipendenteService.getNDipendentiByAziendaId(aziendaId), HttpStatus.OK);
    }

    @GetMapping
    public ResponseEntity<List<DipendenteResponseDTO>> getDipendentiWithMacchina() {
        return new ResponseEntity<>(dipendenteService.getDipendentiWithMacchina(),HttpStatus.OK);
    }
}
