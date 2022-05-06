package it.unikey.erpspring.BLL.service.abstraction;

import it.unikey.erpspring.BLL.DTO.request.EmployeeRequestDTO;
import it.unikey.erpspring.BLL.DTO.request.ResourceRequestDTO;
import it.unikey.erpspring.BLL.DTO.response.EmployeeResponseDTO;

import java.util.List;

public interface EmployeeService {

    void saveEmployee(EmployeeRequestDTO employeeRequestDTO);

    EmployeeResponseDTO findEmployeeById(Long id);

    List<EmployeeResponseDTO> getEmployeesWithCar();

    List<EmployeeResponseDTO> getOperatorsHiredLastMonth();
}
