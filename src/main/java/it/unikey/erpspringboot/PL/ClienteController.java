package it.unikey.erpspringboot.PL;

import it.unikey.erpspringboot.BLL.dto.Request.ClienteRequestDTO;
import it.unikey.erpspringboot.BLL.dto.Response.ClienteResponseDTO;
import it.unikey.erpspringboot.BLL.service.abstraction.ClienteService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/cliente")
@CrossOrigin("http://localhost:8080")
public class ClienteController {

    private ClienteService clienteService;

    @PostMapping
    public ResponseEntity<Void> save(@RequestBody ClienteRequestDTO clienteRequestDTO){

        try {
            clienteService.saveCliente(clienteRequestDTO);
            return new ResponseEntity<>(HttpStatus.CREATED);
        }catch (NullPointerException n){
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }

    @GetMapping(path="/{id}")
    public ResponseEntity<ClienteResponseDTO>  getById(@PathVariable Long id){
        return new ResponseEntity<>(clienteService.findById(id),HttpStatus.OK);
    }

    @GetMapping
    public ResponseEntity<List<ClienteResponseDTO>>  findAllAzienda(){
        return new ResponseEntity<>(clienteService.findAllCliente(),HttpStatus.OK);
    }

    @PutMapping(path="/{id}")
    public ResponseEntity<Void> deleteClienteById(@PathVariable Long id){

        try {
            clienteService.deleteClienteById(id);
            return new ResponseEntity<>(HttpStatus.OK);
        } catch (NullPointerException n){
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }
}
