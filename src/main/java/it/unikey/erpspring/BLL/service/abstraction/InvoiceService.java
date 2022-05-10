package it.unikey.erpspring.BLL.service.abstraction;

import it.unikey.erpspring.BLL.DTO.request.ClientRequestDTO;
import it.unikey.erpspring.BLL.DTO.request.InvoiceRequestDTO;
import it.unikey.erpspring.BLL.DTO.response.InvoiceResponseDTO;
import it.unikey.erpspring.DAL.entity.Invoice;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface InvoiceService {

    List<InvoiceResponseDTO> getAllInvoicesByClient(ClientRequestDTO c);
    List<InvoiceResponseDTO> getAllInvoicesAfter2019();

    void saveInvoice (InvoiceRequestDTO invoiceRequestDTO);

    InvoiceResponseDTO findById(Long id);

}
