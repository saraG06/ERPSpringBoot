package it.unikey.erpspring.PL.controller;

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
@RequestMapping("/api/v1/invoice")
@CrossOrigin("http://localhost:8080")
public class InvoiceController {

    private final InvoiceService invoiceService;

    @PostMapping
    public ResponseEntity<Void> save(@RequestBody InvoiceRequestDTO invoiceRequestDTO){
        invoiceService.saveInvoice(invoiceRequestDTO);
        return new ResponseEntity<>(HttpStatus.CREATED);
    }

    @GetMapping(path = "/{id}")
    public ResponseEntity<InvoiceResponseDTO> getById(@PathVariable Long id){
        return new ResponseEntity<>(invoiceService.findInvoiceById(id), HttpStatus.OK);
    }

    @GetMapping
    public ResponseEntity<List<InvoiceResponseDTO>> getInvoicesClientReply(){
        return new ResponseEntity<>(invoiceService.getInvoicesClientReply(), HttpStatus.OK);
    }
}
