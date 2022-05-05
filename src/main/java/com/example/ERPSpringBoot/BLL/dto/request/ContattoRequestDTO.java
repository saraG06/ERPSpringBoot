package com.example.ERPSpringBoot.BLL.dto.request;

import lombok.Data;
import java.time.LocalDate;
import java.util.List;

@Data
public class ContattoRequestDTO {
    private String nome;
    private String cognome;
    private LocalDate nascita;
    private ClienteRequestDTO clienteRequestDTO;
    private AziendaRequestDTO aziendaRequestDTO;
    private List<FatturaRequestDTO> fatturaRequestDTOList;
}
