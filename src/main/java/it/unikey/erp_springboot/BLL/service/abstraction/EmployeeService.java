package it.unikey.erp_springboot.BLL.service.abstraction;

import it.unikey.erp_springboot.BLL.dto.request.CompanyRequestDTO;
import it.unikey.erp_springboot.BLL.dto.request.EmployeeRequestDTO;
import it.unikey.erp_springboot.BLL.dto.response.CompanyResponseDTO;
import it.unikey.erp_springboot.BLL.dto.response.EmployeeResponseDTO;
import it.unikey.erp_springboot.DAL.Entity.Company;
import it.unikey.erp_springboot.DAL.Entity.Employee;

import java.util.List;

public interface EmployeeService {

    void saveEmployee (EmployeeRequestDTO employeeRequestDTO);

    EmployeeResponseDTO findById(Long id);

    void deleteEmployeeById(Long id);

    List<EmployeeResponseDTO> findAllEmployee();

    List<EmployeeResponseDTO> findByResourceCar();
    List<EmployeeResponseDTO> findByHireLastMonth();

    List<EmployeeResponseDTO> findByCompany(CompanyRequestDTO companyRequestDTO);
}
