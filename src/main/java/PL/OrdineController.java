package PL;

import BLL.mapper.dto.request.OperatoreRequestDTO;
import BLL.mapper.dto.request.OrdineRequestDTO;
import BLL.mapper.dto.response.OperatoreResponseDTO;
import BLL.mapper.dto.response.OrdineResponseDTO;
import BLL.service.abstraction.OrdineService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.persistence.EntityNotFoundException;
import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/v1/ordine")
@CrossOrigin("http://localhost:8080")
public class OrdineController {

    private OrdineService ordineService;

    @PostMapping
    public ResponseEntity<Void> save(@RequestBody OrdineRequestDTO ordineRequestDTO){
        ordineService.saveOrdine(ordineRequestDTO);
        return new ResponseEntity<>(HttpStatus.CREATED);
    }

    @GetMapping(path= "/{id}")      //le graffe indicano una variabile
    public ResponseEntity<OrdineResponseDTO> getById(@PathVariable Long id) {
        try {
            return new ResponseEntity<>(ordineService.findById(id), HttpStatus.OK);
        } catch (EntityNotFoundException e) {
            e.printStackTrace();
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }

    @DeleteMapping(path="/{id}")
    public ResponseEntity<Void> delete(@PathVariable Long id){
        try{
            ordineService.deleteById(id);
            return new ResponseEntity<>(HttpStatus.OK);
        } catch(EntityNotFoundException e){
            e.printStackTrace();
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }

    @GetMapping()
    public ResponseEntity<List<OrdineResponseDTO>> getAll(){
        return new ResponseEntity<>(ordineService.findAllOrdine(), HttpStatus.OK);
    }

    @GetMapping()
    public ResponseEntity<List<OrdineResponseDTO>> getOrdiniSenzaFattura(){
        return new ResponseEntity<>(ordineService.findOrdiniSenzaFattura(), HttpStatus.OK);
    }
}
