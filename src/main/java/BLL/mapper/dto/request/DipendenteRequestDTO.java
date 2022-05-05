package BLL.mapper.dto.request;

import DAL.Entity.Operatore;
import DAL.Entity.Ruolo;
import lombok.Data;

import java.time.LocalDate;

@Data
public class DipendenteRequestDTO {

    private LocalDate assunzione;
    private Operatore operatore;
    private Ruolo ruolo;
}
