package it.unikey.erp_springboot.BLL.mapper.implementation;

import it.unikey.erp_springboot.BLL.dto.response.EmployeeResponseDTO;
import it.unikey.erp_springboot.BLL.mapper.abstraction.GenericResponseMapper;
import it.unikey.erp_springboot.DAL.Entity.Employee;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface EmployeeResponseMapper extends GenericResponseMapper<Employee, EmployeeResponseDTO> {
}
