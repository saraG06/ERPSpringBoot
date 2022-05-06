package it.unikey.erpspring.BLL.service.abstraction;

import it.unikey.erpspring.BLL.DTO.request.InvoiceRequestDTO;
import it.unikey.erpspring.BLL.DTO.response.InvoiceResponseDTO;
import it.unikey.erpspring.DAL.entity.Invoice;

import java.util.List;

public interface InvoiceService {

    List<InvoiceResponseDTO> getAllInvoicesClientReply();

    List<InvoiceResponseDTO> getAllInvoicesAfter2019();

    void saveInvoice(InvoiceRequestDTO invoiceRequestDTO);

    InvoiceResponseDTO findById(Long id);


}
