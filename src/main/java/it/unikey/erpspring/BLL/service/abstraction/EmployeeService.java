package it.unikey.erpspring.BLL.service.abstraction;

import it.unikey.erpspring.BLL.DTO.request.EmployeeRequestDTO;
import it.unikey.erpspring.BLL.DTO.request.ResourceRequestDTO;
import it.unikey.erpspring.BLL.DTO.response.EmployeeResponseDTO;
import it.unikey.erpspring.DAL.entity.Employee;

import java.util.List;

public interface EmployeeService {

    void insertResource (ResourceRequestDTO resourceRequestDTO);

    void saveEmployee (EmployeeRequestDTO employeeRequestDTO);

    List<EmployeeResponseDTO> getEmployeesWithCar();

    List<EmployeeResponseDTO> getOperatorsHiredLastMonth();

    EmployeeResponseDTO findById(Long id);
}
