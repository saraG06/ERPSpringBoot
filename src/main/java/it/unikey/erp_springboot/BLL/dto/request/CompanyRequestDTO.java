package it.unikey.erp_springboot.BLL.dto.request;

import lombok.Data;

import java.util.List;

@Data
public class CompanyRequestDTO {

    private String name;
    private List<ClientRequestDTO> clientRequestDTOList;
    private List<OperatorRequestDTO> operatorRequestDTOList;

}
