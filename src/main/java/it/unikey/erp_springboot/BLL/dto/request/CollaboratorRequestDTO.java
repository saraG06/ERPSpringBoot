package it.unikey.erp_springboot.BLL.dto.request;

import it.unikey.erp_springboot.DAL.Entity.Resource;
import lombok.Data;

import java.util.List;

@Data
public class CollaboratorRequestDTO {

    private OperatorRequestDTO operatorRequestDTO;
    private Resource resource;
    private List<OrderRequestDTO> orderRequestDTOList;
}
