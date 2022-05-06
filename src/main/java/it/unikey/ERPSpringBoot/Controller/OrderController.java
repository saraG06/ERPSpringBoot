package it.unikey.ERPSpringBoot.Controller;

import it.unikey.ERPSpringBoot.BLL.dto.request.OrderRequestDto;
import it.unikey.ERPSpringBoot.BLL.dto.response.OrderResponseDto;
import it.unikey.ERPSpringBoot.BLL.service.abstraction.OrderService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController //dice a spring ..
@RequiredArgsConstructor //per lombok
@RequestMapping("/api/v1/order")
@CrossOrigin("http://localhost:8080")
public class OrderController {

    private final OrderService orderService;

    @PostMapping
    public ResponseEntity<Void> save(@RequestBody OrderRequestDto orderRequestDto){
        orderService.save(orderRequestDto);
        return new ResponseEntity<>(HttpStatus.CREATED);
    }
    @GetMapping(path = "/{id}")
    public ResponseEntity<OrderResponseDto> getById(@PathVariable Long id){
        return new ResponseEntity<>(orderService.findById(id), HttpStatus.OK);
    }
}
