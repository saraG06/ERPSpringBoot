package it.unikey.erpspring.BLL.DTO.response;

import lombok.Data;

import java.time.LocalDate;
import java.util.List;

@Data
public class WorkerResponseDTO {
    private Long id;
    private String firstName;
    private String lastName;
    private LocalDate birthDate;
    private List<OrderResponseDTO> orderResponseDTOList;
    private CompanyResponseDTO companyResponseDTO;
}
