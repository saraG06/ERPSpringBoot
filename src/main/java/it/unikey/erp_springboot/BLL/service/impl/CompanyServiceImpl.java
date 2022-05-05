package it.unikey.erp_springboot.BLL.service.impl;

import it.unikey.erp_springboot.BLL.dto.response.ClientResponseDTO;
import it.unikey.erp_springboot.BLL.dto.response.InvoiceResponseDTO;
import it.unikey.erp_springboot.BLL.mapper.implementation.ClientResponseMapper;
import it.unikey.erp_springboot.BLL.mapper.implementation.InvoiceResponseMapper;
import it.unikey.erp_springboot.BLL.service.abstraction.CompanyService;
import it.unikey.erp_springboot.DAL.Repository.CompanyRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class CompanyServiceImpl implements CompanyService {

    private ClientResponseMapper clientResponseMapper;
    private InvoiceResponseMapper invoiceResponseMapper;
    private CompanyRepository companyRepository;

    @Override
    public List<ClientResponseDTO> moreThan10() {
        return clientResponseMapper.asDTOList(companyRepository.moreThan10());
    }

    @Override
    public List<InvoiceResponseDTO> invoices(String name) {
        return invoiceResponseMapper.asDTOList(companyRepository.invoices(name));
    }
}
