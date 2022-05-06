package it.unikey.erpSpringBootTest.PL.controller;

import it.unikey.erpSpringBootTest.BLL.dto.request.ContattoRequestDTO;
import it.unikey.erpSpringBootTest.BLL.service.abstraction.ContattoService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/contatto")
@CrossOrigin("http://localhost:8080")
public class ContattoController {

    private final ContattoService contattoService;

    @PostMapping
    public ResponseEntity<Void> save(@RequestBody ContattoRequestDTO contattoRequestDTO){
        contattoService.saveContatto(contattoRequestDTO);
        return new ResponseEntity<>(HttpStatus.CREATED);
    }
}
