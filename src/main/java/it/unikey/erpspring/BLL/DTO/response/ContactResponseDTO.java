package it.unikey.erpspring.BLL.DTO.response;

import it.unikey.erpspring.BLL.DTO.request.ClientRequestDTO;
import it.unikey.erpspring.BLL.DTO.request.InvoiceRequestDTO;
import lombok.Data;

import java.time.LocalDate;

@Data
public class ContactResponseDTO {

    private Long id;

    private String firstName;
    private String lastName;
    private LocalDate birthDate;
    private ClientRequestDTO clientResponseDTO;
    private InvoiceRequestDTO invoiceResponseDTO;

}
