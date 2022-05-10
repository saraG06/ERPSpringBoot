package it.unikey.erpspringboot.PL;

import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;
import it.unikey.erpspringboot.BLL.dto.Request.OperatoreRequestDTO;
import it.unikey.erpspringboot.BLL.dto.Response.OperatoreResponseDTO;
import it.unikey.erpspringboot.BLL.service.abstraction.OperatoreService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/operatore")
@CrossOrigin("http://localhost:8080")
public class OperatoreController {

    private final OperatoreService operatoreService;

    @PostMapping
    @ApiOperation(value = "Metodo per aggiungere un Operatore",notes = "Per aggiungere la risorsa mi serve un oggetto")
    @ApiResponses( value = {
            @ApiResponse(code = 201, message = "Ha creato effettivamente la risorsa"),
            @ApiResponse(code=403, message = "Non hai le autorizzazioni per aggiungere un operatore")
    })
    public ResponseEntity<Void> save(@RequestBody OperatoreRequestDTO operatoreRequestDTO){

        try {
            operatoreService.saveOperatore(operatoreRequestDTO);
            return new ResponseEntity<>(HttpStatus.CREATED);
        }catch (NullPointerException n){
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }

    @GetMapping(path="/{id}")
    public ResponseEntity<OperatoreResponseDTO>  getById(@PathVariable Long id){
        return new ResponseEntity<>(operatoreService.findById(id),HttpStatus.OK);
    }

    @GetMapping
    public ResponseEntity<List<OperatoreResponseDTO>>  findAllOperatore(){
        return new ResponseEntity<>(operatoreService.findAllOperatore(),HttpStatus.OK);
    }

    @PutMapping(path="/{id}")
    public ResponseEntity<Void> deleteOperatoreById(@PathVariable Long id){

        try {
            operatoreService.deleteOperatoreById(id);
            return new ResponseEntity<>(HttpStatus.OK);
        } catch (NullPointerException n){
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }
}