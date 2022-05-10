package it.unikey.erpspring.BLL.DTO.response;

import it.unikey.erpspring.BLL.DTO.request.CollaboratorRequestDTO;
import it.unikey.erpspring.BLL.DTO.request.EmployeeRequestDTO;
import lombok.Data;

@Data
public class ResourceResponseDTO {


    private Long id;

    private String assignedResources;
    private EmployeeRequestDTO employeeResponseDTO;
    private CollaboratorRequestDTO collaboratorResponseDTO;
}
