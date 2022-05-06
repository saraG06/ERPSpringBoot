package PL;

import BLL.dto.request.ContattoRequestDTO;
import BLL.dto.response.AziendaResponseDTO;
import BLL.dto.response.ClienteResponseDTO;
import BLL.dto.response.ContattoResponseDTO;
import BLL.service.astratti.ContattoService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/v1/contatto")
@CrossOrigin("http://localhost:8080")
public class ContattoController {
    private final ContattoService contattoService;

    @PostMapping
    public ResponseEntity<Void> save(@RequestBody ContattoRequestDTO collaboratoreRequestDTO) {
        contattoService.saveContatto(collaboratoreRequestDTO);
        return new ResponseEntity<>(HttpStatus.CREATED);
    }

    @GetMapping(path = "/{id}")
    public ResponseEntity<ContattoResponseDTO> getById(@PathVariable Long id){
        try {
            return new ResponseEntity<>(contattoService.findbyId(id),HttpStatus.OK);
        } catch (NullPointerException e){
            return new ResponseEntity<>(contattoService.findbyId(id),HttpStatus.NOT_FOUND);
        }
    }

    @GetMapping(path = "/{id}")
    public ResponseEntity<ContattoResponseDTO> deleteContattoById(@PathVariable Long id){
        contattoService.deleteById(id);
        return new ResponseEntity<>(HttpStatus.OK);
    }
}
