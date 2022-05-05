package it.unikey.erp_springboot.BLL.service.abstraction;

import it.unikey.erp_springboot.BLL.dto.request.InvoiceRequestDTO;
import it.unikey.erp_springboot.BLL.dto.response.InvoiceResponseDTO;

import java.util.List;

public interface InvoiceService {

    void saveInvoice(InvoiceRequestDTO invoiceRequestDTO);

    InvoiceResponseDTO findById(Long id);

    void deleteInvoiceById(Long id);

    List<InvoiceResponseDTO> findAllInvoice();
}
