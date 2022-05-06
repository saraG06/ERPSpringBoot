package it.unikey.erpspring.BLL.DTO.request;

import lombok.Data;

import java.time.LocalDate;
@Data
public class ContactRequestDTO {

    private Long id;
    private String firstName;
    private String lastName;
    private LocalDate birthDate;
    private ClientRequestDTO clientRequestDTO;
    private InvoiceRequestDTO invoiceRequestDTO;
}
