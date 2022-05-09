package it.unikey.BLL.mapper.dto.request;

import it.unikey.BLL.mapper.dto.response.DipendenteResponseDTO;
import it.unikey.DAL.Entity.Dipendente;
import lombok.Data;

@Data
public class RuoloRequestDTO {

    private String ruolo;
    private DipendenteRequestDTO dipendenteRequestDTO;
}
