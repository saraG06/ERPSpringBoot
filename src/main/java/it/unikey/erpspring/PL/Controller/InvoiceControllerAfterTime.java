package it.unikey.erpspring.PL.Controller;

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
@RequestMapping("/api/v1/invoiceAfterTime")
@CrossOrigin("http://localhost:8080")
public class InvoiceControllerAfterTime {

    public final InvoiceService invoiceService;

    @GetMapping
    public ResponseEntity<List<InvoiceResponseDTO>> getAll(){

        return new ResponseEntity<>(invoiceService.getAllInvoicesAfter2019(), HttpStatus.OK);

    }
}
