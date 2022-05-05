package it.unikey.BLL.dto.response;

import it.unikey.BLL.dto.request.ClientRequestDTO;
import it.unikey.BLL.dto.request.InvoiceRequestDTO;
import lombok.Data;

import java.time.LocalDate;
import java.util.List;

@Data
public class ContactResponseDTO {
    private Long id;
    private String name;
    private String surname;
    private LocalDate birth;
    private ClientRequestDTO clientRequestDTO;
    private List<InvoiceRequestDTO> invoiceRequestDTOList;
}
