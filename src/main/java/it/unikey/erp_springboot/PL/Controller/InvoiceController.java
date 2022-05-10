package it.unikey.erp_springboot.PL.Controller;

import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;
import it.unikey.erp_springboot.BLL.dto.request.ClientRequestDTO;
import it.unikey.erp_springboot.BLL.dto.request.InvoiceRequestDTO;
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
@RequestMapping("/api/v1/invoice")
@CrossOrigin("http://localhost:8080")
public class InvoiceController {

    private final InvoiceService invoiceService;

    @PostMapping
    @ApiOperation(value = "Method to save an invoice")
    @ApiResponses(value = {
            @ApiResponse(code = 201, message = "Created"),
            @ApiResponse(code = 403, message = "Authorization denied")
    })
    public ResponseEntity<Void> save(@RequestBody InvoiceRequestDTO invoiceRequestDTO){
        invoiceService.saveInvoice(invoiceRequestDTO);
        return new ResponseEntity<>(HttpStatus.CREATED);
    }

    @GetMapping(path = "/{id}")
    @ApiOperation(value = "Method to get an invoice")
    @ApiResponses(value = {
            @ApiResponse(code = 200, message = "Done"),
            @ApiResponse(code = 404, message = "Element not found")
    })
    public ResponseEntity<InvoiceResponseDTO> getById(@PathVariable Long id){
        return new ResponseEntity<>(invoiceService.findById(id), HttpStatus.OK);
    }

    @DeleteMapping(path = "/{id}")
    @ApiOperation(value = "Method to delete an invoice")
    @ApiResponses(value = {
            @ApiResponse(code = 200, message = "Deleted"),
            @ApiResponse(code = 404, message = "Element not found")
    })
    public ResponseEntity<Void> deleteById(@PathVariable Long id){
        invoiceService.deleteInvoiceById(id);
        return new ResponseEntity<>(HttpStatus.OK);
    }

    @GetMapping
    @ApiOperation(value = "Method to get a list of invoice")
    @ApiResponses(value = {
            @ApiResponse(code = 200, message = "Done"),
            @ApiResponse(code = 404, message = "List not found")
    })
    public ResponseEntity<List<InvoiceResponseDTO>> getAll(){
        return new ResponseEntity<>(invoiceService.findAllInvoice(), HttpStatus.OK);
    }

}
