package it.unikey.erpSpringBootTest.PL.controller;

import it.unikey.erpSpringBootTest.BLL.dto.request.OrdineRequestDTO;
import it.unikey.erpSpringBootTest.BLL.dto.response.OrdineResponseDTO;
import it.unikey.erpSpringBootTest.BLL.service.abstraction.OrdineService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/ordine")
@CrossOrigin("http://localhost:8080")
public class OrdineController {

    private final OrdineService ordineService;

    @PostMapping
    public ResponseEntity<Void> save(@RequestBody OrdineRequestDTO ordineRequestDTO){
        ordineService.saveOrdine(ordineRequestDTO);
        return new ResponseEntity<>(HttpStatus.CREATED);
    }

    @GetMapping
    public ResponseEntity<List<OrdineResponseDTO>> findOrdiniWithoutfattura(){
        return new ResponseEntity<>(ordineService.ordiniWithoutfattura(),HttpStatus.FOUND);
    }
}
