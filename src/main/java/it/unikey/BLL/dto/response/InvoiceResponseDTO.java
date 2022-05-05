package it.unikey.BLL.dto.response;

import it.unikey.BLL.dto.request.CompanyRequestDTO;
import it.unikey.BLL.dto.request.ContactRequestDTO;
import it.unikey.BLL.dto.request.OrderRequestDTO;
import lombok.Data;

import java.time.LocalDate;

@Data
public class InvoiceResponseDTO {
    private Long id;
    private LocalDate date;
    private OrderRequestDTO orderRequestDTO;
    private ContactRequestDTO contactRequestDTO;
    private CompanyRequestDTO companyRequestDTO;
}
