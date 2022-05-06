package it.unikey.erpSpringBootTest.BLL.dto.request;

import it.unikey.erpSpringBootTest.DAL.Enum.Risorse;
import it.unikey.erpSpringBootTest.DAL.Enum.Ruoli;
import lombok.Data;

import java.time.LocalDate;

@Data
public class DipendenteRequestDTO {

    private String nome;
    private String cognome;
    private LocalDate dataNascita;
    private OperatoreRequestDTO operatoreRequestDTO;
    private LocalDate dataAssunzione;
    private Ruoli ruolo;
    private Risorse risorse;
}
