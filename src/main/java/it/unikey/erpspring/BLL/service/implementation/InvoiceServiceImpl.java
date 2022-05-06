package it.unikey.erpspring.BLL.service.implementation;

import it.unikey.erpspring.BLL.DTO.request.InvoiceRequestDTO;
import it.unikey.erpspring.BLL.DTO.response.InvoiceResponseDTO;
import it.unikey.erpspring.BLL.mapper.implementation.*;
import it.unikey.erpspring.BLL.service.exception.EntityNotFoundException;
import it.unikey.erpspring.DAL.entity.Company;
import it.unikey.erpspring.DAL.entity.Contact;
import it.unikey.erpspring.DAL.entity.Invoice;
import it.unikey.erpspring.DAL.entity.Order;
import it.unikey.erpspring.DAL.repository.InvoiceRepository;
import it.unikey.erpspring.BLL.DTO.request.ClientRequestDTO;
import it.unikey.erpspring.BLL.mapper.implementation.*;
import it.unikey.erpspring.BLL.service.abstraction.InvoiceService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class InvoiceServiceImpl implements InvoiceService {

    private final InvoiceRepository invoiceRepository;
    private final InvoiceRequestMapper invoiceRequestMapper;
    private final InvoiceResponseMapper invoiceResponseMapper;
    private final OrderRequestMapper orderRequestMapper;
    private final ContactRequestMapper contactRequestMapper;
    private final CompanyRequestMapper companyRequestMapper;
    private final ClientResponseMapper clientResponseMapper;
    private final ClientRequestMapper clientRequestMapper;

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
    public InvoiceResponseDTO getInvoiceById(Long id) throws EntityNotFoundException {
        Invoice i = null;
        if (invoiceRepository.findById(id).isPresent()) {
            i = invoiceRepository.findById(id).get();
        }
        if(i == null){
            throw new EntityNotFoundException("Id " + id + " non è presente nel db");
        }
        else {
            return invoiceResponseMapper.asDTO(i);
        }
    }

    @Override
    public void deleteInvoiceById(Long id) throws EntityNotFoundException {
        if(invoiceRepository.findById(id).isPresent()) {
            Invoice i = invoiceRepository.findById(id).get();
            if (i != null) {
                invoiceRepository.delete(i);
            }
            else{
                throw new EntityNotFoundException("Id " + id + " non è presente nel db");
            }
        }
    }

    @Override
    public List<InvoiceResponseDTO> getAllInvoice() {
        return invoiceResponseMapper.asDTOList(invoiceRepository.findAll());
    }

    @Override
    public List<InvoiceResponseDTO> getAllInvoicesByClient(ClientRequestDTO client) {

        return invoiceResponseMapper.asDTOList(invoiceRepository.getAllInvoicesbyClient(clientRequestMapper.asEntity(client)));
    }

    @Override
    public List<InvoiceResponseDTO> getAllInvoicesAfter2019() {
        return invoiceResponseMapper.asDTOList(invoiceRepository.getAllInvoicesAfter31122019());
    }


}
