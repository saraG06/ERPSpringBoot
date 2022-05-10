package it.unikey.erpspring.PL.Controller;

import it.unikey.erpspring.BLL.DTO.response.OrderResponseDTO;
import it.unikey.erpspring.BLL.service.abstraction.OrderService;
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
@RequestMapping("/api/v1/orderNoInvoices")
@CrossOrigin("http://localhost:8080")

public class OrderControllerNoInvoices {

    public final OrderService orderService;

    @GetMapping
    public ResponseEntity<List<OrderResponseDTO>> getAll(){

        return new ResponseEntity<>(orderService.getAllOrderWithNoinvoice(), HttpStatus.OK);

    }

}
