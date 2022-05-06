package PL;

import BLL.dto.request.OperatoreRequestDTO;
import BLL.dto.response.AziendaResponseDTO;
import BLL.dto.response.ClienteResponseDTO;
import BLL.dto.response.OperatoreResponseDTO;
import BLL.service.astratti.OperatoreService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/v1/operatore")
@CrossOrigin("http://localhost:8080")
public class OperatoreController {
    private final OperatoreService operatoreService;

    @PostMapping
    public ResponseEntity<Void> save(@RequestBody OperatoreRequestDTO operatoreRequestDTO) {
        operatoreService.saveOperatore(operatoreRequestDTO);
        return new ResponseEntity<>(HttpStatus.CREATED);
    }

    @GetMapping(path = "/{id}")
    public ResponseEntity<OperatoreResponseDTO> getById(@PathVariable Long id){
        try {
            return new ResponseEntity<>(operatoreService.findbyId(id),HttpStatus.OK);
        } catch (NullPointerException e){
            return new ResponseEntity<>(operatoreService.findbyId(id),HttpStatus.NOT_FOUND);
        }
    }

    @GetMapping(path = "/{id}")
    public ResponseEntity<OperatoreResponseDTO> deleteOperatoreById(@PathVariable Long id){
        operatoreService.deleteById(id);
        return new ResponseEntity<>(HttpStatus.OK);
    }
}
