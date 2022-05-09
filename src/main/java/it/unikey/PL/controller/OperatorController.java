package it.unikey.PL.controller;

import it.unikey.BLL.dto.request.OperatorRequestDTO;
import it.unikey.BLL.dto.response.OperatorResponseDTO;
import it.unikey.BLL.exception.IdNotFoundException;
import it.unikey.BLL.service.abstraction.OperatorService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/v1/operator")
@CrossOrigin("http://localhost:8080")
public class OperatorController {

    private final OperatorService operatorService;

    @PostMapping
    public ResponseEntity<Void> save(@RequestBody OperatorRequestDTO operatorRequestDTO){
        operatorService.saveOperator(operatorRequestDTO);
        return new ResponseEntity<>(HttpStatus.CREATED);
    }

    @GetMapping(path = "/{id}")
    public ResponseEntity<OperatorResponseDTO> getById(@PathVariable Long id) throws IdNotFoundException {
        return new ResponseEntity<>(operatorService.findById(id), HttpStatus.OK);
    }
}
