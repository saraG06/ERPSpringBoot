package com.example.ERPSpringBoot.BLL.dto.response;

import lombok.Data;
import java.time.LocalDate;

@Data
public class FatturaResponseDTO {
    private Long id;
    private LocalDate data;
    private ContattoResponseDTO contattoResponseDTO;
    private OrdineResponseDTO ordineResponseDTO;
    private AziendaResponseDTO aziendaResponseDTO;
}
