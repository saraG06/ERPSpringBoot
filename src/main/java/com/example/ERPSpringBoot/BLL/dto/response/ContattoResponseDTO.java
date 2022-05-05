package com.example.ERPSpringBoot.BLL.dto.response;

import lombok.Data;
import java.time.LocalDate;
import java.util.List;

@Data
public class ContattoResponseDTO {
    private Long id;
    private String nome;
    private String cognome;
    private LocalDate nascita;
    private ClienteResponseDTO clienteResponseDTO;
    private AziendaResponseDTO aziendaResponseDTO;
    private List<FatturaResponseDTO> fatturaResponseDTOList;
}
