package it.unikey.erp_springboot.BLL.dto.response;

import lombok.Data;

import java.util.List;

@Data
public class CollaboratorResponseDTO {

    private Long id;
    private OperatorResponseDTO operatorResponseDTO;
    List<OrderResponseDTO> orderResponseDTOList;

}
