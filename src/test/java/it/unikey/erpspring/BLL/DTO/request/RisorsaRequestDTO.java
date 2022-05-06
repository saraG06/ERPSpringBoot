package it.unikey.erpspring.BLL.DTO.request;

import lombok.Data;

@Data
public class RisorsaRequestDTO {

    private Long id;
    private String assignedResources;
    private EmployeeRequestDTO employeeRequestDTO;
    private CollaboratorRequestDTO collaboratorRequestDTO;
}
