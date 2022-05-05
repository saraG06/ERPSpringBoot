package it.unikey.BLL.dto.response;

import lombok.Data;

import java.time.LocalDate;

@Data
public class OperatorResponseDTO {
    private Long id;
    private String name;
    private String surname;
    private LocalDate birth;
    private CompanyResponseDTO companyResponseDTO;
}
