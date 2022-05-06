package it.unikey.BLL.mapper.dto.response;

import it.unikey.DAL.Entity.Operatore;
import lombok.Data;

@Data
public class RisorsaResponseDTO {

    private Long id;
    private String risorsaAssegnata;
    private Operatore operatore;
}
