package it.unikey.PL;

import it.unikey.BLL.mapper.dto.request.ContattoRequestDTO;
import it.unikey.BLL.mapper.dto.response.FatturaResponseDTO;
import it.unikey.BLL.service.abstraction.FatturaService;
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
@RequestMapping("/api/v1/fatturaContatto")
@CrossOrigin("http://localhost:8080")
public class FatturaContattoController {

    private final FatturaService fatturaService;

    @GetMapping()
    public ResponseEntity<List<FatturaResponseDTO>> getAllFatturaContatto(ContattoRequestDTO contattoRequestDTO){
        return new ResponseEntity<>(fatturaService.findAllFatturaContatto(contattoRequestDTO), HttpStatus.OK);
    }
}
