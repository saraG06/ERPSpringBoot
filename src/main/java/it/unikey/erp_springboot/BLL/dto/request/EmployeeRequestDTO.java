package it.unikey.erp_springboot.BLL.dto.request;

import it.unikey.erp_springboot.BLL.dto.response.CompanyResponseDTO;
import it.unikey.erp_springboot.BLL.dto.response.OperatorResponseDTO;
import it.unikey.erp_springboot.BLL.dto.response.OrderResponseDTO;
import it.unikey.erp_springboot.DAL.Entity.Role;
import lombok.Data;

import java.time.LocalDate;
import java.util.List;
@Data
public class EmployeeRequestDTO {

    private OperatorRequestDTO operatorRequestDTO;
    private Role role;
    private LocalDate hiring;
    private List<OrderRequestDTO> orderRequestDTOList;

}
