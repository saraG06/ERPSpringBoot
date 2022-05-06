package it.unikey.BLL.mapper.dto.request;

import it.unikey.DAL.Entity.Operatore;
import it.unikey.DAL.Entity.Ruolo;
import lombok.Data;

import java.time.LocalDate;

@Data
public class DipendenteRequestDTO {

    private LocalDate assunzione;
    private Operatore operatore;
    private Ruolo ruolo;
}
