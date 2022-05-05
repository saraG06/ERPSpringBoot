package it.unikey.erpspring.BLL.DTO.response;

import it.unikey.erpspring.BLL.DTO.request.ClientRequestDTO;
import it.unikey.erpspring.BLL.DTO.request.CompanyRequestDTO;
import lombok.Data;

import java.time.LocalDate;

@Data
public class InvoiceResponseDTO {

    private Long id;
    private LocalDate date;
    private OrderResponseDTO orderResponseDTO;
    private ContactResponseDTO contactResponseDTO;
    private ClientResponseDTO clientResponseDTO;
    private CompanyResponseDTO companyResponseDTO;
}
