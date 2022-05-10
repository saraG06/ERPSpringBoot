package it.unikey.erpspring.BLL.dto.request;

import it.unikey.erpspring.DAL.Entity.Ruolo;
import lombok.Data;

import java.time.LocalDate;

@Data
public class DipendenteRequestDTO {
    private String nome;
    private String cognome;
    private LocalDate dataAssunzione;
    private Ruolo ruolo;
}
