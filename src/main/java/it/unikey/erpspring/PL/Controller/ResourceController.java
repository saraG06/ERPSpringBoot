package it.unikey.erpspring.PL.Controller;

import it.unikey.erpspring.BLL.service.abstraction.ResourceService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/v1/resource")
@CrossOrigin("http://localhost:8080")
public class ResourceController {

    private final ResourceService resourceService;
}
