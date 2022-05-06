package it.unikey.ERPSpringBoot.Controller;

import it.unikey.ERPSpringBoot.BLL.dto.request.ContactRequestDto;
import it.unikey.ERPSpringBoot.BLL.dto.response.ContactResponseDto;
import it.unikey.ERPSpringBoot.BLL.service.abstraction.ContactService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController //dice a spring ..
@RequiredArgsConstructor //per lombok
@RequestMapping("/api/v1/contact")
@CrossOrigin("http://localhost:8080")
public class ContactController {

    private final ContactService contactService;

    @PostMapping
    public ResponseEntity<Void> save(@RequestBody ContactRequestDto contactRequestDto){
        contactService.save(contactRequestDto);
        return new ResponseEntity<>(HttpStatus.CREATED);
    }

    @GetMapping
    public ResponseEntity<ContactResponseDto> getById(@PathVariable Long id){
        return new ResponseEntity<>(contactService.getById(id), HttpStatus.OK);
    }
}
