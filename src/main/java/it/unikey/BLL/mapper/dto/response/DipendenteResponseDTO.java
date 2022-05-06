package it.unikey.BLL.mapper.dto.response;

import lombok.Data;

import java.time.LocalDate;

@Data
public class DipendenteResponseDTO {

    private Long id;
    private LocalDate assunzione;
    private OperatoreResponseDTO operatoreResponseDTO;
    private RuoloResponseDTO ruoloResponseDTO;
}
