package it.unikey.erpspring.BLL.mapper.implementation.request;

import it.unikey.erpspring.BLL.DTO.request.CompanyRequestDTO;
import it.unikey.erpspring.BLL.mapper.abstraction.GenericRequestMapper;
import it.unikey.erpspring.DAL.entity.Company;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface CompanyRequestMapper extends GenericRequestMapper<CompanyRequestDTO, Company> {
}
