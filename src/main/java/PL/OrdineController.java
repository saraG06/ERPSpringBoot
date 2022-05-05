package PL;

import BLL.service.astratti.OrdineService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/v1/ordine")
@CrossOrigin("http://localhost:8080")
public class OrdineController {
    private final OrdineService ordineService;
}
