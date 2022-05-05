package it.unikey.erp_springboot.BLL.service.impl;

import it.unikey.erp_springboot.BLL.dto.request.CompanyRequestDTO;
import it.unikey.erp_springboot.BLL.dto.response.InvoiceResponseDTO;
import it.unikey.erp_springboot.BLL.mapper.implementation.CompanyRequestMapper;
import it.unikey.erp_springboot.BLL.service.abstraction.ContactService;
import it.unikey.erp_springboot.DAL.Repository.CompanyRepository;
import it.unikey.erp_springboot.DAL.Repository.ContactRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class ContactServiceImpl implements ContactService {

    private ContactRepository contactRepository;
    private CompanyRepository companyRepository;
    private CompanyRequestMapper companyRequestMapper;
    @Override
    public List<InvoiceResponseDTO> getClientInvoices(CompanyRequestDTO companyRequestDTO) {
       return null;
    }
}
