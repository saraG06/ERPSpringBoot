package it.unikey.erpspring.BLL.dto.request;

import lombok.Data;

import java.time.LocalDate;

@Data
public class OrdineRequestDTO {
    private LocalDate data;
    private AziendaRequestDTO aziendaRequestDTO;
    private FatturaRequestDTO fatturaRequestDTO;
}
