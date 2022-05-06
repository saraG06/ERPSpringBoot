package it.unikey.erpspring.BLL.mapper.implementation;

import it.unikey.erpspring.BLL.DTO.response.EmployeeResponseDTO;
import it.unikey.erpspring.BLL.mapper.abstraction.GenericReponseMapper;
import it.unikey.erpspring.DAL.entity.Employee;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface EmployeeResponseMapper extends GenericReponseMapper<Employee, EmployeeResponseDTO> {
}
