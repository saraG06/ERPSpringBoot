package BLL.dto.Response;

import lombok.Data;

import java.util.List;
@Data
public class OperatoreResponseDTO extends PersonaResponseDTO{

    private Long id;
    private RisorsaResponseDTO risorsaResponseDTO;
    private List<OrdineResponseDTO> ordineResponseDTOList;
}
