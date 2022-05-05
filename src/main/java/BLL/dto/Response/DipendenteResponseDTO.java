package BLL.dto.Response;

import lombok.Data;

import java.time.LocalDate;
@Data
public class DipendenteResponseDTO {

    private Long id;
    private LocalDate assunzione;
    private RuoloResponseDTO RuoloResponseDTO;
    private RisorsaResponseDTO risorsaResponseDTO;
}
