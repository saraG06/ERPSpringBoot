package it.unikey.erpSpringBootTest.BLL.dto.request;

import it.unikey.erpSpringBootTest.DAL.Entity.Operatore;
import it.unikey.erpSpringBootTest.DAL.Enum.Risorse;
import lombok.Data;

import java.time.LocalDate;
@Data
public class CollaboratoreRequestDTO {

    private String nome;
    private String cognome;
    private LocalDate dataNascita;
    private OperatoreRequestDTO operatoreRequestDTO;
    private Risorse risorse ;
}
