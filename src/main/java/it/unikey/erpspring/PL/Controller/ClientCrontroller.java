package it.unikey.erpspring.PL.Controller;

import it.unikey.erpspring.BLL.service.abstraction.ClientService;
import it.unikey.erpspring.BLL.service.exception.EntityNotFoundException;
import it.unikey.erpspring.BLL.DTO.request.ClientRequestDTO;
import it.unikey.erpspring.BLL.DTO.response.ClientResponseDTO;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/v1/client")
@CrossOrigin("http://localhost:8080")
public class ClientCrontroller {

    private final ClientService clientService;

    @PostMapping
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



}
