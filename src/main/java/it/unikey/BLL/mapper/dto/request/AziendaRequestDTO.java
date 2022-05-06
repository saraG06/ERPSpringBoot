package it.unikey.BLL.mapper.dto.request;

import it.unikey.BLL.mapper.dto.response.OperatoreResponseDTO;
import lombok.Data;

import java.util.List;

@Data
public class AziendaRequestDTO {

    private List<OperatoreRequestDTO> listaOperatoreRequestDTO;
}
