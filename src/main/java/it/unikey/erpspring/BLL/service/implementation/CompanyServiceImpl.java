package it.unikey.erpspring.BLL.service.implementation;

import it.unikey.erpspring.BLL.DTO.request.CompanyRequestDTO;
import it.unikey.erpspring.BLL.DTO.response.CompanyResponseDTO;
import it.unikey.erpspring.BLL.mapper.implementation.*;
import it.unikey.erpspring.BLL.service.abstraction.CompanyService;
import it.unikey.erpspring.DAL.entity.Collaborator;
import it.unikey.erpspring.DAL.entity.Company;
import it.unikey.erpspring.DAL.entity.Employee;
import it.unikey.erpspring.DAL.entity.Order;
import it.unikey.erpspring.DAL.repository.CompanyRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class CompanyServiceImpl implements CompanyService {

    private final CompanyRepository companyRepository;
    private final CompanyResponseMapper companyResponseMapper;
    private final CompanyRequestMapper companyRequestMapper;

    @Override
    public Integer findNumberOfEmployee() {
        return companyRepository.getNumberOfEmployees();
    }

    @Override
    public void saveCompany(CompanyRequestDTO companyRequestDTO) {

        Company c = companyRequestMapper.asEntity(companyRequestDTO );

        companyRepository.save(c);
    }

    @Override
    public CompanyResponseDTO findById(Long id) throws NullPointerException {
        Company c = companyRepository.getById(id);

        if (id != null) {
            return companyResponseMapper.asDTO(c);
        } else throw new NullPointerException();
    }
}
