package it.unikey.BLL.service.implementation;

import it.unikey.BLL.dto.request.InvoiceRequestDTO;
import it.unikey.BLL.dto.request.OrderRequestDTO;
import it.unikey.BLL.dto.response.InvoiceResponseDTO;
import it.unikey.BLL.exception.IdNotFoundException;
import it.unikey.BLL.mapper.implementation.request.CompanyRequestMapper;
import it.unikey.BLL.mapper.implementation.request.ContactRequestMapper;
import it.unikey.BLL.mapper.implementation.request.InvoiceRequestMapper;
import it.unikey.BLL.mapper.implementation.request.OrderRequestMapper;
import it.unikey.BLL.mapper.implementation.response.InvoiceResponseMapper;
import it.unikey.BLL.service.abstraction.InvoiceService;
import it.unikey.DAL.Entity.*;
import it.unikey.DAL.Repository.InvoiceRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class InvoiceServiviceImplementation implements InvoiceService {

    private final InvoiceRepository invoiceRepository;
    private final InvoiceRequestMapper invoiceRequestMapper;
    private final InvoiceResponseMapper invoiceResponseMapper;
    private final OrderRequestMapper orderRequestMapper;
    private final ContactRequestMapper contactRequestMapper;
    private final CompanyRequestMapper companyRequestMapper;

    @Override
    public void saveInvoice(InvoiceRequestDTO invoiceRequestDTO) {
        Invoice i = invoiceRequestMapper.asEntity(invoiceRequestDTO);
        Order order = orderRequestMapper.asEntity(invoiceRequestDTO.getOrderRequestDTO());
        Company company = companyRequestMapper.asEntity(invoiceRequestDTO.getCompanyRequestDTO());
        Contact c = contactRequestMapper.asEntity(invoiceRequestDTO.getContactRequestDTO());
        i.setContact(c);
        i.setOrder(order);
        i.setCompany(company);
        invoiceRepository.save(i);
    }

    @Override
    public InvoiceResponseDTO findById(Long id) throws IdNotFoundException {
        Invoice i = null;
        if (invoiceRepository.findById(id).isPresent()) {
            i = invoiceRepository.findById(id).get();
        }
        if(i == null){
            throw new IdNotFoundException("Id " + id + " non è presente nel db");
        }
        else {
            return invoiceResponseMapper.asDto(i);
        }
    }

    @Override
    public void deleteInvoiceById(Long id) throws IdNotFoundException {
        if(invoiceRepository.findById(id).isPresent()) {
            Invoice i = invoiceRepository.findById(id).get();
            if (i != null) {
                invoiceRepository.delete(i);
            }
            else{
                throw new IdNotFoundException("Id " + id + " non è presente nel db");
            }
        }
    }

    @Override
    public List<InvoiceResponseDTO> findAfter2019() {
        return invoiceResponseMapper.asDTOList(invoiceRepository.findAfter2019());
    }

    @Override
    public List<InvoiceResponseDTO> findReplyInvoices() {
        return invoiceResponseMapper.asDTOList(invoiceRepository.findReplyInvoices());
    }

    @Override
    public List<InvoiceResponseDTO> findAllInvoices() {
        return invoiceResponseMapper.asDTOList(invoiceRepository.findAll());
    }
}
