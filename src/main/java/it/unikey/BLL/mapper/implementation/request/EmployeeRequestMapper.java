package it.unikey.BLL.mapper.implementation.request;

import it.unikey.BLL.dto.request.EmployeeRequestDTO;
import it.unikey.BLL.mapper.abstraction.GenericRequestMapper;
import it.unikey.DAL.Entity.Employee;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface EmployeeRequestMapper extends GenericRequestMapper<Employee, EmployeeRequestDTO> {
}
