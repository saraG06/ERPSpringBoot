package it.unikey.erpspring.PL.Controller;

import it.unikey.erpspring.BLL.DTO.request.ContactRequestDTO;
import it.unikey.erpspring.BLL.DTO.response.ContactResponseDTO;
import it.unikey.erpspring.BLL.DTO.response.OrderResponseDTO;
import it.unikey.erpspring.BLL.service.abstraction.ContactService;
import it.unikey.erpspring.BLL.service.exception.EntityNotFoundException;
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

    public final ContactService contactService;

    @PostMapping
    public ResponseEntity<Void> save(@RequestBody ContactRequestDTO contactRequestDTO){

        contactService.saveContact(contactRequestDTO);

        return new ResponseEntity<>(HttpStatus.CREATED);

    }

    @GetMapping(path = "/{id}")
    public ResponseEntity<ContactResponseDTO> getById(@PathVariable Long id){

        try {
            return new ResponseEntity<>(contactService.getContactById(id), HttpStatus.OK);
        } catch (EntityNotFoundException e) {
            e.printStackTrace();
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }

    }

    @GetMapping
    public ResponseEntity<List<ContactResponseDTO>> getAll(){

        return new ResponseEntity<>(contactService.getAllContact(), HttpStatus.OK);

    }

    @DeleteMapping(path = "/{id}")
    public ResponseEntity<Void> deleteById(@PathVariable Long id) {
        try {
            contactService.deleteContactById(id);
            return new ResponseEntity<>(HttpStatus.OK);
        } catch (EntityNotFoundException e) {
            e.printStackTrace();
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }



}
