package it.unikey.erpspring.BLL.service.abstraction;

import it.unikey.erpspring.BLL.DTO.request.CompanyRequestDTO;
import it.unikey.erpspring.BLL.DTO.response.CompanyResponseDTO;
import it.unikey.erpspring.BLL.DTO.response.EmployeeResponseDTO;
import it.unikey.erpspring.DAL.entity.Company;

import java.util.List;

public interface CompanyService {

    Integer getNumberEmployee();

    void saveCompany(CompanyRequestDTO companyRequestDTO);

    CompanyResponseDTO getById(Long id);

}
