package it.unikey.erp_springboot.PL.Controller;

import it.unikey.erp_springboot.BLL.dto.request.ClientRequestDTO;
import it.unikey.erp_springboot.BLL.dto.response.InvoiceResponseDTO;
import it.unikey.erp_springboot.BLL.service.abstraction.InvoiceService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDate;
import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/v1/invoice_3")
@CrossOrigin("http://localhost:8080")
public class InvoiceController3 {

    private final InvoiceService invoiceService;

    @GetMapping
    public ResponseEntity<List<InvoiceResponseDTO>> getInvoiceByDateIsAfter(LocalDate date){
        return new ResponseEntity<>(invoiceService.findInvoiceByDateIsAfter(date), HttpStatus.OK);
    }
}
