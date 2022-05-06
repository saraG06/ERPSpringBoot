package it.unikey.erpspring.BLL.service.abstraction;

import it.unikey.erpspring.BLL.DTO.request.InvoiceRequestDTO;
import it.unikey.erpspring.BLL.DTO.response.InvoiceResponseDTO;


import java.util.List;

public interface InvoiceService {

    List<InvoiceResponseDTO> getInvoicesClientReply();

    List<InvoiceResponseDTO> getInvoicesAfterDate();

    void saveInvoice(InvoiceRequestDTO invoiceRequestDTO);

    InvoiceResponseDTO findInvoiceById(Long id);
}
