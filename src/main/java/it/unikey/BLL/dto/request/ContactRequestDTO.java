package it.unikey.BLL.dto.request;

import lombok.Data;

import java.time.LocalDate;
import java.util.List;

@Data
public class ContactRequestDTO {

    private String name;
    private String surname;
    private LocalDate birth;
    private ClientRequestDTO clientRequestDTO;
    private List<InvoiceRequestDTO> invoiceRequestDTOList;
}
