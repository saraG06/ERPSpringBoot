package it.unikey.erp_springboot.BLL.dto.request;

import lombok.Data;

import java.time.LocalDate;

@Data
public class OperatorRequestDTO {

    private String name;
    private String lastname;
    private LocalDate birth;
    private CompanyRequestDTO companyRequestDTO;
}
