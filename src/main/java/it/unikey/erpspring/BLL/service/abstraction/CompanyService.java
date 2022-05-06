package it.unikey.erpspring.BLL.service.abstraction;

import it.unikey.erpspring.BLL.DTO.request.CompanyRequestDTO;
import it.unikey.erpspring.BLL.DTO.response.CompanyResponseDTO;

public interface CompanyService {

    Integer findNumberOfEmployees();

    void saveCompany(CompanyRequestDTO companyRequestDTO);

    CompanyResponseDTO findCompanyById(Long id);
}
