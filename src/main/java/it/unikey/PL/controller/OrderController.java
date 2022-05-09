package it.unikey.PL.controller;

import it.unikey.BLL.dto.request.OrderRequestDTO;
import it.unikey.BLL.dto.response.OrderResponseDTO;
import it.unikey.BLL.exception.IdNotFoundException;
import it.unikey.BLL.service.abstraction.OrderService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

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
    public ResponseEntity<OrderResponseDTO> getById(@PathVariable Long id) throws IdNotFoundException {
        return new ResponseEntity<>(orderService.findById(id), HttpStatus.OK);
    }

 }
