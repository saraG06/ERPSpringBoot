package it.unikey.erpspring.PL.controller;

import it.unikey.erpspring.BLL.service.abstraction.WorkerService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/v1/worker")
@CrossOrigin("http://localhost:8080")
public class WorkerController {

    private final WorkerService workerService;
}
