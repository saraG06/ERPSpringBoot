package it.unikey.erpspring.BLL.dto.response;

import lombok.Data;

import java.time.LocalDate;

@Data
public class OrdineResponseDTO {
    private Long id;
    private LocalDate data;
    private AziendaResponseDTO aziendaResponseDTO;
    private FatturaResponseDTO fatturaResponseDTO;
}
