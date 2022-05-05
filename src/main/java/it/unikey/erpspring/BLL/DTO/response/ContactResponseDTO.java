package it.unikey.erpspring.BLL.DTO.response;

import it.unikey.erpspring.BLL.DTO.request.ClientRequestDTO;
import lombok.Data;

import java.time.LocalDate;

@Data
public class ContactResponseDTO {

    private String firstName;
    private String lastName;
    private LocalDate birthDate;
    private ClientResponseDTO clientResponseDTO;
    private InvoiceResponseDTO invoiceResponseDTO;
}
