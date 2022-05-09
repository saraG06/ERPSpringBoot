package it.unikey.erpspring.PL.Controller;

import it.unikey.erpspring.BLL.DTO.request.ClientRequestDTO;
import it.unikey.erpspring.BLL.DTO.request.InvoiceRequestDTO;
import it.unikey.erpspring.BLL.DTO.response.ClientResponseDTO;
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
    public ResponseEntity<InvoiceResponseDTO> findById(@PathVariable Long id){
        return new ResponseEntity<>(invoiceService.findById(id), HttpStatus.OK);
    }


    @GetMapping
    public ResponseEntity<List<InvoiceResponseDTO>> getAllInvoicesClientReply(){
        return new ResponseEntity<>(invoiceService.getAllInvoicesClientReply(), HttpStatus.OK);
    }

    // Da gestire in un altro controller
    // List<InvoiceResponseDTO> getAllInvoicesAfter2019();
}
