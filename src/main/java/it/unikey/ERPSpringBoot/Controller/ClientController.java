package it.unikey.ERPSpringBoot.Controller;

import it.unikey.ERPSpringBoot.BLL.dto.request.ClientRequestDto;
import it.unikey.ERPSpringBoot.BLL.dto.response.ClientResponseDto;
import it.unikey.ERPSpringBoot.BLL.service.abstraction.ClientService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController //dice a spring ..
@RequiredArgsConstructor //per lombok
@RequestMapping("/api/v1/client")
@CrossOrigin("http://localhost:8080")
public class ClientController {

    private final ClientService clientService;


    @PostMapping
    public ResponseEntity<Void> save(@RequestBody ClientRequestDto clientRequestDto) {
        clientService.saveClient(clientRequestDto);
        return new ResponseEntity<>(HttpStatus.CREATED);

    }
    @GetMapping(path = "/{id}")
    public ResponseEntity<ClientResponseDto> getById(@PathVariable Long id){
        return new ResponseEntity<>(clientService.findById(id), HttpStatus.OK);

    }







}
