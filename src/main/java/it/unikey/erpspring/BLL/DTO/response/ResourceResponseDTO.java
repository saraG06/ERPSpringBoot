package it.unikey.erpspring.BLL.DTO.response;

import lombok.Data;

@Data
public class ResourceResponseDTO {

    private Long id;
    private String assignedResources;
    private EmployeeResponseDTO employeeResponseDTO;
    private CollaboratorResponseDTO collaboratorResponseDTO;
}
