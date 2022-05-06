package it.unikey.erpspringboot.PL;

import it.unikey.erpspringboot.BLL.dto.Response.OperatoreResponseDTO;
import it.unikey.erpspringboot.BLL.service.abstraction.OperatoreService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDate;
import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/operatore/assunzioneultimemese")
@CrossOrigin("http://localhost:8080")
public class OperatoreControllerAssunzioneUltimoMese {

    private final OperatoreService operatoreService;

    @GetMapping(path = "/{now}")
    public ResponseEntity<List<OperatoreResponseDTO>> getAllAssuntiUltimoMese(@PathVariable LocalDate now) {
        return new ResponseEntity<>(operatoreService.getAllAssuntiUltimoMese(now), HttpStatus.OK);
    }
}
