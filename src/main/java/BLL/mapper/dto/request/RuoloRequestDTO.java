package BLL.mapper.dto.request;

import DAL.Entity.Dipendente;
import lombok.Data;

@Data
public class RuoloRequestDTO {

    private String ruolo;
    private Dipendente dipendente;
}
