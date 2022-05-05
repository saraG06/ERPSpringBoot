package it.unikey.BLL.dto.request;

import it.unikey.DAL.Entity.Enum.Resources;
import it.unikey.DAL.Entity.Enum.Roles;
import lombok.Data;

import java.time.LocalDate;
import java.util.List;

@Data
public class EmployeeRequestDTO {
    private Resources resource;
    private LocalDate dateOfEmployment;
    private Roles role;
    private CompanyRequestDTO companyRequestDTO;
    private List<OrderRequestDTO> orderRequestDTOList;
    private OperatorRequestDTO operatorRequestDTO;
}
