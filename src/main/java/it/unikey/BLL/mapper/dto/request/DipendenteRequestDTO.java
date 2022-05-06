package it.unikey.BLL.mapper.dto.request;

import it.unikey.BLL.mapper.dto.response.OperatoreResponseDTO;
import it.unikey.BLL.mapper.dto.response.RuoloResponseDTO;
import lombok.Data;

import java.time.LocalDate;

@Data
public class DipendenteRequestDTO {

    private LocalDate assunzione;
    private OperatoreResponseDTO operatoreResponseDTO;
    private RuoloResponseDTO ruoloResponseDTO;
}
