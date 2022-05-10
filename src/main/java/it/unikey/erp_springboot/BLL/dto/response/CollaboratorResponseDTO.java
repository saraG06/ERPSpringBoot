package it.unikey.erp_springboot.BLL.dto.response;

import it.unikey.erp_springboot.DAL.Entity.Resource;
import lombok.Data;

import java.util.List;

@Data
public class CollaboratorResponseDTO {

    private Long id;
    private OperatorResponseDTO operatorResponseDTO;

    private Resource resource;

}
