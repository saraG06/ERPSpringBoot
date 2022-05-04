package it.unikey.erp_springboot.BLL.dto.response;

import it.unikey.erp_springboot.DAL.Entity.Company;
import it.unikey.erp_springboot.DAL.Entity.Resource;
import lombok.Data;

import java.time.LocalDate;

@Data
public class OperatorResponseDTO {

    private Long id;
    private String name;
    private String lastname;
    private LocalDate birth;
    private Resource resource;
    private CompanyResponseDTO companyResponseDTO;
}
