package it.unikey.erp_springboot.BLL.dto.request;

import lombok.Data;

import java.util.List;

@Data
public class CollaboratorRequestDTO {

    private OperatorRequestDTO operatorRequestDTO;
    private List<OrderRequestDTO> orderRequestDTOList;
}
