package it.unikey.ERPSpringBoot.BLL.mapper.implementation;

import it.unikey.ERPSpringBoot.BLL.dto.request.EmployeeRequestDto;
import it.unikey.ERPSpringBoot.BLL.mapper.abstraction.GenericRequestMapper;
import it.unikey.ERPSpringBoot.DAL.Entity.Employee;
import org.mapstruct.Mapper;
import org.mapstruct.ReportingPolicy;

@Mapper(componentModel = "spring")
public interface EmployeeRequestMapper extends GenericRequestMapper<EmployeeRequestDto, Employee> {
}
