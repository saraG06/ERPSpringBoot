package it.unikey.erpspring.PL;

import it.unikey.erpspring.BLL.dto.request.AziendaRequestDTO;
import it.unikey.erpspring.BLL.dto.response.AziendaResponseDTO;
import it.unikey.erpspring.BLL.service.astratti.AziendaService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController //dice la funzione della classe
@RequiredArgsConstructor //genera il costruttore
//che risorsa passiamo e le caratteristiche
//azienda è l'estità delle quali stiamo costruendo le api
@RequestMapping("/api/v1/azienda")
@CrossOrigin("http://localhost:8080")
public class AziendaController {
    //@Autowired
    private final AziendaService aziendaService;

    @PostMapping
    public ResponseEntity<Void> save(@RequestBody AziendaRequestDTO aziendaRequestDTO) {
        aziendaService.saveAzienda(aziendaRequestDTO);
        return new ResponseEntity<>(HttpStatus.CREATED);
    }

    @GetMapping(path = "/{id}")
    public ResponseEntity<AziendaResponseDTO> getById(@PathVariable Long id){
        try {
            return new ResponseEntity<>(aziendaService.findbyId(id),HttpStatus.OK);
        } catch (NullPointerException e){
            return new ResponseEntity<>(aziendaService.findbyId(id),HttpStatus.NOT_FOUND);
        }
    }
}
