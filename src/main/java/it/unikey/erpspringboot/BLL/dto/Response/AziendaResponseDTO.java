package it.unikey.erpspringboot.BLL.dto.Response;

import lombok.Data;

import java.util.List;

@Data
public class AziendaResponseDTO {

    private Long id;
    private String nome;
    private List<OperatoreResponseDTO> operatoreResponseDTOList;

}
