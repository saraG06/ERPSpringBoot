package it.unikey.BLL.mapper.dto.response;

import lombok.Data;

import java.util.List;

@Data
public class AziendaResponseDTO {

    private Long id;

    private List<OperatoreResponseDTO> listaOperatoreResponseDTO;
}
