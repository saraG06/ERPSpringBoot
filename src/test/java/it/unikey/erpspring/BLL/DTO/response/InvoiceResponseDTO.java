package it.unikey.erpspring.BLL.DTO.response;

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
