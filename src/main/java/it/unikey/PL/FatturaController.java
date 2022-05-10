package it.unikey.PL;

import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;
import it.unikey.BLL.mapper.dto.request.ContattoRequestDTO;
import it.unikey.BLL.mapper.dto.request.FatturaRequestDTO;
import it.unikey.BLL.mapper.dto.response.FatturaResponseDTO;
import it.unikey.BLL.service.abstraction.FatturaService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.persistence.EntityNotFoundException;
import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/v1/fattura")
@CrossOrigin("http://localhost:8080")
public class FatturaController {

    private final FatturaService fatturaService;

    @PostMapping
    @ApiOperation(value= "Metodo per aggiungere una fattura")
    @ApiResponses(value= {
            @ApiResponse(code= 200, message= "richiesta ricevuta ed eseguita"),     //OK
            @ApiResponse(code= 201, message= "ha creato la risorsa"),   //CREATE SUCCESSFULLY
            @ApiResponse(code= 404, message= "pagina non trovata")      //PAGE NOT FOUND
    })
    public ResponseEntity<Void> save(@RequestBody FatturaRequestDTO fatturaRequestDTO){
        fatturaService.saveFattura(fatturaRequestDTO);
        return new ResponseEntity<>(HttpStatus.CREATED);
    }

    @GetMapping(path= "/{id}")      //le graffe indicano una variabile
    @ApiOperation(value= "Metodo per cercare una fattura dall'id")
    @ApiResponses(value= {
            @ApiResponse(code= 200, message= "richiesta ricevuta ed eseguita"),
            @ApiResponse(code= 404, message= "risorsa non trovata")
    })
    public ResponseEntity<FatturaResponseDTO> getById(@PathVariable Long id) {
        try {
            return new ResponseEntity<>(fatturaService.findById(id), HttpStatus.OK);
        } catch (EntityNotFoundException e) {
            e.printStackTrace();
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }

    @PutMapping(path="/{id}")
    @ApiOperation(value= "Metodo per cancellare una fattura dall'id")
    @ApiResponses(value= {
            @ApiResponse(code= 200, message= "richiesta ricevuta ed eseguita"),
            @ApiResponse(code= 404, message= "risorsa non trovata")
    })
    public ResponseEntity<Void> delete(@PathVariable Long id){
        try{
            fatturaService.deleteById(id);
            return new ResponseEntity<>(HttpStatus.OK);
        } catch(EntityNotFoundException e){
            e.printStackTrace();
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }

    @GetMapping()
    @ApiOperation(value= "Metodo per cercare le fatture")
    @ApiResponses(value= {
            @ApiResponse(code= 200, message= "richiesta ricevuta ed eseguita"),
            @ApiResponse(code= 404, message= "risorsa non trovata")
    })
    public ResponseEntity<List<FatturaResponseDTO>> getAll(){
        return new ResponseEntity<>(fatturaService.findAllFattura(), HttpStatus.OK);
    }

}
