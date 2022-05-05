package it.unikey.BLL.dto.request;

import it.unikey.BLL.dto.response.CompanyResponseDTO;
import lombok.Data;

import java.time.LocalDate;

@Data
public class OperatorRequestDTO {
    private String name;
    private String surname;
    private LocalDate birth;
    private CompanyResponseDTO companyResponseDTO;
}
