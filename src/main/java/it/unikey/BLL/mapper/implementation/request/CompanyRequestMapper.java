package it.unikey.BLL.mapper.implementation.request;

import it.unikey.BLL.dto.request.CompanyRequestDTO;
import it.unikey.BLL.mapper.abstraction.GenericRequestMapper;
import it.unikey.DAL.Entity.Company;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface CompanyRequestMapper extends GenericRequestMapper<Company, CompanyRequestDTO> {
}
