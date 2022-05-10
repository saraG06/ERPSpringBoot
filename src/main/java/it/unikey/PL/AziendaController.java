package it.unikey.PL;

import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;
import it.unikey.BLL.mapper.dto.request.AziendaRequestDTO;
import it.unikey.BLL.mapper.dto.response.AziendaResponseDTO;
import it.unikey.BLL.service.abstraction.AziendaService;
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

    private final AziendaService aziendaService;

    @PostMapping
    @ApiOperation(value= "Metodo per aggiungere un'azienda")
    @ApiResponses(value= {
            @ApiResponse(code= 200, message= "richiesta ricevuta ed eseguita"),     //OK
            @ApiResponse(code= 201, message= "ha creato la risorsa"),   //CREATE SUCCESSFULLY
          //@ApiResponse(code= 204, message= "..."),                    //DELETE/UPDATE SUCCESFULLY (no return)
            @ApiResponse(code= 404, message= "pagina non trovata")      //PAGE NOT FOUND
    })
    public ResponseEntity<Void> save(@RequestBody AziendaRequestDTO aziendaRequestDTO){
        aziendaService.saveAzienda(aziendaRequestDTO);
        return new ResponseEntity<>(HttpStatus.CREATED);
    }

    @GetMapping(path= "/{id}")      //le graffe indicano una variabile
    @ApiOperation(value= "Metodo per cercare un'azienda dall'id")
    @ApiResponses(value= {
            @ApiResponse(code= 200, message= "richiesta ricevuta ed eseguita"),
            @ApiResponse(code= 404, message= "risorsa non trovata")
    })
    public ResponseEntity<AziendaResponseDTO> getById(@PathVariable Long id) {
        try {
            return new ResponseEntity<>(aziendaService.findById(id), HttpStatus.OK);
        } catch (EntityNotFoundException e) {
            e.printStackTrace();
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }

    @PutMapping(path="/{id}")
    @GetMapping(path= "/{id}")      //le graffe indicano una variabile
    @ApiOperation(value= "Metodo per cancellare un'azienda dall'id")
    @ApiResponses(value= {
            @ApiResponse(code= 200, message= "richiesta ricevuta ed eseguita"),
            @ApiResponse(code= 404, message= "risorsa non trovata")
    })
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
    @ApiOperation(value= "Metodo per cercare le aziende")
    @ApiResponses(value= {
            @ApiResponse(code= 200, message= "richiesta ricevuta ed eseguita"),
            @ApiResponse(code= 404, message= "risorsa non trovata")
    })
    public ResponseEntity<List<AziendaResponseDTO>> getAll(){
        return new ResponseEntity<>(aziendaService.findAllAzienda(), HttpStatus.OK);
    }

}
