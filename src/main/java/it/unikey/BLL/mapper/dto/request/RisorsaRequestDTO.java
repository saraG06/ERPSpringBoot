package it.unikey.BLL.mapper.dto.request;

import it.unikey.BLL.mapper.dto.response.OperatoreResponseDTO;
import it.unikey.DAL.Entity.Operatore;
import lombok.Data;

@Data
public class RisorsaRequestDTO {

    private String risorsaAssegnata;
    private OperatoreResponseDTO operatoreResponseDTO;
}
