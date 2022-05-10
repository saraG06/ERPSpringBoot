package it.unikey.erp_springboot.PL.Controller;

import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;
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
@RequestMapping("/api/v1/invoice_2")
@CrossOrigin("http://localhost:8080")
public class InvoiceController2 {

    private final InvoiceService invoiceService;

    @GetMapping
    @ApiOperation(value = "Method to get a list of invoice by client")
    @ApiResponses(value = {
            @ApiResponse(code = 200, message = "Done"),
            @ApiResponse(code = 404, message = "List not found")
    })
    public ResponseEntity<List<InvoiceResponseDTO>> getByClient(@RequestBody ClientRequestDTO clientRequestDTO){
        return new ResponseEntity<>(invoiceService.findByClient(clientRequestDTO), HttpStatus.OK);
    }

}
