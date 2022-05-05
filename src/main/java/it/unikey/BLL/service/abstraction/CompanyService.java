package it.unikey.BLL.service.abstraction;

import it.unikey.BLL.dto.request.CompanyRequestDTO;
import it.unikey.BLL.dto.response.CompanyResponseDTO;
import it.unikey.BLL.exception.IdNotFoundException;

import java.util.List;

public interface CompanyService {
    void saveCompany (CompanyRequestDTO companyRequestDTO);
    CompanyResponseDTO findById(Long id) throws IdNotFoundException;
    void deleteCompanyById(Long id) throws IdNotFoundException;
    List<CompanyResponseDTO> findAllCompanies();
}
