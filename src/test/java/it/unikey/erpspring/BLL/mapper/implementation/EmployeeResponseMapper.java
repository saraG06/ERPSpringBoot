package it.unikey.erpspring.BLL.mapper.implementation;

import it.unikey.erpspring.BLL.mapper.abstraction.GenericResponseMapper;
import it.unikey.erpspring.DAL.entity.Employee;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface EmployeeResponseMapper extends GenericResponseMapper<Employee, EmployeeResponseMapper> {
}
