package it.unikey.erpspring.BLL.mapper.implementation;

import it.unikey.erpspring.BLL.DTO.response.CompanyResponseDTO;
import it.unikey.erpspring.BLL.mapper.abstraction.GenericResponseMapper;
import it.unikey.erpspring.DAL.entity.Company;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface CompanyResponseMapper extends GenericResponseMapper<Company, CompanyResponseDTO> {
}
