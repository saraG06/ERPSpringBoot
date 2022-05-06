package PL;

import BLL.dto.request.DipendenteRequestDTO;
import BLL.dto.response.AziendaResponseDTO;
import BLL.dto.response.ClienteResponseDTO;
import BLL.dto.response.DipendenteResponseDTO;
import BLL.service.astratti.DipendenteService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/v1/dipendente")
@CrossOrigin("http://localhost:8080")
public class DipendenteController {
    private final DipendenteService dipendenteService;

    @PostMapping
    public ResponseEntity<Void> save(@RequestBody DipendenteRequestDTO dipendenteRequestDTO) {
        dipendenteService.saveDipendente(dipendenteRequestDTO);
        return new ResponseEntity<>(HttpStatus.CREATED);
    }

    @GetMapping(path = "/{id}")
    public ResponseEntity<DipendenteResponseDTO> getById(@PathVariable Long id){
        try {
            return new ResponseEntity<>(dipendenteService.findbyId(id),HttpStatus.OK);
        } catch (NullPointerException e){
            return new ResponseEntity<>(dipendenteService.findbyId(id),HttpStatus.NOT_FOUND);
        }
    }

    @GetMapping(path = "/{id}")
    public ResponseEntity<DipendenteResponseDTO> deleteDipendenteById(@PathVariable Long id){
        dipendenteService.deleteById(id);
        return new ResponseEntity<>(HttpStatus.OK);
    }
}
