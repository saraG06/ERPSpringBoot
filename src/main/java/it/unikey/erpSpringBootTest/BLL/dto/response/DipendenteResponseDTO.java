package it.unikey.erpSpringBootTest.BLL.dto.response;


import it.unikey.erpSpringBootTest.DAL.Enum.Risorse;
import it.unikey.erpSpringBootTest.DAL.Enum.Ruoli;

import java.time.LocalDate;

public class DipendenteResponseDTO {

    private Long id;
    private String nome;
    private String cognome;
    private LocalDate dataNascita;
    private OperatoreResponseDTO operatoreResponseDTO;
    private LocalDate dataAssunzione;
    private Ruoli ruolo;
    private Risorse risorse ;

}
