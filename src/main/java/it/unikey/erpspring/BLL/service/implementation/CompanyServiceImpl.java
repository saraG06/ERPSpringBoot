package it.unikey.erpspring.BLL.service.implementation;

import it.unikey.erpspring.BLL.DTO.request.CollaboratorRequestDTO;
import it.unikey.erpspring.BLL.DTO.request.CompanyRequestDTO;
import it.unikey.erpspring.BLL.DTO.response.CollaboratorResponseDTO;
import it.unikey.erpspring.BLL.DTO.response.CompanyResponseDTO;
import it.unikey.erpspring.BLL.DTO.response.EmployeeResponseDTO;
import it.unikey.erpspring.BLL.mapper.implementation.request.CompanyRequestMapper;
import it.unikey.erpspring.BLL.mapper.implementation.response.CompanyResponseMapper;
import it.unikey.erpspring.BLL.mapper.implementation.response.EmployeeResponseMapper;
import it.unikey.erpspring.BLL.service.abstraction.CompanyService;
import it.unikey.erpspring.DAL.entity.Collaborator;
import it.unikey.erpspring.DAL.entity.Company;
import it.unikey.erpspring.DAL.entity.Employee;
import it.unikey.erpspring.DAL.repository.CompanyRepository;
import it.unikey.erpspring.DAL.repository.EmployeeRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class CompanyServiceImpl implements CompanyService {


    private final CompanyRepository companyRepository;
    private final CompanyRequestMapper companyRequestMapper;
    private final CompanyResponseMapper companyResponseMapper;
    private final CompanyRequestDTO companyRequestDTO;
    private final CompanyResponseDTO companyResponseDTO;

    @Override
    public Integer getNumberEmployee() {
        return companyRepository.getNumberEmployee();
    }


    @Override
    public void saveCompany(CompanyRequestDTO companyRequestDTO) {
        Company c = companyRequestMapper.asEntity(companyRequestDTO);
        companyRepository.save(c);
    }

    @Override
    public CompanyResponseDTO getById(Long id) {
        Company c = companyRepository.getById(id);

        if (id != null){
            return companyResponseMapper.asDTO(c);
        }
        else throw new NullPointerException();
    }


}
