package com.example.ERPSpringBoot.BLL.dto.response;

import lombok.Data;

@Data
public class CollaboratoreResponseDTO {
    private Long id;
    private OperatoreResponseDTO operatoreResponseDTO;
    private AziendaResponseDTO aziendaResponseDTO;
    private RisorsaResponseDTO risorsaResponseDTO;
}
