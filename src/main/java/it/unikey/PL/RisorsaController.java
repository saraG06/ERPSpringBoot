package it.unikey.PL;

import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;
import it.unikey.BLL.Exception.LowRoleException;
import it.unikey.BLL.mapper.dto.request.DipendenteRequestDTO;
import it.unikey.BLL.mapper.dto.request.RisorsaRequestDTO;
import it.unikey.BLL.mapper.dto.response.RisorsaResponseDTO;
import it.unikey.BLL.service.abstraction.RisorsaService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.persistence.EntityNotFoundException;
import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/v1/risorsa")
@CrossOrigin("http://localhost:8080")
public class RisorsaController {

    private final RisorsaService risorsaService;

    @PostMapping
    @ApiOperation(value= "Metodo per assegnare una risorsa ad un dipendente (dip) se l'assegnatore (capo) ha un ruolo maggiore")
    @ApiResponses(value= {
            @ApiResponse(code= 200, message= "richiesta ricevuta ed eseguita"),
            @ApiResponse(code= 404, message= "risorsa non trovata")
    })
    public ResponseEntity<Void> assegnaRisorsa(DipendenteRequestDTO capo, DipendenteRequestDTO dip, @RequestBody RisorsaRequestDTO risorsaRequestDTO) throws LowRoleException {
        risorsaService.assegnaRisorsa(capo, dip, risorsaRequestDTO);
        return new ResponseEntity<>(HttpStatus.CREATED);
    }

    @GetMapping(path= "/{id}")      //le graffe indicano una variabile
    @ApiOperation(value= "Metodo per cercare una risorsa dall'id")
    @ApiResponses(value= {
            @ApiResponse(code= 200, message= "richiesta ricevuta ed eseguita"),
            @ApiResponse(code= 404, message= "risorsa non trovata")
    })
    public ResponseEntity<RisorsaResponseDTO> getById(@PathVariable Long id) {
        try {
            return new ResponseEntity<>(risorsaService.findById(id), HttpStatus.OK);
        } catch (EntityNotFoundException e) {
            e.printStackTrace();
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }

    @PutMapping(path="/{id}")
    @ApiOperation(value= "Metodo per cancellare una risorsa dall'id")
    @ApiResponses(value= {
            @ApiResponse(code= 200, message= "richiesta ricevuta ed eseguita"),
            @ApiResponse(code= 404, message= "risorsa non trovata")
    })
    public ResponseEntity<Void> delete(@PathVariable Long id){
        try{
            risorsaService.deleteById(id);
            return new ResponseEntity<>(HttpStatus.OK);
        } catch(EntityNotFoundException e){
            e.printStackTrace();
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }

    @GetMapping()
    @ApiOperation(value= "Metodo per cercare le risorse")
    @ApiResponses(value= {
            @ApiResponse(code= 200, message= "richiesta ricevuta ed eseguita"),
            @ApiResponse(code= 404, message= "risorsa non trovata")
    })
    public ResponseEntity<List<RisorsaResponseDTO>> getAll(){
        return new ResponseEntity<>(risorsaService.findAllRisorsa(), HttpStatus.OK);
    }

}
