package it.unikey.ERPSpringBoot.BLL.service.abstraction;

import it.unikey.ERPSpringBoot.BLL.dto.request.InvoiceRequestDto;
import it.unikey.ERPSpringBoot.BLL.dto.response.InvoiceResponseDto;
import it.unikey.ERPSpringBoot.DAL.Entity.Invoice;

import java.util.List;

public interface InvoiceService {

    List<Invoice> getAllInvoicesClientReply();
    List<Invoice> getAllInvoicesDate();
    void save (InvoiceRequestDto invoiceRequestDto);
    InvoiceResponseDto findById (Long id);

}
