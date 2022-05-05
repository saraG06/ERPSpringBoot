package PL;

import BLL.service.astratti.ClienteService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/v1/cliente")
@CrossOrigin("http://localhost:8080")
public class ClienteController {
    private final ClienteService clienteService;
}
