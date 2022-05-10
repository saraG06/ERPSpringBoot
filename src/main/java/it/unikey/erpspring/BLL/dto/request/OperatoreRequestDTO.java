package it.unikey.erpspring.BLL.dto.request;

import lombok.Data;

import java.time.LocalDate;

@Data
public class OperatoreRequestDTO {
    private String nome;
    private String cognome;
    private LocalDate dataAssunzione;
    private AziendaRequestDTO aziendaRequestDTO;
}
