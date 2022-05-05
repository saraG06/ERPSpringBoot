package it.unikey.erp_springboot.BLL.mapper.implementation;

import it.unikey.erp_springboot.BLL.dto.request.EmployeeRequestDTO;
import it.unikey.erp_springboot.BLL.mapper.abstraction.GenericRequestMapper;
import it.unikey.erp_springboot.DAL.Entity.Employee;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface EmployeeRequestMapper extends GenericRequestMapper<Employee, EmployeeRequestDTO> {
}
