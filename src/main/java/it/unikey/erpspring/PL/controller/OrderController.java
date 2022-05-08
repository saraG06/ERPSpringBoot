package it.unikey.erpspring.PL.controller;

import it.unikey.erpspring.BLL.DTO.request.OrderRequestDTO;
import it.unikey.erpspring.BLL.DTO.response.OrderResponseDTO;
import it.unikey.erpspring.BLL.service.abstraction.OrderService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/v1/order")
@CrossOrigin("http://localhost:8080")
public class OrderController {

    private final OrderService orderService;

    @PostMapping
    public ResponseEntity<Void> save(@RequestBody OrderRequestDTO orderRequestDTO){
        orderService.saveOrder(orderRequestDTO);
        return new ResponseEntity<>(HttpStatus.CREATED);
    }

    @GetMapping(path = "/{id}")
    public ResponseEntity<OrderResponseDTO> findById(@PathVariable Long id){
        return new ResponseEntity<>(orderService.findOrderById(id), HttpStatus.OK);
    }

    @GetMapping
    public ResponseEntity<List<OrderResponseDTO>> getOrderWithoutInvoice(){
        return new ResponseEntity<>(orderService.getOrderWithoutInvoice(), HttpStatus.OK);
    }

}
