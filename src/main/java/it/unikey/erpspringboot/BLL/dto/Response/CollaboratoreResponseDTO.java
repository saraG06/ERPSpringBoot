package it.unikey.erpspringboot.BLL.dto.Response;

import lombok.Data;

@Data
public class CollaboratoreResponseDTO {

    private Long id;
    private OperatoreResponseDTO operatoreResponseDTO;
    private RisorsaResponseDTO risorsaResponseDTO;


}
