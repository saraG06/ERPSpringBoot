package it.unikey.erpspring.BLL.service.implementation;


import it.unikey.erpspring.BLL.DTO.request.ClientRequestDTO;
import it.unikey.erpspring.BLL.DTO.request.InvoiceRequestDTO;
import it.unikey.erpspring.BLL.DTO.request.OrderRequestDTO;
import it.unikey.erpspring.BLL.DTO.response.ClientResponseDTO;
import it.unikey.erpspring.BLL.DTO.response.InvoiceResponseDTO;
import it.unikey.erpspring.BLL.mapper.implementation.request.ClientRequestMapper;
import it.unikey.erpspring.BLL.mapper.implementation.request.InvoiceRequestMapper;
import it.unikey.erpspring.BLL.mapper.implementation.request.OrderRequestMapper;
import it.unikey.erpspring.BLL.mapper.implementation.response.ClientResponseMapper;
import it.unikey.erpspring.BLL.mapper.implementation.response.InvoiceResponseMapper;
import it.unikey.erpspring.BLL.service.abstraction.InvoiceService;
import it.unikey.erpspring.DAL.entity.Client;
import it.unikey.erpspring.DAL.entity.Collaborator;
import it.unikey.erpspring.DAL.entity.Invoice;
import it.unikey.erpspring.DAL.entity.Order;
import it.unikey.erpspring.DAL.repository.InvoiceRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class InvoiceServiceImpl implements InvoiceService {

    private final InvoiceRequestMapper invoiceRequestMapper;
    private final InvoiceResponseMapper invoiceResponseMapper;
    private final InvoiceRepository invoiceRepository; //repository ha la query
    private final ClientResponseMapper clientResponseMapper;
    private final ClientRequestMapper clientRequestMapper;
    private final OrderRequestMapper orderRequestMapper;
    private final OrderRequestDTO orderRequestDTO;

    @Override
    public List<InvoiceResponseDTO> getAllInvoicesByClient(ClientRequestDTO c) {
        Client cliente = clientRequestMapper.asEntity(c);
        List<Invoice> lista = invoiceRepository.getAllInvoicesByClient(cliente);
        return invoiceResponseMapper.asDTOList(lista);
    }

    @Override
    public List<InvoiceResponseDTO> getAllInvoicesAfter2019() {
        List<Invoice> lista = invoiceRepository.getAllInvoicesAfter2019();
        return invoiceResponseMapper.asDTOList(lista);
    }

    @Override
    public void saveInvoice(InvoiceRequestDTO invoiceRequestDTO) {
        Invoice i = invoiceRequestMapper.asEntity(invoiceRequestDTO);
        Order o = i.getOrder();
        o.setInvoice(i);
        invoiceRepository.save(i);
    }

    @Override
    public InvoiceResponseDTO findById(Long id) {
        return null;
    }
}
