package com.example.ERPSpringBoot.BLL.dto.request;

import lombok.Data;

@Data
public class CollaboratoreRequestDTO {
    private OperatoreRequestDTO operatoreRequestDTO;
    private AziendaRequestDTO aziendaRequestDTO;
    private RisorsaRequestDTO risorsaRequestDTO;
}
