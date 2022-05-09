package it.unikey.PL.controller;

import it.unikey.BLL.dto.request.InvoiceRequestDTO;
import it.unikey.BLL.dto.response.InvoiceResponseDTO;
import it.unikey.BLL.exception.IdNotFoundException;
import it.unikey.BLL.service.abstraction.InvoiceService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/v1/invoice")
@CrossOrigin("http://localhost:8080")
public class InvoiceController {

    private final InvoiceService invoiceService;

    @PostMapping
    public ResponseEntity<Void> save(@RequestBody InvoiceRequestDTO invoiceRequestDTO) {
        invoiceService.saveInvoice(invoiceRequestDTO);
        return new ResponseEntity<>(HttpStatus.CREATED);
    }

    @GetMapping(path = "/{id}")
    public ResponseEntity<InvoiceResponseDTO> getById(@PathVariable Long id) throws IdNotFoundException {
        return new ResponseEntity<>(invoiceService.findById(id), HttpStatus.OK);
    }
}
