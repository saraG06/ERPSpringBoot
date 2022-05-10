package it.unikey.erpspring.BLL.service.abstraction;

import it.unikey.erpspring.BLL.DTO.request.CompanyRequestDTO;
import it.unikey.erpspring.BLL.DTO.response.CompanyResponseDTO;
import it.unikey.erpspring.BLL.service.exception.EntityNotFoundException;
import org.springframework.stereotype.Service;

import java.util.List;


public interface CompanyService {

    void saveCompany(CompanyRequestDTO companyRequestDTO);

    CompanyResponseDTO getCompanyById(Long id) throws EntityNotFoundException;

    void deleteCompanyById(Long id) throws EntityNotFoundException;

    List<CompanyResponseDTO> getAllCompany();

}
