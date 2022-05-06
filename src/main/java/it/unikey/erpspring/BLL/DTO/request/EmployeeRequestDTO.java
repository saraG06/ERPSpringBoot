package it.unikey.erpspring.BLL.DTO.request;

import it.unikey.erpspring.DAL.entity.Role;
import lombok.Data;

import java.time.LocalDate;
import java.util.List;
@Data
public class EmployeeRequestDTO {


    private String firstName;
    private String lastName;
    private LocalDate birthDate;
    private List<RisorsaRequestDTO> resourceRequestDTOList;
    private LocalDate hiringDate;
    private Role role;
    private CompanyRequestDTO companyRequestDTO;
    private WorkerRequestDTO workerRequestDTO;
    private List<OrderRequestDTO> orderRequestDTOList;
}
