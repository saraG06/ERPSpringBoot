package it.unikey.erpspring.BLL.service.abstraction;

import it.unikey.erpspring.BLL.DTO.response.InvoiceResponseDTO;

import java.util.List;

public interface ContactService {

    List<InvoiceResponseDTO> getInvoiceFromClient();
}
