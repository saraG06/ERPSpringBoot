package it.unikey.BLL.service.abstraction;

import it.unikey.BLL.dto.request.EmployeeRequestDTO;
import it.unikey.BLL.dto.response.EmployeeResponseDTO;
import it.unikey.BLL.exception.IdNotFoundException;

import java.util.List;

public interface EmployeeService {
    void saveEmployee (EmployeeRequestDTO employeeRequestDTO);
    EmployeeResponseDTO findById(Long id) throws IdNotFoundException;
    void deleteEmployeeById(Long id) throws IdNotFoundException;
    List<EmployeeResponseDTO> findAllEmployees();

    List<EmployeeResponseDTO> findEmployeeListWithCar();
}
