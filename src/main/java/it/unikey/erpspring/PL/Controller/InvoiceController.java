package it.unikey.erpspring.PL.Controller;

import it.unikey.erpspring.BLL.DTO.request.InvoiceRequestDTO;
import it.unikey.erpspring.BLL.DTO.response.InvoiceResponseDTO;
import it.unikey.erpspring.BLL.DTO.response.OrderResponseDTO;
import it.unikey.erpspring.BLL.service.abstraction.InvoiceService;
import it.unikey.erpspring.BLL.service.exception.EntityNotFoundException;
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

    public final InvoiceService invoiceService;

    @PostMapping
    public ResponseEntity<Void> save(@RequestBody InvoiceRequestDTO invoiceRequestDTO){

        invoiceService.saveInvoice(invoiceRequestDTO);
        return new ResponseEntity<>(HttpStatus.CREATED);

    }

    @GetMapping(path = "/{id}")
    public ResponseEntity<InvoiceResponseDTO> getById(@PathVariable Long id){

        try {
            return new ResponseEntity<>(invoiceService.getInvoiceById(id), HttpStatus.OK);
        } catch (EntityNotFoundException e) {
            e.printStackTrace();
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }

    }
    @GetMapping
    public ResponseEntity<List<InvoiceResponseDTO>> getAll(){

        return new ResponseEntity<>(invoiceService.getAllInvoice(), HttpStatus.OK);

    }

    @DeleteMapping(path = "/{id}")
    public ResponseEntity<Void> deleteById(@PathVariable Long id) {
        try {
            invoiceService.deleteInvoiceById(id);
            return new ResponseEntity<>(HttpStatus.OK);
        } catch (EntityNotFoundException e) {
            e.printStackTrace();
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }

}
