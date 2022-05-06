package PL;

import BLL.dto.request.FatturaRequestDTO;
import BLL.dto.response.AziendaResponseDTO;
import BLL.dto.response.FatturaResponseDTO;
import BLL.service.astratti.FatturaService;
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
}
