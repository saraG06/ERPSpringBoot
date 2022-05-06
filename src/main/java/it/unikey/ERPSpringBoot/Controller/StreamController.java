package it.unikey.ERPSpringBoot.Controller;

import it.unikey.ERPSpringBoot.BLL.dto.request.StreamsRequestDto;
import it.unikey.ERPSpringBoot.BLL.dto.response.StreamsResponseDto;
import it.unikey.ERPSpringBoot.BLL.service.abstraction.StreamsService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController //dice a spring ..
@RequiredArgsConstructor //per lombok
@RequestMapping("/api/v1/stream")
@CrossOrigin("http://localhost:8080")
public class StreamController {

    private final StreamsService streamsService;

    @PostMapping
    public ResponseEntity<Void> save (@RequestBody StreamsRequestDto streamsRequestDto){
        streamsService.save(streamsRequestDto);
        return new ResponseEntity<>(HttpStatus.CREATED);
    }

    @GetMapping
    public ResponseEntity<StreamsResponseDto> getById(@PathVariable Long id){
        return new ResponseEntity<>(streamsService.findById(id), HttpStatus.OK);
    }
}
