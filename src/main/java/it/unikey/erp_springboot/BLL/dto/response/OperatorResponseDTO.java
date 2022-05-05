package it.unikey.erp_springboot.BLL.dto.response;

import lombok.Data;

import java.time.LocalDate;

@Data
public class OperatorResponseDTO {

    private Long id;
    private String name;
    private String lastname;
    private LocalDate birth;
    private CompanyResponseDTO companyResponseDTO;
}
