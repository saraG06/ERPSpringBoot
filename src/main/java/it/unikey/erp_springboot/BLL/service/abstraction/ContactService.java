package it.unikey.erp_springboot.BLL.service.abstraction;

import it.unikey.erp_springboot.BLL.dto.request.CompanyRequestDTO;
import it.unikey.erp_springboot.BLL.dto.response.InvoiceResponseDTO;

import java.util.List;

public interface ContactService {

    List<InvoiceResponseDTO> getClientInvoices(CompanyRequestDTO companyRequestDTO);
}
