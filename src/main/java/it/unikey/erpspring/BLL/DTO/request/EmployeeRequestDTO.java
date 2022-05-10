package it.unikey.erpspring.BLL.DTO.request;

import it.unikey.erpspring.DAL.enumerators.Role;
import lombok.Data;

import java.time.LocalDate;
import java.util.List;

@Data
public class EmployeeRequestDTO {

    private String firstName;
    private String lastName;
    private LocalDate birthDate;
    private List<ResourceRequestDTO> resourceRequestDTOList;
    private LocalDate hiringDate;
    private Role role;
    private WorkerRequestDTO workerRequestDTO;
}
