package it.unikey.erpspring.BLL.DTO.request;

import lombok.Data;

import java.time.LocalDate;
@Data
public class InvoiceRequestDTO {

    private Long id;
    private LocalDate date;
    private OrderRequestDTO orderRequestDTO;
    private ContactRequestDTO contactRequestDTO;
    private ClientRequestDTO clientRequestDTO;
    private CompanyRequestDTO companyRequestDTO;
}
