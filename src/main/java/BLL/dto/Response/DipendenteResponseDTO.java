package BLL.dto.Response;

import lombok.Data;

import java.time.LocalDate;
@Data
public class DipendenteResponseDTO extends  OperatoreResponseDTO {

    private Long id;
    private LocalDate assunzione;
    private RuoloResponseDTO RuoloResponseDTO;
}
