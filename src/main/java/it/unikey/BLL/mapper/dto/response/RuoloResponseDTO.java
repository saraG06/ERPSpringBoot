package it.unikey.BLL.mapper.dto.response;

import it.unikey.DAL.Entity.Dipendente;
import lombok.Data;

@Data
public class RuoloResponseDTO {

    private Long id;
    private String ruolo;
    private DipendenteResponseDTO dipendenteResponseDTO;
}
