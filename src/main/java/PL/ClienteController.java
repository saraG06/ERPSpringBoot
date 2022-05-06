package PL;

import BLL.mapper.dto.request.AziendaRequestDTO;
import BLL.mapper.dto.request.ClienteRequestDTO;
import BLL.mapper.dto.response.AziendaResponseDTO;
import BLL.mapper.dto.response.ClienteResponseDTO;
import BLL.service.abstraction.ClienteService;
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

    private ClienteService clienteService;

    @PostMapping
    public ResponseEntity<Void> save(@RequestBody ClienteRequestDTO clienteRequestDTO){
        clienteService.saveCliente(clienteRequestDTO);
        return new ResponseEntity<>(HttpStatus.CREATED);
    }

    @GetMapping(path= "/{id}")      //le graffe indicano una variabile
    public ResponseEntity<ClienteResponseDTO> getById(@PathVariable Long id) {
        try {
            return new ResponseEntity<>(clienteService.findById(id), HttpStatus.OK);
        } catch (EntityNotFoundException e) {
            e.printStackTrace();
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }

    @DeleteMapping(path="/{id}")
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
    public ResponseEntity<List<ClienteResponseDTO>> getAll(){
        return new ResponseEntity<>(clienteService.findAllCliente(), HttpStatus.OK);
    }

    @GetMapping()
    public ResponseEntity<List<ClienteResponseDTO>> getclienti10Contatti(){
        return new ResponseEntity<>(clienteService.clienti10Contatti(), HttpStatus.OK);
    }
}
