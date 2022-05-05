package it.unikey.erp_springboot.BLL.service.impl;

import it.unikey.erp_springboot.BLL.dto.request.InvoiceRequestDTO;
import it.unikey.erp_springboot.BLL.dto.response.InvoiceResponseDTO;
import it.unikey.erp_springboot.BLL.mapper.implementation.*;
import it.unikey.erp_springboot.BLL.service.abstraction.InvoiceService;
import it.unikey.erp_springboot.DAL.Entity.Company;
import it.unikey.erp_springboot.DAL.Entity.Contact;
import it.unikey.erp_springboot.DAL.Entity.Invoice;
import it.unikey.erp_springboot.DAL.Entity.Order;
import it.unikey.erp_springboot.DAL.Repository.InvoiceRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class InvoiceServiceImpl implements InvoiceService {

    private InvoiceRepository invoiceRepository;
    private InvoiceResponseMapper invoiceResponseMapper;
    private InvoiceRequestMapper invoiceRequestMapper;
    private OrderRequestMapper orderRequestMapper;
    private ContactRequestMapper contactRequestMapper;

    @Override
    public void saveInvoice(InvoiceRequestDTO invoiceRequestDTO) {
        Invoice i = invoiceRequestMapper.asEntity(invoiceRequestDTO);
        Order o = orderRequestMapper.asEntity(invoiceRequestDTO.getOrderRequestDTO());
        Contact c = contactRequestMapper.asEntity(invoiceRequestDTO.getContactRequestDTO());
        i.setContact(c);
        i.setOrder(o);
        invoiceRepository.save(i);
    }

    @Override
    public InvoiceResponseDTO findById(Long id) {
        Invoice i = invoiceRepository.getById(id);
        if(i != null){
            return invoiceResponseMapper.asDTO(i);
        }else{
            throw new NullPointerException();
        }
    }

    @Override
    public void deleteInvoiceById(Long id) {
        if(invoiceRepository.existsById(id)){
            invoiceRepository.deleteById(id);
        }else{
            throw new NullPointerException();
        }
    }

    @Override
    public List<InvoiceResponseDTO> findAllInvoice() {
        List<Invoice> list = invoiceRepository.findAll();
        return invoiceResponseMapper.asDTOList(list);
    }
}
