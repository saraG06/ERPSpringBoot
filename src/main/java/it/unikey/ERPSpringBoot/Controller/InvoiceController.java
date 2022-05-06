package it.unikey.ERPSpringBoot.Controller;

import it.unikey.ERPSpringBoot.BLL.dto.request.InvoiceRequestDto;
import it.unikey.ERPSpringBoot.BLL.dto.response.InvoiceResponseDto;
import it.unikey.ERPSpringBoot.BLL.service.abstraction.InvoiceService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController //dice a spring ..
@RequiredArgsConstructor //per lombok
@RequestMapping("/api/v1/invoice")
@CrossOrigin("http://localhost:8080")
public class InvoiceController {

    private final InvoiceService invoiceService;

    @PostMapping
    public ResponseEntity<Void> save (@RequestBody InvoiceRequestDto invoiceRequestDto){
        invoiceService.save(invoiceRequestDto);
        return new ResponseEntity<>(HttpStatus.CREATED);
    }

    @GetMapping(path = "/{id}")
    public ResponseEntity<InvoiceResponseDto> getById(@PathVariable Long id){
        return new ResponseEntity<>(invoiceService.findById(id), HttpStatus.OK);
    }

}
