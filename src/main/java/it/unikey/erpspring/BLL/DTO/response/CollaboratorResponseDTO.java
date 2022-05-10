package it.unikey.erpspring.BLL.DTO.response;

import it.unikey.erpspring.BLL.DTO.request.ResourceRequestDTO;
import it.unikey.erpspring.BLL.DTO.request.WorkerRequestDTO;
import lombok.Data;

import java.time.LocalDate;
import java.util.List;

@Data
public class CollaboratorResponseDTO {

    private Long id;
    private String firstName;
    private String lastName;
    private LocalDate birthDate;
    private List<ResourceRequestDTO> resourceResponseDTOList;
    private WorkerRequestDTO workerResponseDTO;

}
