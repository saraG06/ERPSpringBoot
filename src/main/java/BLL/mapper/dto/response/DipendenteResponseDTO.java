package BLL.mapper.dto.response;

import DAL.Entity.Operatore;
import DAL.Entity.Ruolo;
import lombok.Data;

import java.time.LocalDate;

@Data
public class DipendenteResponseDTO {

    private Long id;
    private LocalDate assunzione;
    private Operatore operatore;
    private Ruolo ruolo;
}
