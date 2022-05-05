package it.unikey.erp_springboot.BLL.service.abstraction;

import it.unikey.erp_springboot.BLL.dto.request.EmployeeRequestDTO;
import it.unikey.erp_springboot.BLL.dto.response.EmployeeResponseDTO;

import java.util.List;

public interface EmployeeService {

    void saveEmployee (EmployeeRequestDTO employeeRequestDTO);

    EmployeeResponseDTO findById(Long id);

    void deleteEmployeeById(Long id);

    List<EmployeeResponseDTO> findAllEmployee();
}
