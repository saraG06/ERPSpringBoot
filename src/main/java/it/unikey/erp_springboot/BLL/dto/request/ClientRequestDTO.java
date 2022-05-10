package it.unikey.erp_springboot.BLL.dto.request;

import io.swagger.annotations.ApiModelProperty;
import it.unikey.erp_springboot.BLL.dto.response.CompanyResponseDTO;
import lombok.Data;

import java.util.List;

@Data
public class ClientRequestDTO {

    private String name;
    private String partitaiva;
    private CompanyRequestDTO companyRequestDTO;
}
