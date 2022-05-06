package it.unikey.ERPSpringBoot.BLL.service.abstraction;

import it.unikey.ERPSpringBoot.BLL.dto.request.EmployeeRequestDto;
import it.unikey.ERPSpringBoot.BLL.dto.response.EmployeeResponseDto;
import it.unikey.ERPSpringBoot.DAL.Entity.Employee;

import java.util.List;

public interface EmployeeService {

    List<Employee> getEmployeeWithCar();
    void save (EmployeeRequestDto employeeRequestDto);
   EmployeeResponseDto findById (Long id);


}
