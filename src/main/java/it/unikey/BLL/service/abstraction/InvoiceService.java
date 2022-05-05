package it.unikey.BLL.service.abstraction;

import it.unikey.BLL.dto.response.InvoiceResponseDTO;
import it.unikey.BLL.dto.request.InvoiceRequestDTO;
import it.unikey.BLL.exception.IdNotFoundException;

import java.util.List;

public interface InvoiceService {
    void saveInvoice (InvoiceRequestDTO invoiceRequestDTO);
    InvoiceResponseDTO findById(Long id) throws IdNotFoundException;
    void deleteInvoiceById(Long id) throws IdNotFoundException;
    List<InvoiceResponseDTO> findAllInvoices();
}
