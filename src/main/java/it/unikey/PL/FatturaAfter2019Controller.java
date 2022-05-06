package it.unikey.PL;

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
@RequestMapping("/api/v1/fatturaAfter2019")
@CrossOrigin("http://localhost:8080")
public class FatturaAfter2019Controller {

    private final FatturaService fatturaService;

    @GetMapping()
    public ResponseEntity<List<FatturaResponseDTO>> getAfter31122019(){
        return new ResponseEntity<>(fatturaService.findAfter31122019(), HttpStatus.OK);
    }
}
