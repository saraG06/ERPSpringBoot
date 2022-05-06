package it.unikey.erpspringboot.PL;

import it.unikey.erpspringboot.BLL.dto.Response.FatturaResponseDTO;
import it.unikey.erpspringboot.BLL.service.abstraction.FatturaService;
import it.unikey.erpspringboot.DAL.Entity.Fattura;
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
@RequestMapping("/api/fattura/filterdata")
@CrossOrigin("http://localhost:8080")
public class FatturaControllerFilterData {

    private FatturaService fatturaService;

    @GetMapping
    public ResponseEntity<List<FatturaResponseDTO>> getAllFattureEmesseDopo31_12_2019() {
        return new ResponseEntity<>(fatturaService.getAllFattureEmesseDopo31_12_2019(), HttpStatus.OK);
    }
}
