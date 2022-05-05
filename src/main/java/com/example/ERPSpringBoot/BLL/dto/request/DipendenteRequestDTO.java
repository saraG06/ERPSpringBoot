package com.example.ERPSpringBoot.BLL.dto.request;

import lombok.Data;

import java.time.LocalDate;
@Data
public class DipendenteRequestDTO {
    private OperatoreRequestDTO operatoreRequestDTO;
    private LocalDate assunzione;
    private AziendaRequestDTO aziendaRequestDTO;
    private RisorsaRequestDTO risorsaRequestDTO;
    private String ruolo;
}
