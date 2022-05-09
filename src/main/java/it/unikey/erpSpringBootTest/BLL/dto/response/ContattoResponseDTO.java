package it.unikey.erpSpringBootTest.BLL.dto.response;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;

import java.time.LocalDate;

@Data
public class ContattoResponseDTO {

    private Long id;
    private String nome;
    private String cognome;
    private LocalDate dataNascita;
}
