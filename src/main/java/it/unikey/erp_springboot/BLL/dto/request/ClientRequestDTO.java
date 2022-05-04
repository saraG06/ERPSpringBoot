package it.unikey.erp_springboot.BLL.dto.request;

import lombok.Data;

import java.util.List;

@Data
public class ClientRequestDTO {

    private String name;
    private String partitaIva;
    private List<ContactRequestDTO> contactRequestDTOList;
    private List<OrderRequestDTO> orderRequestDTOList;
    private CompanyRequestDTO companyRequestDTO;

}
