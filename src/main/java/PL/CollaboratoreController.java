package PL;

import BLL.dto.request.CollaboratoreRequestDTO;
import BLL.dto.response.AziendaResponseDTO;
import BLL.dto.response.ClienteResponseDTO;
import BLL.dto.response.CollaboratoreResponseDTO;
import BLL.service.astratti.CollaboratoreService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/v1/collaboratore")
@CrossOrigin("http://localhost:8080")
public class CollaboratoreController {
    private final CollaboratoreService collaboratoreService;

    @PostMapping
    public ResponseEntity<Void> save(@RequestBody CollaboratoreRequestDTO collaboratoreRequestDTO) {
        collaboratoreService.saveCollaboratore(collaboratoreRequestDTO);
        return new ResponseEntity<>(HttpStatus.CREATED);
    }

    @GetMapping(path = "/{id}")
    public ResponseEntity<CollaboratoreResponseDTO> getById(@PathVariable Long id){
        try {
            return new ResponseEntity<>(collaboratoreService.findbyId(id),HttpStatus.OK);
        } catch (NullPointerException e){
            return new ResponseEntity<>(collaboratoreService.findbyId(id),HttpStatus.NOT_FOUND);
        }
    }

    @GetMapping(path = "/{id}")
    public ResponseEntity<CollaboratoreResponseDTO> deleteCollaboratoreById(@PathVariable Long id){
        collaboratoreService.deleteById(id);
        return new ResponseEntity<>(HttpStatus.OK);
    }
}
