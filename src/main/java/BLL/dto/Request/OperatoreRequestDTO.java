package BLL.dto.Request;

import lombok.Data;

import java.util.List;

@Data
public class OperatoreRequestDTO extends PersonaRequestDTO{

    private RisorsaRequestDTO risorsaRequestDTO;
    private List<OrdineRequestDTO> ordineRequestDTOList;
}
