package it.unikey.erpspring.PL.Controller;

import it.unikey.erpspring.BLL.DTO.request.RisorsaRequestDTO;
import it.unikey.erpspring.BLL.DTO.request.WorkerRequestDTO;
import it.unikey.erpspring.BLL.DTO.response.WorkerResponseDTO;
import it.unikey.erpspring.BLL.service.abstraction.WorkerService;
import it.unikey.erpspring.BLL.service.exception.EntityNotFoundException;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/v1/Worker")
@CrossOrigin("http://localhost:8080")
public class WorkerController {

    public final WorkerService workerService;

    @PostMapping
    public ResponseEntity<Void> save(@RequestBody WorkerRequestDTO workerRequestDTO){

        workerService.saveWorker(workerRequestDTO);
        return new ResponseEntity<>(HttpStatus.CREATED);

    }

    @GetMapping(path = "/{id}")
    public ResponseEntity<WorkerResponseDTO> getById(@PathVariable Long id){

        try {
            return new ResponseEntity<>(workerService.getWorkerById(id), HttpStatus.OK);
        } catch (EntityNotFoundException e) {
            e.printStackTrace();
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }

    }
    @GetMapping
    public ResponseEntity<List<WorkerResponseDTO>> getAll(){

        return new ResponseEntity<>(workerService.getAllWorker(), HttpStatus.OK);

    }
    @DeleteMapping(path = "/{id}")
    public ResponseEntity<Void> deleteById(@PathVariable Long id) {
        try {
            workerService.deleteWorkerById(id);
            return new ResponseEntity<>(HttpStatus.OK);
        } catch (EntityNotFoundException e) {
            e.printStackTrace();
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }

}
