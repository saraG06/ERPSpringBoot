package it.unikey.erp_springboot.BLL.dto.response;

import lombok.Data;

import java.util.List;

@Data
public class ClientResponseDTO {

    private Long id;
    private String name;
    private String partitaiva;
    private CompanyResponseDTO companyResponseDTO;
}
