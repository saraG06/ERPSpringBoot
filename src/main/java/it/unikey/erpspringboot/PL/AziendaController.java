package it.unikey.erpspringboot.PL;

import it.unikey.erpspringboot.BLL.dto.Request.AziendaRequestDTO;
import it.unikey.erpspringboot.BLL.dto.Response.AziendaResponseDTO;
import it.unikey.erpspringboot.BLL.service.abstraction.AziendaService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/azienda")
@CrossOrigin("http://localhost:8080")
public class AziendaController {

    private AziendaService aziendaService;

    @PostMapping
    public ResponseEntity<Void> save(@RequestBody AziendaRequestDTO aziendaRequestDTO){

        try {
            aziendaService.saveAzienda(aziendaRequestDTO);
            return new ResponseEntity<>(HttpStatus.CREATED);
        }catch (NullPointerException n){
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }

    @GetMapping(path="/{id}")
    public ResponseEntity<AziendaResponseDTO>  getById(@PathVariable Long id){
        return new ResponseEntity<>(aziendaService.findById(id),HttpStatus.OK);
    }

    @GetMapping
    public ResponseEntity<List<AziendaResponseDTO>>  findAllAzienda(){
        return new ResponseEntity<>(aziendaService.findAllAzienda(),HttpStatus.OK);
    }

    @PutMapping(path="/{id}")
    public ResponseEntity<Void> deleteAziendaById(@PathVariable Long id){

        try {
            aziendaService.deleteAziendaById(id);
            return new ResponseEntity<>(HttpStatus.OK);
        } catch (NullPointerException n){
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }
}
