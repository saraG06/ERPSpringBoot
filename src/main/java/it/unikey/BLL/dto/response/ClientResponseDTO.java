package it.unikey.BLL.dto.response;

import it.unikey.BLL.dto.request.OrderRequestDTO;
import it.unikey.BLL.dto.request.CompanyRequestDTO;
import it.unikey.BLL.dto.request.ContactRequestDTO;
import lombok.Data;

import java.util.List;

@Data
public class ClientResponseDTO {

    private Long id;
    private String name;
    private String partitaIVA;
    private List<ContactRequestDTO> contactRequestDTOList;
    private List<OrderRequestDTO> orderRequestDTOList;
    private CompanyRequestDTO companyRequestDTO;
}
