package BLL.mapper.dto.request;

import lombok.Data;

import java.time.LocalDate;

@Data
public class PersonaRequestDTO {

    private String nome;
    private String cognome;
    private LocalDate nascita;
}
