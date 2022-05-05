package it.unikey.erp_springboot.BLL.service.abstraction;

import it.unikey.erp_springboot.BLL.dto.response.ClientResponseDTO;
import it.unikey.erp_springboot.BLL.dto.response.InvoiceResponseDTO;

import java.util.List;

public interface CompanyService {

    List<ClientResponseDTO> moreThan10();
    List<InvoiceResponseDTO> invoices(String name);
}
