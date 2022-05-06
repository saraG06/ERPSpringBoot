package it.unikey.erp_springboot.BLL.dto.response;

import lombok.Data;

import java.util.List;

@Data
public class ClientResponseDTO {

    private Long id;
    private String name;
    private String partitaIva;
    private List<ContactResponseDTO> contactResponseDTOList;
    private List<OrderResponseDTO> orderResponseDTOList;
    private CompanyResponseDTO companyResponseDTO;
}
