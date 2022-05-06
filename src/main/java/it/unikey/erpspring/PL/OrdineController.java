package it.unikey.erpspring.PL;

import it.unikey.erpspring.BLL.dto.request.OrdineRequestDTO;
import it.unikey.erpspring.BLL.dto.response.OrdineResponseDTO;
import it.unikey.erpspring.BLL.service.astratti.OrdineService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/v1/ordine")
@CrossOrigin("http://localhost:8080")
public class OrdineController {
    private final OrdineService ordineService;

    @PostMapping
    public ResponseEntity<Void> save(@RequestBody OrdineRequestDTO ordineRequestDTO) {
        ordineService.saveOrdine(ordineRequestDTO);
        return new ResponseEntity<>(HttpStatus.CREATED);
    }

    @GetMapping(path = "/{id}")
    public ResponseEntity<OrdineResponseDTO> getById(@PathVariable Long id){
        try {
            return new ResponseEntity<>(ordineService.findbyId(id),HttpStatus.OK);
        } catch (NullPointerException e){
            return new ResponseEntity<>(ordineService.findbyId(id),HttpStatus.NOT_FOUND);
        }
    }

    @GetMapping(path = "/{id}")
    public ResponseEntity<OrdineResponseDTO> deleteOrdineById(@PathVariable Long id){
        ordineService.deleteById(id);
        return new ResponseEntity<>(HttpStatus.OK);
    }
}
