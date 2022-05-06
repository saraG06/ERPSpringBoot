package PL;

import BLL.dto.request.ClienteRequestDTO;
import BLL.dto.response.AziendaResponseDTO;
import BLL.dto.response.ClienteResponseDTO;
import BLL.service.astratti.ClienteService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/v1/cliente")
@CrossOrigin("http://localhost:8080")
public class ClienteController {
    private final ClienteService clienteService;

    @PostMapping
    public ResponseEntity<Void> saveCliente(@RequestBody ClienteRequestDTO clienteRequestDTO) {
        clienteService.saveCliente(clienteRequestDTO);
        return new ResponseEntity<>(HttpStatus.CREATED);
    }

    @GetMapping(path = "/{id}")
    public ResponseEntity<ClienteResponseDTO> getClienteById(@PathVariable Long id){
        try {
            return new ResponseEntity<>(clienteService.findbyId(id),HttpStatus.OK);
        } catch (NullPointerException e){
            return new ResponseEntity<>(clienteService.findbyId(id),HttpStatus.NOT_FOUND);
        }
    }

    @GetMapping(path = "/{id}")
    public ResponseEntity<ClienteResponseDTO> deleteClienteById(@PathVariable Long id){
        clienteService.deleteById(id);
        return new ResponseEntity<>(HttpStatus.OK);
    }
}
