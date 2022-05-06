package it.unikey.ERPSpringBoot.BLL.dto.response;

import lombok.Data;

@Data
public class ResourceResponseDto {

    private Long id;
    private String assignedResource;
    private EmployeeResponseDto employeeResponseDto;
    private CollaboratorResponseDto collaboratorResponseDto;
}
