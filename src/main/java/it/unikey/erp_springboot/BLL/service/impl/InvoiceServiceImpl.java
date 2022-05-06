package it.unikey.erp_springboot.BLL.service.impl;

import it.unikey.erp_springboot.BLL.dto.request.ClientRequestDTO;
import it.unikey.erp_springboot.BLL.dto.request.InvoiceRequestDTO;
import it.unikey.erp_springboot.BLL.dto.response.InvoiceResponseDTO;
import it.unikey.erp_springboot.BLL.mapper.implementation.*;
import it.unikey.erp_springboot.BLL.service.abstraction.InvoiceService;
import it.unikey.erp_springboot.DAL.Entity.*;
import it.unikey.erp_springboot.DAL.Repository.InvoiceRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;

@Service
@RequiredArgsConstructor
public class InvoiceServiceImpl implements InvoiceService {

    private final InvoiceRepository invoiceRepository;
    private final InvoiceResponseMapper invoiceResponseMapper;
    private final InvoiceRequestMapper invoiceRequestMapper;
    private final OrderRequestMapper orderRequestMapper;
    private final ContactRequestMapper contactRequestMapper;

    private final ClientRequestMapper clientRequestMapper;

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


    @Override
    public List<InvoiceResponseDTO> findByClient(ClientRequestDTO clientRequestDTO) {
        return invoiceResponseMapper.asDTOList(invoiceRepository.findByClient(clientRequestMapper.asEntity(clientRequestDTO)));
    }

    @Override
    public List<InvoiceResponseDTO> findInvoiceByDateIsAfter(LocalDate date) {
        return invoiceResponseMapper.asDTOList(invoiceRepository.findInvoiceByDateIsAfter(date));
    }
}
