package it.unikey.erp_springboot.PL.Controller;

import it.unikey.erp_springboot.BLL.dto.request.ContactRequestDTO;
import it.unikey.erp_springboot.BLL.dto.response.ContactResponseDTO;
import it.unikey.erp_springboot.BLL.service.abstraction.ContactService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/v1/contact")
@CrossOrigin("http://localhost:8080")
public class ContactController {

    private final ContactService contactService;

    @PostMapping
    public ResponseEntity<Void> save(@RequestBody ContactRequestDTO contactRequestDTO){
        contactService.saveContact(contactRequestDTO);
        return new ResponseEntity<>(HttpStatus.CREATED);
    }

    @GetMapping(path = "/{id}")
    public ResponseEntity<ContactResponseDTO> findById(@PathVariable Long id){
        return new ResponseEntity<>(contactService.findById(id), HttpStatus.OK);
    }

    @DeleteMapping(path = "/{id}")
    public ResponseEntity<Void> deleteById(@PathVariable Long id){
        contactService.deleteContactById(id);
        return new ResponseEntity<>(HttpStatus.OK);
    }

    @GetMapping
    public ResponseEntity<List<ContactResponseDTO>> findAll(){
        return new ResponseEntity<>(contactService.findAllContact(), HttpStatus.OK);
    }


}
