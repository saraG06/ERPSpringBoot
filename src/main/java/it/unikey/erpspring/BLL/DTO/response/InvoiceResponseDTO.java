package it.unikey.erpspring.BLL.DTO.response;

import it.unikey.erpspring.BLL.DTO.request.ClientRequestDTO;
import it.unikey.erpspring.BLL.DTO.request.CompanyRequestDTO;
import it.unikey.erpspring.BLL.DTO.request.ContactRequestDTO;
import it.unikey.erpspring.BLL.DTO.request.OrderRequestDTO;
import lombok.Data;

import java.time.LocalDate;

@Data
public class InvoiceResponseDTO {

    private Long id;
    private LocalDate date;
    private OrderRequestDTO orderResponseDTO;
    private ContactRequestDTO contactResponseDTO;
    private ClientRequestDTO clientResponseDTO;
    private CompanyRequestDTO companyResponseDTO;
}