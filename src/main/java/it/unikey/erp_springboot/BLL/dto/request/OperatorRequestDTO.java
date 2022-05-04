package it.unikey.erp_springboot.BLL.dto.request;

import it.unikey.erp_springboot.BLL.dto.response.CompanyResponseDTO;
import it.unikey.erp_springboot.DAL.Entity.Resource;
import lombok.Data;

import java.time.LocalDate;

@Data
public class OperatorRequestDTO {

    private String name;
    private String lastname;
    private LocalDate birth;
    private Resource resource;
    private CompanyRequestDTO companyRequestDTO;
}
