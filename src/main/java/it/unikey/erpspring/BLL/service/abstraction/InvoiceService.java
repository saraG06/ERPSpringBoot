package it.unikey.erpspring.BLL.service.abstraction;

import it.unikey.erpspring.BLL.DTO.request.ClientRequestDTO;
import it.unikey.erpspring.BLL.DTO.request.InvoiceRequestDTO;
import it.unikey.erpspring.BLL.DTO.response.InvoiceResponseDTO;
import it.unikey.erpspring.BLL.service.exception.EntityNotFoundException;

import java.util.List;

public interface InvoiceService {

    void saveInvoice(InvoiceRequestDTO invoiceRequestDTO);

    InvoiceResponseDTO getInvoiceById(Long id) throws EntityNotFoundException;

    void deleteInvoiceById(Long id) throws EntityNotFoundException;

    List<InvoiceResponseDTO> getAllInvoice();

    List<InvoiceResponseDTO> getAllInvoicesByClient(ClientRequestDTO clientRequestDTO);

    List<InvoiceResponseDTO> getAllInvoicesAfter2019();

}
