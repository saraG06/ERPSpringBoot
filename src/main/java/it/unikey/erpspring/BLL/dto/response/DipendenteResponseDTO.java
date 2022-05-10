package it.unikey.erpspring.BLL.dto.response;

import it.unikey.erpspring.DAL.Entity.Ruolo;
import lombok.Data;

import java.time.LocalDate;

@Data
public class DipendenteResponseDTO {
    private Long id;
    private String nome;
    private String cognome;
    private LocalDate dataAssunzione;
    private DipendenteResponseDTO dipendenteResponseDTO;
    private Ruolo ruolo;
}
