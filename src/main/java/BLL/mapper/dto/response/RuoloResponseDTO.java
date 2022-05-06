package BLL.mapper.dto.response;

import DAL.Entity.Dipendente;
import lombok.Data;

@Data
public class RuoloResponseDTO {

    private Long id;
    private String ruolo;
    private Dipendente dipendente;
}
