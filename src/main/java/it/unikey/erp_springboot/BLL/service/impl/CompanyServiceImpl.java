package it.unikey.erp_springboot.BLL.service.impl;

import it.unikey.erp_springboot.BLL.dto.request.CompanyRequestDTO;
import it.unikey.erp_springboot.BLL.dto.response.ClientResponseDTO;
import it.unikey.erp_springboot.BLL.dto.response.CompanyResponseDTO;
import it.unikey.erp_springboot.BLL.dto.response.InvoiceResponseDTO;
import it.unikey.erp_springboot.BLL.mapper.implementation.ClientResponseMapper;
import it.unikey.erp_springboot.BLL.mapper.implementation.CompanyRequestMapper;
import it.unikey.erp_springboot.BLL.mapper.implementation.CompanyResponseMapper;
import it.unikey.erp_springboot.BLL.mapper.implementation.InvoiceResponseMapper;
import it.unikey.erp_springboot.BLL.service.abstraction.CompanyService;
import it.unikey.erp_springboot.DAL.Entity.Company;
import it.unikey.erp_springboot.DAL.Repository.CompanyRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class CompanyServiceImpl implements CompanyService {
    private final CompanyRepository companyRepository;
    private final CompanyRequestMapper companyRequestMapper;
    private final CompanyResponseMapper companyResponseMapper;
    private final ClientResponseMapper clientResponseMapper;
    private final InvoiceResponseMapper invoiceResponseMapper;


    @Override
    public void saveCompany(CompanyRequestDTO companyRequestDTO) {
        Company c = companyRequestMapper.asEntity(companyRequestDTO);
        companyRepository.save(c);
    }

    @Override
    public CompanyResponseDTO findById(Long id) {
        Company c = companyRepository.getById(id);
        if(c != null){
            return companyResponseMapper.asDTO(c);
        }else{
            throw new NullPointerException();
        }
    }

    @Override
    public void deleteCompanyById(Long id) {
        if(companyRepository.existsById(id)){
            companyRepository.deleteById(id);
        }else{
            throw new NullPointerException();
        }
    }

    @Override
    public List<CompanyResponseDTO> findAllCompany() {
        List<Company> list = companyRepository.findAll();
        return companyResponseMapper.asDTOList(list);
    }

}
