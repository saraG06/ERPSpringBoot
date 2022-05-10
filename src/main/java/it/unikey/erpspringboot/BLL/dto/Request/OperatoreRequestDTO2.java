package it.unikey.erpspringboot.BLL.dto.Request;

import it.unikey.erpspringboot.BLL.dto.Response.AziendaResponseDTO;
import lombok.Data;
import java.time.LocalDate;

@Data
public class OperatoreRequestDTO2 {

    private String nome;
    private String cognome;
    private LocalDate dataNascita;
    private AziendaResponseDTO aziendaResponseDTO;
}
