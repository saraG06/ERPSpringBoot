package it.unikey.erpspring.PL;

import it.unikey.erpspring.BLL.dto.request.FatturaRequestDTO;
import it.unikey.erpspring.BLL.dto.response.FatturaResponseDTO;
import it.unikey.erpspring.BLL.service.astratti.FatturaService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/v1/fattura")
@CrossOrigin("http://localhost:8080")
public class FatturaController {
    private final FatturaService fatturaService;

    @PostMapping
    public ResponseEntity<Void> save(@RequestBody FatturaRequestDTO fatturaRequestDTO) {
        fatturaService.saveFattura(fatturaRequestDTO);
        return new ResponseEntity<>(HttpStatus.CREATED);
    }

    @GetMapping(path = "/{id}")
    public ResponseEntity<FatturaResponseDTO> getById(@PathVariable Long id){
        try {
            return new ResponseEntity<>(fatturaService.findbyId(id),HttpStatus.OK);
        } catch (NullPointerException e){
            return new ResponseEntity<>(fatturaService.findbyId(id),HttpStatus.NOT_FOUND);
        }
    }

    @GetMapping(path = "/{id}")
    public ResponseEntity<FatturaResponseDTO> deleteFatturaById(@PathVariable Long id){
        fatturaService.deleteById(id);
        return new ResponseEntity<>(HttpStatus.OK);
    }
}
