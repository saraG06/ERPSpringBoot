package it.unikey.ERPSpringBoot.Controller;

import it.unikey.ERPSpringBoot.BLL.dto.request.CollaboratorRequestDto;
import it.unikey.ERPSpringBoot.BLL.dto.response.CollaboratorResponseDto;
import it.unikey.ERPSpringBoot.BLL.service.abstraction.CollaboratorService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController //dice a spring ..
@RequiredArgsConstructor //per lombok
@RequestMapping("/api/v1/controller")
@CrossOrigin("http://localhost:8080")
public class CollaboratorController {

    private final CollaboratorService collaboratorService;

    @PostMapping
    public ResponseEntity<Void> save(@RequestBody CollaboratorRequestDto collaboratorRequestDto){
        collaboratorService.saveCollaborator(collaboratorRequestDto);
        return new ResponseEntity<>(HttpStatus.CREATED);
    }

    @GetMapping("/{id}")
    public ResponseEntity<CollaboratorResponseDto> getById(@PathVariable Long id){
        return new ResponseEntity<>(collaboratorService.findById(id), HttpStatus.OK);
    }

}
