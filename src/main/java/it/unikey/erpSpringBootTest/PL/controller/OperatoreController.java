package it.unikey.erpSpringBootTest.PL.controller;

import it.unikey.erpSpringBootTest.BLL.dto.request.OperatoreRequestDTO;
import it.unikey.erpSpringBootTest.BLL.service.abstraction.OperatoreService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/operatore")
@CrossOrigin("http://localhost:8080")
public class OperatoreController {

    private final OperatoreService operatoreService;

    @PostMapping
    public ResponseEntity<Void> save(@RequestBody OperatoreRequestDTO operatoreRequestDTO){
        operatoreService.saveOperatore(operatoreRequestDTO);
        return new ResponseEntity<>(HttpStatus.CREATED);
    }
}
