package it.unikey.erp_springboot.BLL.service.abstraction;

import it.unikey.erp_springboot.BLL.dto.request.InvoiceRequestDTO;
import it.unikey.erp_springboot.BLL.dto.response.InvoiceResponseDTO;
import it.unikey.erp_springboot.DAL.Entity.Company;
import it.unikey.erp_springboot.DAL.Entity.Invoice;

import java.time.LocalDate;
import java.util.List;

public interface InvoiceService {

    void saveInvoice(InvoiceRequestDTO invoiceRequestDTO);

    InvoiceResponseDTO findById(Long id);

    void deleteInvoiceById(Long id);

    List<InvoiceResponseDTO> findAllInvoice();

    List<InvoiceResponseDTO> findByCompany(Company company);

    List<InvoiceResponseDTO> findInvoiceByDateIsAfter(LocalDate date);
}
