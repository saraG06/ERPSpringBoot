package it.unikey.erp_springboot.PL.Controller;

import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;
import it.unikey.erp_springboot.BLL.dto.request.CollaboratorRequestDTO;
import it.unikey.erp_springboot.BLL.dto.response.CollaboratorResponseDTO;
import it.unikey.erp_springboot.BLL.service.abstraction.CollaboratorService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/v1/collaborator")
@CrossOrigin("http://localhost:8080")
public class CollaboratorController {

    private final CollaboratorService collaboratorService;

    @PostMapping
    @ApiOperation(value = "Method to save a collaborator")
    @ApiResponses(value = {
            @ApiResponse(code = 201, message = "Created"),
            @ApiResponse(code = 403, message = "Authorization denied")
    })
    public ResponseEntity<Void> save(@RequestBody CollaboratorRequestDTO collaboratorRequestDTO){
        collaboratorService.saveCollaborator(collaboratorRequestDTO);
        return new ResponseEntity<>(HttpStatus.CREATED);
    }

    @GetMapping(path = "/{id}")
    @ApiOperation(value = "Method to get a collaborator")
    @ApiResponses(value = {
            @ApiResponse(code = 200, message = "Done"),
            @ApiResponse(code = 404, message = "Element not found")
    })
    public ResponseEntity<CollaboratorResponseDTO> getById(@PathVariable Long id){
        return new ResponseEntity<>(collaboratorService.findById(id), HttpStatus.OK);
    }

    @DeleteMapping(path = "/{id}")
    @ApiOperation(value = "Method to delete a client")
    @ApiResponses(value = {
            @ApiResponse(code = 200, message = "Deleted"),
            @ApiResponse(code = 404, message = "Element not found")
    })
    public ResponseEntity<Void> deleteById(@PathVariable Long id){
        collaboratorService.deleteCollaboratorById(id);
        return new ResponseEntity<>(HttpStatus.OK);
    }

    @GetMapping
    @ApiOperation(value = "Method to get a list of collaborator")
    @ApiResponses(value = {
            @ApiResponse(code = 200, message = "Done"),
            @ApiResponse(code = 404, message = "List not found")
    })
    public ResponseEntity<List<CollaboratorResponseDTO>> getAll(){
        return new ResponseEntity<>(collaboratorService.findAllCollaborator(), HttpStatus.OK);
    }

}
