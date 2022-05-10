package it.unikey.erpspring.PL.controller;

import it.unikey.erpspring.BLL.DTO.request.WorkerRequestDTO;
import it.unikey.erpspring.BLL.DTO.response.WorkerResponseDTO;
import it.unikey.erpspring.BLL.service.abstraction.WorkerService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/v1/worker")
@CrossOrigin("http://localhost:8080")
public class WorkerController {

    private final WorkerService workerService;

    @PostMapping
    public ResponseEntity<Void> save(@RequestBody WorkerRequestDTO workerRequestDTO){
        workerService.saveWorker(workerRequestDTO);
        return new ResponseEntity<>(HttpStatus.CREATED);
    }

    @GetMapping(path = "/{id}")
    public ResponseEntity<WorkerResponseDTO> getById(@PathVariable Long id){
        return new ResponseEntity<>(workerService.findWorkerById(id),HttpStatus.OK);
    }

    @GetMapping
    public ResponseEntity<List<WorkerResponseDTO>> findAll(){
        return new ResponseEntity<>(workerService.findAllWorker(), HttpStatus.OK);
    }

    @DeleteMapping(path = "/{id}")
    public ResponseEntity<Void> delete(@PathVariable Long id){
        workerService.deleteWorkerById(id);
        return new ResponseEntity<>(HttpStatus.OK);
    }
}