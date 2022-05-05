package com.example.ERPSpringBoot.BLL.dto.request;

import lombok.Data;
import java.time.LocalDate;
import java.util.List;
@Data
public class OperatoreRequestDTO {
    private String nome;
    private String cognome;
    private LocalDate nascita;
    private List<OrdineRequestDTO> ordineRequestDTOList;
    private List<RisorsaRequestDTO> risorsaRequestDTOList;
}
