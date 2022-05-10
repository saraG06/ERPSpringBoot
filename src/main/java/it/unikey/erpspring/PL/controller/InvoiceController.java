package it.unikey.erpspring.PL.controller;

import it.unikey.erpspring.BLL.DTO.request.ClientRequestDTO;
import it.unikey.erpspring.BLL.DTO.request.EmployeeRequestDTO;
import it.unikey.erpspring.BLL.DTO.request.InvoiceRequestDTO;
import it.unikey.erpspring.BLL.DTO.response.InvoiceResponseDTO;
import it.unikey.erpspring.BLL.service.abstraction.InvoiceService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/v1/contact")
@CrossOrigin("http://localhost:8080")

public class InvoiceController {

    private final InvoiceService invoiceService;

    @PostMapping
    public ResponseEntity<Void> saveCompany(@RequestBody InvoiceRequestDTO invoiceRequestDTO) {
        invoiceService.saveInvoice(invoiceRequestDTO);
        return new ResponseEntity<>(HttpStatus.CREATED);
    }

    @GetMapping (path = "/{byClient}")
    public ResponseEntity <List<InvoiceResponseDTO>> getAllInvoicesByClient (ClientRequestDTO clientRequestDTO) {
        return new ResponseEntity<>(invoiceService.getAllInvoicesByClient(clientRequestDTO), HttpStatus.OK);
    }

    @GetMapping
    public ResponseEntity <List<InvoiceResponseDTO>> getAllInvoicesAfter2019 (ClientRequestDTO clientRequestDTO) {
        return new ResponseEntity<>(invoiceService.getAllInvoicesAfter2019(), HttpStatus.OK);
    }

}
