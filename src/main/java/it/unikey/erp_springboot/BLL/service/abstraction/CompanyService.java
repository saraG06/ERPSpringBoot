package it.unikey.erp_springboot.BLL.service.abstraction;

import it.unikey.erp_springboot.BLL.dto.request.CompanyRequestDTO;
import it.unikey.erp_springboot.BLL.dto.response.ClientResponseDTO;
import it.unikey.erp_springboot.BLL.dto.response.CompanyResponseDTO;
import it.unikey.erp_springboot.BLL.dto.response.InvoiceResponseDTO;

import java.util.List;

public interface CompanyService {

    void saveCompany(CompanyRequestDTO companyRequestDTO);
    CompanyResponseDTO findById(Long id);
    void deleteCompanyById(Long id);
    List<CompanyResponseDTO> findAllCompany();

}
