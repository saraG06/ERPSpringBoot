package it.unikey.erpspring.BLL.service.implementation;

import it.unikey.erpspring.BLL.DTO.request.InvoiceRequestDTO;
import it.unikey.erpspring.BLL.DTO.response.InvoiceResponseDTO;
import it.unikey.erpspring.BLL.mapper.implementation.*;
import it.unikey.erpspring.BLL.service.abstraction.InvoiceService;
import it.unikey.erpspring.DAL.entity.Invoice;
import it.unikey.erpspring.DAL.repository.InvoiceRepository;
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
    private final ClientRequestMapper clientRequestMapper;
    private final CompanyRequestMapper companyRequestMapper;

    @Override
    public List<InvoiceResponseDTO> getInvoicesClientReply() {
        List<Invoice> i = invoiceRepository.getInvoicesClientReply();
        return invoiceResponseMapper.asDTOList(i);
    }

    @Override
    public List<InvoiceResponseDTO> getInvoicesAfterDate() {
        List<Invoice> i = invoiceRepository.getInvoicesAfterDate();
        return invoiceResponseMapper.asDTOList(i);
    }

    @Override
    public void saveInvoice(InvoiceRequestDTO invoiceRequestDTO) {
        Invoice i = invoiceRequestMapper.asEntity(invoiceRequestDTO);
        i.setOrder(orderRequestMapper.asEntity(invoiceRequestDTO.getOrderRequestDTO()));
        i.setContact(contactRequestMapper.asEntity(invoiceRequestDTO.getContactRequestDTO()));
        i.setClient(clientRequestMapper.asEntity(invoiceRequestDTO.getClientRequestDTO()));
        i.setCompany(companyRequestMapper.asEntity(invoiceRequestDTO.getCompanyRequestDTO()));
        invoiceRepository.save(i);
    }

    @Override
    public InvoiceResponseDTO findInvoiceById(Long id) throws NullPointerException{
        Invoice i = invoiceRepository.getById(id);
        if(id != null){
            return invoiceResponseMapper.asDTO(i);
        }else{
            throw new NullPointerException();
        }
    }
}
