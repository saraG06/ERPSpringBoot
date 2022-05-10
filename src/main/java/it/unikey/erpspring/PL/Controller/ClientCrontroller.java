package it.unikey.erpspring.PL.Controller;

import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;
import it.unikey.erpspring.BLL.DTO.response.OrderResponseDTO;
import it.unikey.erpspring.BLL.service.abstraction.ClientService;
import it.unikey.erpspring.BLL.service.exception.EntityNotFoundException;
import it.unikey.erpspring.BLL.DTO.request.ClientRequestDTO;
import it.unikey.erpspring.BLL.DTO.response.ClientResponseDTO;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/v1/client")
@CrossOrigin("http://localhost:8080")
public class ClientCrontroller {

    private final ClientService clientService;

    @PostMapping
    @ApiOperation(value = "metodo per aggiungere un client")
    @ApiResponses(value ={
            @ApiResponse(code = 201, message = "ha creato effettivamente la risorsa"),
            @ApiResponse(code = 403, message = "non hai le autorizzazioni per aggiungere un client")})
    public ResponseEntity<Void> save(@RequestBody ClientRequestDTO clientRequestDTO) {

        clientService.saveClient(clientRequestDTO);

        return new ResponseEntity<>(HttpStatus.CREATED);

    }

    @GetMapping(path = "/{id}")
    public ResponseEntity<ClientResponseDTO> getById(@PathVariable Long id){
        try {
            return new ResponseEntity<>(clientService.getClientById(id), HttpStatus.OK);
        } catch (EntityNotFoundException e) {
            e.printStackTrace();
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }

    @GetMapping
    public ResponseEntity<List<ClientResponseDTO>> getAll(){

        return new ResponseEntity<>(clientService.getAllClient(), HttpStatus.OK);

    }

    @DeleteMapping(path = "/{id}")
    public ResponseEntity<Void> deleteById(@PathVariable Long id){
        try {
            clientService.deleteClientById(id);
            return new ResponseEntity<>(HttpStatus.OK);
        } catch (EntityNotFoundException e) {
            e.printStackTrace();
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }

}
