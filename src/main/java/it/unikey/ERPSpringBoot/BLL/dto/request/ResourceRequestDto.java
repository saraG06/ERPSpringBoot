package it.unikey.ERPSpringBoot.BLL.dto.request;

import lombok.Data;

@Data
public class ResourceRequestDto {

    private String assignedResource;
    private EmployeeRequestDto employeeRequestDto;
    private CollaboratorRequestDto collaboratorRequestDto;
}
