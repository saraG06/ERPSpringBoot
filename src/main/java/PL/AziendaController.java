package PL;

import BLL.mapper.dto.request.AziendaRequestDTO;
import BLL.mapper.dto.response.AziendaResponseDTO;
import BLL.service.abstraction.AziendaService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.persistence.EntityNotFoundException;
import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/v1/azienda")
@CrossOrigin("http://localhost:8080")
public class AziendaController {

    private AziendaService aziendaService;

    @PostMapping
    public ResponseEntity<Void> save(@RequestBody AziendaRequestDTO aziendaRequestDTO){
        aziendaService.saveAzienda(aziendaRequestDTO);
        return new ResponseEntity<>(HttpStatus.CREATED);
    }

    @GetMapping(path= "/{id}")      //le graffe indicano una variabile
    public ResponseEntity<AziendaResponseDTO> getById(@PathVariable Long id) {
        try {
            return new ResponseEntity<>(aziendaService.findById(id), HttpStatus.OK);
        } catch (EntityNotFoundException e) {
            e.printStackTrace();
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }

    @DeleteMapping(path="/{id}")
    public ResponseEntity<Void> delete(@PathVariable Long id){
        try{
            aziendaService.deleteById(id);
            return new ResponseEntity<>(HttpStatus.OK);
        } catch(EntityNotFoundException e){
            e.printStackTrace();
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }

    @GetMapping()
    public ResponseEntity<List<AziendaResponseDTO>> getAll(){
        return new ResponseEntity<>(aziendaService.findAllAzienda(), HttpStatus.OK);
    }

    @GetMapping()
    public ResponseEntity<Integer> getNDipendenti(){
        return new ResponseEntity<>(aziendaService.numeroDipendenti(), HttpStatus.OK);
    }
}
