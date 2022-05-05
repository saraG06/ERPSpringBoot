package com.example.ERPSpringBoot.BLL.dto.response;

import lombok.Data;
import java.time.LocalDate;
@Data
public class OrdineResponseDTO {
    private Long id;
    private String dettaglio;
    private LocalDate dataImporto;
    private OperatoreResponseDTO operatoreResponseDTO;
    private FatturaResponseDTO fatturaResponseDTO;
    private ClienteResponseDTO clienteResponseDTO;
    private AziendaResponseDTO aziendaResponseDTO;
}
