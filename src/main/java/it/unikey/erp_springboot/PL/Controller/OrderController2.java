package it.unikey.erp_springboot.PL.Controller;

import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;
import it.unikey.erp_springboot.BLL.dto.response.OrderResponseDTO;
import it.unikey.erp_springboot.BLL.service.abstraction.OrderService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/v1/order_2")
@CrossOrigin("http://localhost:8080")
public class OrderController2 {

    private final OrderService orderService;

    @GetMapping
    @ApiOperation(value = "Method to get a list of orders without invoice yet")
    @ApiResponses(value = {
            @ApiResponse(code = 200, message = "Done"),
            @ApiResponse(code = 404, message = "List not found")
    })
    public ResponseEntity<List<OrderResponseDTO>> findOrderWithoutInvoice(){
        return new ResponseEntity<>(orderService.findOrderWithoutInvoice(), HttpStatus.OK);
    }
}
