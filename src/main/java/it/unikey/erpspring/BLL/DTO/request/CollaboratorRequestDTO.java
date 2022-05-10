package it.unikey.erpspring.BLL.DTO.request;

import lombok.Data;

import java.time.LocalDate;
import java.util.List;

@Data
public class CollaboratorRequestDTO {

    private String firstName;
    private String lastName;
    private LocalDate birthDate;
    private List<ResourceRequestDTO> resourceRequestDTOList;
    private WorkerRequestDTO workerRequestDTO;

}