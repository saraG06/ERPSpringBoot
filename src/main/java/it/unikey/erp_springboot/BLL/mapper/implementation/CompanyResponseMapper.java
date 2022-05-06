package it.unikey.erp_springboot.BLL.mapper.implementation;

import it.unikey.erp_springboot.BLL.dto.response.CompanyResponseDTO;
import it.unikey.erp_springboot.BLL.mapper.abstraction.GenericResponseMapper;
import it.unikey.erp_springboot.DAL.Entity.Company;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface CompanyResponseMapper extends GenericResponseMapper<Company, CompanyResponseDTO> {
}
