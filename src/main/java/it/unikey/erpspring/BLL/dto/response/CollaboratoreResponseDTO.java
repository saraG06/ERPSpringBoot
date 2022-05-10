package it.unikey.erpspring.BLL.dto.response;

import lombok.Data;

@Data
public class CollaboratoreResponseDTO {
    private Long id;
    private CollaboratoreResponseDTO collaboratoreResponseDTO;
    private OperatoreResponseDTO operatoreResponseDTO;
}
