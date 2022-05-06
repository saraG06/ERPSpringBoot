package it.unikey.erpspring.BLL.DTO.request;

import lombok.Data;

import java.time.LocalDate;
import java.util.List;
@Data
public class CollaboratorRequestDTO {

    private Long id;
    private String firstName;
    private String lastName;
    private LocalDate birthDate;
    private List<RisorsaRequestDTO> resourceRequestDTOList;
    private WorkerRequestDTO workerRequestDTO;
}
