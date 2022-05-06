package it.unikey.erpspringboot.PL;

import it.unikey.erpspringboot.BLL.dto.Response.OperatoreResponseDTO;
import it.unikey.erpspringboot.BLL.service.abstraction.OperatoreService;
import it.unikey.erpspringboot.DAL.Entity.Operatore;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDate;
import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/operatore/assunzioneultimemese")
@CrossOrigin("http://localhost:8080")
public class OperatoreControllerAssunzioneUltimoMese {

    private final OperatoreService operatoreService;

    @GetMapping(path = "/{now}")
    public ResponseEntity<List<OperatoreResponseDTO>> getAllAssuntiUltimoMese(LocalDate now) {
        return new ResponseEntity<>(operatoreService.getAllAssuntiUltimoMese(now), HttpStatus.OK);
    }
}
