package it.unikey.erpspring.BLL.DTO.response;

import it.unikey.erpspring.BLL.DTO.request.CompanyRequestDTO;
import it.unikey.erpspring.BLL.DTO.request.ResourceRequestDTO;
import it.unikey.erpspring.BLL.DTO.request.WorkerRequestDTO;
import it.unikey.erpspring.DAL.enumerators.Role;
import lombok.Data;
import java.time.LocalDate;
import java.util.List;

@Data
public class EmployeeResponseDTO {

    private Long id;
    private String firstName;
    private String lastName;
    private LocalDate birthDate;
    private List<ResourceRequestDTO> resourceResponseDTOList;
    private LocalDate hiringDate;
    private Role role;
    private CompanyRequestDTO companyResponseDTO;
    private WorkerRequestDTO workerResponseDTO;

}
