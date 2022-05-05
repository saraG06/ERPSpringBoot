package PL;

import BLL.service.astratti.ContattoService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/v1/contatto")
@CrossOrigin("http://localhost:8080")
public class ContattoController {
    private final ContattoService contattoService;
}
