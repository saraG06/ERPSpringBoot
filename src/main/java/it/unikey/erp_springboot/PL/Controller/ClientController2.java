package it.unikey.erp_springboot.PL.Controller;

import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;
import it.unikey.erp_springboot.BLL.dto.request.ClientRequestDTO;
import it.unikey.erp_springboot.BLL.dto.response.ClientResponseDTO;
import it.unikey.erp_springboot.BLL.service.abstraction.ClientService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/v1/client_2")
@CrossOrigin("http://localhost:8080")
public class ClientController2 {

    private final ClientService clientService;

    @GetMapping
    @ApiOperation(value = "Method to get a list of client with more than 10 contacts")
    @ApiResponses(value = {
            @ApiResponse(code = 200, message = "Done"),
            @ApiResponse(code = 404, message = "List not found")
    })
    public ResponseEntity<List<ClientResponseDTO>> getWithMoreThan10Contacts(){
        return new ResponseEntity<>(clientService.findClientWithMore10Contacts(), HttpStatus.OK);
    }
}
