package com.example.ERPSpringBoot.BLL.dto.request;

import lombok.Data;
import java.time.LocalDate;
@Data
public class OrdineRequestDTO {
    private String dettaglio;
    private LocalDate dataImporto;
    private OperatoreRequestDTO operatoreRequestDTO;
    private FatturaRequestDTO fatturaRequestDTO;
    private ClienteRequestDTO clienteRequestDTO;
    private AziendaRequestDTO aziendaRequestDTO;
}
