package it.unikey.erpspringboot.PL;

import it.unikey.erpspringboot.BLL.dto.Response.FatturaResponseDTO;
import it.unikey.erpspringboot.BLL.service.abstraction.FatturaService;
import it.unikey.erpspringboot.DAL.Entity.Cliente;
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
@RequestMapping("/api/fattura/filterget")
@CrossOrigin("http://localhost:8080")
public class FatturaControllerFilterCliente {

    private FatturaService fatturaService;

    @GetMapping
    public ResponseEntity<List<FatturaResponseDTO>> getAllFattureClienteReply() {
        return new ResponseEntity<>(fatturaService.getAllFattureClienteReply(), HttpStatus.OK);
    }

    @GetMapping(path = "/{cliente}")
    public ResponseEntity<List<FatturaResponseDTO>> getAllFattureCliente(Cliente cliente) {
        return new ResponseEntity<>(fatturaService.getAllFattureCliente(cliente),HttpStatus.OK);
    }
}
