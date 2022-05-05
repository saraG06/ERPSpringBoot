package it.unikey.erpspringboot.BLL.dto.Request;


import lombok.Data;

import java.time.LocalDate;

@Data
public class DipendenteRequestDTO {

    private LocalDate assunzione;
    private RuoloRequestDTO ruoloRequestDTO;
    private RisorsaRequestDTO risorsaRequestDTO;
}
