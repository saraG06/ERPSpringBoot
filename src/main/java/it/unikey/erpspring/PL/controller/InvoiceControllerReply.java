package it.unikey.erpspring.PL.controller;

import it.unikey.erpspring.BLL.DTO.response.InvoiceResponseDTO;
import it.unikey.erpspring.BLL.service.abstraction.InvoiceService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/v1/invoice/reply")
@CrossOrigin("http://localhost:8080")
public class InvoiceControllerReply {

    private final InvoiceService invoiceService;

    @GetMapping
    public ResponseEntity<List<InvoiceResponseDTO>> getInvoicesClientReply(){
        return new ResponseEntity<>(invoiceService.getInvoicesClientReply(), HttpStatus.OK);
    }
}
