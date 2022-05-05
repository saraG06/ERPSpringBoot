package it.unikey.erpspring.BLL.DTO.request;

import lombok.Data;

@Data
public class ResourceRequestDTO {

    private String assignedResources;
    private EmployeeRequestDTO employeeRequestDTO;
    private CollaboratorRequestDTO collaboratorRequestDTO;
}
