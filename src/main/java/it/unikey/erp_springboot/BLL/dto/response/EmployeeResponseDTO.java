package it.unikey.erp_springboot.BLL.dto.response;

import it.unikey.erp_springboot.DAL.Entity.Resource;
import it.unikey.erp_springboot.DAL.Entity.Role;
import lombok.Data;

import java.time.LocalDate;
import java.util.List;
@Data
public class EmployeeResponseDTO {

    private Long id;
    private OperatorResponseDTO operatorResponseDTO;
    private Role role;
    private LocalDate hiring;
    private Resource resource;


}
