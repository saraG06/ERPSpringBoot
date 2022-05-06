package it.unikey.erpSpringBootTest.BLL.dto.response;

import it.unikey.erpSpringBootTest.DAL.Entity.Operatore;
import it.unikey.erpSpringBootTest.DAL.Enum.Risorse;
import lombok.Data;

import java.time.LocalDate;

@Data
public class CollaboratoreResponseDTO {

    private Long id;
    private String nome;
    private String cognome;
    private LocalDate dataNascita;
    private OperatoreResponseDTO operatoreResponseDTO;
    private Risorse risorse ;
}
