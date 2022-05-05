package it.unikey.BLL.mapper.implementation.response;

import it.unikey.BLL.mapper.abstraction.GenericResponseMapper;
import it.unikey.BLL.dto.response.CompanyResponseDTO;
import it.unikey.DAL.Entity.Company;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface CompanyResponseMapper extends GenericResponseMapper<Company, CompanyResponseDTO> {
}
