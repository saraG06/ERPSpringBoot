package PL;

import BLL.service.astratti.OperatoreService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/v1/operatore")
@CrossOrigin("http://localhost:8080")
public class OperatoreController {
    private final OperatoreService operatoreService;
}
