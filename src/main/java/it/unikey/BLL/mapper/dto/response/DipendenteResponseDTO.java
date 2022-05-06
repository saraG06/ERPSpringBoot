package it.unikey.BLL.mapper.dto.response;

import it.unikey.DAL.Entity.Operatore;
import it.unikey.DAL.Entity.Ruolo;
import lombok.Data;

import java.time.LocalDate;

@Data
public class DipendenteResponseDTO {

    private Long id;
    private LocalDate assunzione;
    private Operatore operatore;
    private Ruolo ruolo;
}
