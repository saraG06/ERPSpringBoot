package it.unikey.erpspring.PL.Controller;

import it.unikey.erpspring.BLL.DTO.request.RisorsaRequestDTO;
import it.unikey.erpspring.BLL.DTO.response.RisorsaResponseDTO;
import it.unikey.erpspring.BLL.DTO.response.WorkerResponseDTO;
import it.unikey.erpspring.BLL.service.abstraction.RisorsaService;
import it.unikey.erpspring.BLL.service.exception.EntityNotFoundException;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/v1/Risorsa")
@CrossOrigin("http://localhost:8080")
public class RisorsaController {

    public final RisorsaService risorsaService;

    @PostMapping
    public ResponseEntity<Void> save(@RequestBody RisorsaRequestDTO risorsaRequestDTO){

        risorsaService.saveRisorsa(risorsaRequestDTO);
        return new ResponseEntity<>(HttpStatus.CREATED);

    }

    @GetMapping(path = "/{id}")
    public ResponseEntity<RisorsaResponseDTO> getById(@PathVariable Long id){

        try {
            return new ResponseEntity<>(risorsaService.getRisorsaById(id),HttpStatus.OK);
        } catch (EntityNotFoundException e) {
            e.printStackTrace();
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }

    @GetMapping
    public ResponseEntity<List<RisorsaResponseDTO>> getAll(){

        return new ResponseEntity<>(risorsaService.getAllRisorsa(), HttpStatus.OK);

    }

    @DeleteMapping(path = "/{id}")
    public ResponseEntity<Void> deleteById(@PathVariable Long id) {
        try {
            risorsaService.deleteRisorsaById(id);
            return new ResponseEntity<>(HttpStatus.OK);
        } catch (EntityNotFoundException e) {
            e.printStackTrace();
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }

}
