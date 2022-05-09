package it.unikey.erpspring.PL.Controller;

import it.unikey.erpspring.BLL.DTO.request.ContactRequestDTO;
import it.unikey.erpspring.BLL.DTO.response.ContactResponseDTO;
import it.unikey.erpspring.BLL.DTO.response.InvoiceResponseDTO;
import it.unikey.erpspring.BLL.service.abstraction.ContactService;
import it.unikey.erpspring.DAL.entity.Contact;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/v1/contact/invoicefromclient")
@CrossOrigin("http://localhost:8080")
public class ContactControllerInvoiceFromClient {

    private final ContactService contactService;

    @GetMapping(path = "/{contactRequestDTO}")
    public ResponseEntity<List<InvoiceResponseDTO>> getInvoiceFromClient(@PathVariable Contact contact){
        return new ResponseEntity<>(contactService.getInvoiceFromClient(contact), HttpStatus.OK);
    }
}
