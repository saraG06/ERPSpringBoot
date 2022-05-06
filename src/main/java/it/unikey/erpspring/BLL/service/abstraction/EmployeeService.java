package it.unikey.erpspring.BLL.service.abstraction;

import it.unikey.erpspring.BLL.DTO.request.EmployeeRequestDTO;
import it.unikey.erpspring.BLL.DTO.response.EmployeeResponseDTO;
import it.unikey.erpspring.BLL.service.exception.EntityNotFoundException;

import java.util.List;

public interface EmployeeService {

    void saveEmployee(EmployeeRequestDTO employeeRequestDTO);

    EmployeeResponseDTO getEmployeeById(Long id) throws EntityNotFoundException;

    void deleteEmployeeById(Long id) throws EntityNotFoundException;

    List<EmployeeResponseDTO> getAllEmployee();

    List<EmployeeResponseDTO> getAllEmployeeWithCar();

    List<EmployeeResponseDTO> getAllWorkerLastMonthHired();

}
