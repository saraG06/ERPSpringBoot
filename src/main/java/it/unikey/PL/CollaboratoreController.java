package it.unikey.PL;

import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;
import it.unikey.BLL.mapper.dto.request.CollaboratoreRequestDTO;
import it.unikey.BLL.mapper.dto.response.CollaboratoreResponseDTO;
import it.unikey.BLL.service.abstraction.CollaboratoreService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.persistence.EntityNotFoundException;
import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/v1/collaboratore")
@CrossOrigin("http://localhost:8080")
public class CollaboratoreController {

    private final CollaboratoreService collaboratoreService;

    @PostMapping
    @ApiOperation(value= "Metodo per aggiungere un collaboratore")
    @ApiResponses(value= {
            @ApiResponse(code= 200, message= "richiesta ricevuta ed eseguita"),     //OK
            @ApiResponse(code= 201, message= "ha creato la risorsa"),   //CREATE SUCCESSFULLY
            @ApiResponse(code= 404, message= "pagina non trovata")      //PAGE NOT FOUND
    })
    public ResponseEntity<Void> save(@RequestBody CollaboratoreRequestDTO collaboratoreRequestDTO){
        collaboratoreService.saveCollaboratore(collaboratoreRequestDTO);
        return new ResponseEntity<>(HttpStatus.CREATED);
    }

    @GetMapping(path= "/{id}")      //le graffe indicano una variabile
    @ApiOperation(value= "Metodo per cercare un collaboratore dall'id")
    @ApiResponses(value= {
            @ApiResponse(code= 200, message= "richiesta ricevuta ed eseguita"),
            @ApiResponse(code= 404, message= "risorsa non trovata")
    })
    public ResponseEntity<CollaboratoreResponseDTO> getById(@PathVariable Long id) {
        try {
            return new ResponseEntity<>(collaboratoreService.findById(id), HttpStatus.OK);
        } catch (EntityNotFoundException e) {
            e.printStackTrace();
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }

    @PutMapping(path="/{id}")
    @ApiOperation(value= "Metodo per cancellare un collaboratore dall'id")
    @ApiResponses(value= {
            @ApiResponse(code= 200, message= "richiesta ricevuta ed eseguita"),
            @ApiResponse(code= 404, message= "risorsa non trovata")
    })
    public ResponseEntity<Void> delete(@PathVariable Long id){
        try{
            collaboratoreService.deleteById(id);
            return new ResponseEntity<>(HttpStatus.OK);
        } catch(EntityNotFoundException e){
            e.printStackTrace();
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }

    @GetMapping()
    @ApiOperation(value= "Metodo per cercare i collaboratori")
    @ApiResponses(value= {
            @ApiResponse(code= 200, message= "richiesta ricevuta ed eseguita"),
            @ApiResponse(code= 404, message= "risorsa non trovata")
    })
    public ResponseEntity<List<CollaboratoreResponseDTO>> getAll(){
        return new ResponseEntity<>(collaboratoreService.findAllCollaboratore(), HttpStatus.OK);
    }
}
