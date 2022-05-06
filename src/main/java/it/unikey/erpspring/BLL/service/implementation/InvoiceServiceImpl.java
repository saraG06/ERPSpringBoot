package it.unikey.erpspring.BLL.service.implementation;

import it.unikey.erpspring.BLL.DTO.request.InvoiceRequestDTO;
import it.unikey.erpspring.BLL.DTO.response.InvoiceResponseDTO;
import it.unikey.erpspring.BLL.mapper.implementation.InvoiceRequestMapper;
import it.unikey.erpspring.BLL.mapper.implementation.InvoiceResponseMapper;
import it.unikey.erpspring.BLL.service.abstraction.InvoiceService;
import it.unikey.erpspring.DAL.repository.InvoiceRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class InvoiceServiceImpl implements InvoiceService {

    private final InvoiceRepository invoiceRepository;
    private final InvoiceResponseMapper invoiceResponseMapper;
    private final InvoiceRequestMapper invoiceRequestMapper;


    @Override
    public List<InvoiceResponseDTO> getAllInvoicesClientReply() {
        return null;
    }

    @Override
    public List<InvoiceResponseDTO> getAllInvoicesAfter2019() {
        return null;
    }

    @Override
    public void saveInvoice(InvoiceRequestDTO invoiceRequestDTO) {

    }

    @Override
    public InvoiceResponseDTO findById(Long id) {
        return null;
    }
}
