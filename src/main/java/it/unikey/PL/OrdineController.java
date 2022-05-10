package it.unikey.PL;

import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;
import it.unikey.BLL.mapper.dto.request.OrdineRequestDTO;
import it.unikey.BLL.mapper.dto.response.OrdineResponseDTO;
import it.unikey.BLL.service.abstraction.OrdineService;
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

    private final OrdineService ordineService;

    @PostMapping
    @ApiOperation(value= "Metodo per aggiungere un ordine")
    @ApiResponses(value= {
            @ApiResponse(code= 200, message= "richiesta ricevuta ed eseguita"),     //OK
            @ApiResponse(code= 201, message= "ha creato la risorsa"),   //CREATE SUCCESSFULLY
            @ApiResponse(code= 404, message= "pagina non trovata")      //PAGE NOT FOUND
    })
    public ResponseEntity<Void> save(@RequestBody OrdineRequestDTO ordineRequestDTO){
        ordineService.saveOrdine(ordineRequestDTO);
        return new ResponseEntity<>(HttpStatus.CREATED);
    }

    @GetMapping(path= "/{id}")      //le graffe indicano una variabile
    @ApiOperation(value= "Metodo per cercare un ordine dall'id")
    @ApiResponses(value= {
            @ApiResponse(code= 200, message= "richiesta ricevuta ed eseguita"),
            @ApiResponse(code= 404, message= "risorsa non trovata")
    })
    public ResponseEntity<OrdineResponseDTO> getById(@PathVariable Long id) {
        try {
            return new ResponseEntity<>(ordineService.findById(id), HttpStatus.OK);
        } catch (EntityNotFoundException e) {
            e.printStackTrace();
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }

    @PutMapping(path="/{id}")
    @ApiOperation(value= "Metodo per cancellare un ordine dall'id")
    @ApiResponses(value= {
            @ApiResponse(code= 200, message= "richiesta ricevuta ed eseguita"),
            @ApiResponse(code= 404, message= "risorsa non trovata")
    })
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
    @ApiOperation(value= "Metodo per cercare gli ordini")
    @ApiResponses(value= {
            @ApiResponse(code= 200, message= "richiesta ricevuta ed eseguita"),
            @ApiResponse(code= 404, message= "risorsa non trovata")
    })
    public ResponseEntity<List<OrdineResponseDTO>> getAll(){
        return new ResponseEntity<>(ordineService.findAllOrdine(), HttpStatus.OK);
    }

}
