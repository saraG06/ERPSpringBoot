package it.unikey.PL;

import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;
import it.unikey.BLL.mapper.dto.request.ClienteRequestDTO;
import it.unikey.BLL.mapper.dto.response.ClienteResponseDTO;
import it.unikey.BLL.service.abstraction.ClienteService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.persistence.EntityNotFoundException;
import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/v1/cliente")
@CrossOrigin("http://localhost:8080")
public class ClienteController {

    private final ClienteService clienteService;

    @PostMapping
    @ApiOperation(value= "Metodo per aggiungere un cliente")
    @ApiResponses(value= {
            @ApiResponse(code= 200, message= "richiesta ricevuta ed eseguita"),     //OK
            @ApiResponse(code= 201, message= "ha creato la risorsa"),   //CREATE SUCCESSFULLY
            @ApiResponse(code= 404, message= "pagina non trovata")      //PAGE NOT FOUND
    })
    public ResponseEntity<Void> save(@RequestBody ClienteRequestDTO clienteRequestDTO){
        clienteService.saveCliente(clienteRequestDTO);
        return new ResponseEntity<>(HttpStatus.CREATED);
    }

    @GetMapping(path= "/{id}")      //le graffe indicano una variabile
    @ApiOperation(value= "Metodo per cercare un cliente dall'id")
    @ApiResponses(value= {
            @ApiResponse(code= 200, message= "richiesta ricevuta ed eseguita"),
            @ApiResponse(code= 404, message= "risorsa non trovata")
    })
    public ResponseEntity<ClienteResponseDTO> getById(@PathVariable Long id) {
        try {
            return new ResponseEntity<>(clienteService.findById(id), HttpStatus.OK);
        } catch (EntityNotFoundException e) {
            e.printStackTrace();
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }

    @PutMapping(path="/{id}")
    @ApiOperation(value= "Metodo per cancellare un cliente dall'id")
    @ApiResponses(value= {
            @ApiResponse(code= 200, message= "richiesta ricevuta ed eseguita"),
            @ApiResponse(code= 404, message= "risorsa non trovata")
    })
    public ResponseEntity<Void> delete(@PathVariable Long id){
        try{
            clienteService.deleteById(id);
            return new ResponseEntity<>(HttpStatus.OK);
        } catch(EntityNotFoundException e){
            e.printStackTrace();
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }

    @GetMapping()
    @ApiOperation(value= "Metodo per cercare i clienti")
    @ApiResponses(value= {
            @ApiResponse(code= 200, message= "richiesta ricevuta ed eseguita"),
            @ApiResponse(code= 404, message= "risorsa non trovata")
    })
    public ResponseEntity<List<ClienteResponseDTO>> getAll(){
        return new ResponseEntity<>(clienteService.findAllCliente(), HttpStatus.OK);
    }

}
