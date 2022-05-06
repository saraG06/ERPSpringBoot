package it.unikey.ERPSpringBoot.BLL.service.implementation;

import it.unikey.ERPSpringBoot.BLL.dto.request.InvoiceRequestDto;
import it.unikey.ERPSpringBoot.BLL.dto.response.InvoiceResponseDto;
import it.unikey.ERPSpringBoot.BLL.mapper.implementation.InvoiceRequestMapper;
import it.unikey.ERPSpringBoot.BLL.mapper.implementation.InvoiceResponseMapper;
import it.unikey.ERPSpringBoot.BLL.service.abstraction.InvoiceService;
import it.unikey.ERPSpringBoot.DAL.Entity.Invoice;
import it.unikey.ERPSpringBoot.DAL.Repository.InvoiceRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class InvoiceServiceImpl implements InvoiceService {

    private final InvoiceRepository invoiceRepository;
    private final InvoiceRequestMapper invoiceRequestMapper;
    private final InvoiceResponseMapper invoiceResponseMapper;


    @Override
    public List<Invoice> getAllInvoicesClientReply() {
        return null;
    }

    @Override
    public List<Invoice> getAllInvoicesDate() {
        return null;
    }

    @Override
    public void save(InvoiceRequestDto invoiceRequestDto) {

        Invoice i = invoiceRequestMapper.asEntity(invoiceRequestDto);
        invoiceRepository.save(i);
    }

    @Override
    public InvoiceResponseDto findById(Long id) {
        Invoice i = invoiceRepository.getById(id);
        if(i!=null){
            invoiceRepository.findById(id);
        } else throw new NullPointerException();
        return invoiceResponseMapper.asDto(i);
    }
}
