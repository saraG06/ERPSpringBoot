package it.unikey.erp_springboot.PL.Controller;

import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;
import it.unikey.erp_springboot.BLL.dto.request.ContactRequestDTO;
import it.unikey.erp_springboot.BLL.dto.response.ContactResponseDTO;
import it.unikey.erp_springboot.BLL.service.abstraction.ContactService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/v1/contact")
@CrossOrigin("http://localhost:8080")
public class ContactController {

    private final ContactService contactService;

    @PostMapping
    @ApiOperation(value = "Method to save a contact")
    @ApiResponses(value = {
            @ApiResponse(code = 201, message = "Created"),
            @ApiResponse(code = 403, message = "Authorization denied")
    })
    public ResponseEntity<Void> save(@RequestBody ContactRequestDTO contactRequestDTO){
        contactService.saveContact(contactRequestDTO);
        return new ResponseEntity<>(HttpStatus.CREATED);
    }

    @GetMapping(path = "/{id}")
    @ApiOperation(value = "Method to get a contact")
    @ApiResponses(value = {
            @ApiResponse(code = 200, message = "Done"),
            @ApiResponse(code = 404, message = "Element not found")
    })
    public ResponseEntity<ContactResponseDTO> getById(@PathVariable Long id){
        return new ResponseEntity<>(contactService.findById(id), HttpStatus.OK);
    }

    @DeleteMapping(path = "/{id}")
    @ApiOperation(value = "Method to delete a contact")
    @ApiResponses(value = {
            @ApiResponse(code = 200, message = "Deleted"),
            @ApiResponse(code = 404, message = "Element not found")
    })
    public ResponseEntity<Void> deleteById(@PathVariable Long id){
        contactService.deleteContactById(id);
        return new ResponseEntity<>(HttpStatus.OK);
    }

    @GetMapping
    @ApiOperation(value = "Method to get a list of contact")
    @ApiResponses(value = {
            @ApiResponse(code = 200, message = "Done"),
            @ApiResponse(code = 404, message = "List not found")
    })
    public ResponseEntity<List<ContactResponseDTO>> getAll(){
        return new ResponseEntity<>(contactService.findAllContact(), HttpStatus.OK);
    }


}
