package it.unikey.erpspringboot.BLL.dto.Request;

import lombok.Data;

import java.util.List;

@Data
public class AziendaRequestDTO {

    private String nome;
    private List<OperatoreRequestDTO> operatoreRequestDTOList;

}
