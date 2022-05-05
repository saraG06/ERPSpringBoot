package com.example.ERPSpringBoot.BLL.dto.response;


import lombok.Data;
import java.time.LocalDate;
import java.util.List;

@Data
public class OperatoreResponseDTO {
    private Long id;
    private String nome;
    private String cognome;
    private LocalDate nascita;
    private List<OrdineResponseDTO> ordineResponseDTOList;
    private List<RisorsaResponseDTO> risorsaResponseDTOList;
}
