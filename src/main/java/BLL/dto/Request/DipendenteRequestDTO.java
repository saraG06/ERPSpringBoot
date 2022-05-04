package BLL.dto.Request;


import lombok.Data;

import java.time.LocalDate;

@Data
public class DipendenteRequestDTO extends OperatoreRequestDTO {

    private LocalDate assunzione;
    private RuoloRequestDTO ruoloRequestDTO;
}
