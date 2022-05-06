package it.unikey.BLL.mapper.dto.request;

import it.unikey.DAL.Entity.Dipendente;
import lombok.Data;

@Data
public class RuoloRequestDTO {

    private String ruolo;
    private Dipendente dipendente;
}
