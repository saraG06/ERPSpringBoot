package com.example.ERPSpringBoot.BLL.dto.response;


import lombok.Data;
import java.time.LocalDate;
@Data
public class DipendenteResponseDTO {
    private Long id;
    private OperatoreResponseDTO operatoreResponseDTO;
    private LocalDate assunzione;
    private AziendaResponseDTO aziendaResponseDTO;
    private RisorsaResponseDTO risorsaResponseDTO;
    private String ruolo;
}
