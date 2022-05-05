package PL;

import BLL.service.astratti.DipendenteService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/v1/dipendente")
@CrossOrigin("http://localhost:8080")
public class DipendenteController {
    private final DipendenteService dipendenteService;
}
