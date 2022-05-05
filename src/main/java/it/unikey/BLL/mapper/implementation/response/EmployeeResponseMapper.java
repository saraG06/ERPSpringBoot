package it.unikey.BLL.mapper.implementation.response;

import it.unikey.BLL.dto.response.EmployeeResponseDTO;
import it.unikey.BLL.mapper.abstraction.GenericResponseMapper;
import it.unikey.DAL.Entity.Employee;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface EmployeeResponseMapper extends GenericResponseMapper<Employee, EmployeeResponseDTO> {
}
