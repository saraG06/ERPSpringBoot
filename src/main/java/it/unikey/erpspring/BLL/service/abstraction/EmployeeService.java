package it.unikey.erpspring.BLL.service.abstraction;

import it.unikey.erpspring.BLL.DTO.request.EmployeeRequestDTO;
import it.unikey.erpspring.BLL.DTO.response.EmployeeResponseDTO;
import it.unikey.erpspring.DAL.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

public interface EmployeeService{

    List<EmployeeResponseDTO> getEmployeeWithCar();

    List<EmployeeResponseDTO> getAllLastMonth();

    void saveEmployee(EmployeeRequestDTO employeeRequestDTO);

    EmployeeResponseDTO findById(Long id);


}
