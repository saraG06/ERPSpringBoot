package it.unikey.erpspring.BLL.dto.response;

import lombok.Data;

import java.time.LocalDate;

@Data
public class OperatoreResponseDTO {
    private Long id;
    private String nome;
    private String cognome;
    private LocalDate dataAssunzione;
    private AziendaResponseDTO aziendaResponseDTO;
}
