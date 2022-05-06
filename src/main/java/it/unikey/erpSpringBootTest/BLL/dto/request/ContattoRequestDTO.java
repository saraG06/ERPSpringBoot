package it.unikey.erpSpringBootTest.BLL.dto.request;

import lombok.Data;

import java.time.LocalDate;
@Data
public class ContattoRequestDTO {

    private String nome;
    private String cognome;
    private LocalDate dataNascita;

}
