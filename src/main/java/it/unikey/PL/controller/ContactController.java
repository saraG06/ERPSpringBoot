package it.unikey.PL.controller;

import it.unikey.BLL.dto.request.CompanyRequestDTO;
import it.unikey.BLL.dto.request.ContactRequestDTO;
import it.unikey.BLL.dto.response.CompanyResponseDTO;
import it.unikey.BLL.dto.response.ContactResponseDTO;
import it.unikey.BLL.exception.IdNotFoundException;
import it.unikey.BLL.service.abstraction.CompanyService;
import it.unikey.BLL.service.abstraction.ContactService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequiredArgsConstructor
@RequestMapping("api/v1/contact")
@CrossOrigin("http://localhost:8080")
public class ContactController {

    private final ContactService contactService;

    @PostMapping
    public ResponseEntity<Void> save(@RequestBody ContactRequestDTO contactRequestDTO) {
        contactService.saveContact(contactRequestDTO);
        return new ResponseEntity<>(HttpStatus.CREATED);
    }

    @GetMapping(path = "/{id}")
    public ResponseEntity<ContactResponseDTO> getById(@PathVariable Long id) throws IdNotFoundException {
        return new ResponseEntity<>(contactService.findById(id), HttpStatus.OK);

    }
}
