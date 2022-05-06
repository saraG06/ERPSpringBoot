package it.unikey.BLL.mapper.dto.response;

import lombok.Data;
import java.time.LocalDate;

@Data
public class PersonaResponseDTO {

    private Long id;
    private String nome;
    private String cognome;
    private LocalDate nascita;
}
