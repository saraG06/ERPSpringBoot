package it.unikey.erpSpringBootTest.PL.controller;

import it.unikey.erpSpringBootTest.BLL.dto.request.CollaboratoreRequestDTO;
import it.unikey.erpSpringBootTest.BLL.service.abstraction.CollaboratoreService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/collaboratore")
@CrossOrigin("http://localhost:8080")
public class CollaboratoreController {

    private final CollaboratoreService collaboratoreService;

    @PostMapping
    public ResponseEntity<Void> save(@RequestBody CollaboratoreRequestDTO collaboratoreRequestDTO){
        collaboratoreService.saveCollaboratore(collaboratoreRequestDTO);
        return new ResponseEntity<>(HttpStatus.CREATED);
    }
}
