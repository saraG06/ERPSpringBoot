package it.unikey.erpspring.PL.controller;

import it.unikey.erpspring.BLL.DTO.request.ContactRequestDTO;
import it.unikey.erpspring.BLL.DTO.response.ContactResponseDTO;
import it.unikey.erpspring.BLL.DTO.response.InvoiceResponseDTO;
import it.unikey.erpspring.BLL.service.abstraction.ContactService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/v1/contact/getinvoice")
@CrossOrigin("http://localhost:8080")
public class ContactControllerGetInvoice {

    private final ContactService contactService;

    @GetMapping(path = "/{contactRequestDTO}")
    public ResponseEntity<List<InvoiceResponseDTO>> getInvoicesFromClient(@PathVariable ContactRequestDTO contactRequestDTO){
        return new ResponseEntity<>(contactService.getInvoicesFromClient(contactRequestDTO), HttpStatus.OK);
    }
}
