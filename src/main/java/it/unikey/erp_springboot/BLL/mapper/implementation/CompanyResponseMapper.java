package it.unikey.erp_springboot.BLL.mapper.implementation;

import it.unikey.erp_springboot.BLL.dto.response.CompanyResponseDTO;
import it.unikey.erp_springboot.BLL.mapper.abstraction.GenericResponseMapper;
import it.unikey.erp_springboot.DAL.Entity.Company;

public interface CompanyResponseMapper extends GenericResponseMapper<Company, CompanyResponseDTO> {
}
