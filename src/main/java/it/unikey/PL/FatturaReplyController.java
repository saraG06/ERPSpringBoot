package it.unikey.PL;

import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;
import it.unikey.BLL.mapper.dto.response.FatturaResponseDTO;
import it.unikey.BLL.service.abstraction.FatturaService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/v1/fatturaReply")
@CrossOrigin("http://localhost:8080")
public class FatturaReplyController {

    private final FatturaService fatturaService;

    @GetMapping()
    @ApiOperation(value= "Metodo per cercare le fatture fatte dal cliente Reply")
    @ApiResponses(value= {
            @ApiResponse(code= 200, message= "richiesta ricevuta ed eseguita"),
            @ApiResponse(code= 404, message= "risorsa non trovata")
    })
    public ResponseEntity<List<FatturaResponseDTO>> getFattureReply(){
        return new ResponseEntity<>(fatturaService.findFattureReply(), HttpStatus.OK);
    }
}
