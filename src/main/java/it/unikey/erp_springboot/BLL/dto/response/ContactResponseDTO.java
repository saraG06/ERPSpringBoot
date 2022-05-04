package it.unikey.erp_springboot.BLL.dto.response;

import it.unikey.erp_springboot.BLL.dto.request.ClientRequestDTO;
import lombok.Data;

import java.time.LocalDate;
import java.util.List;

@Data
public class ContactResponseDTO {

    private Long id;
    private String name;
    private String lastname;
    private LocalDate birth;
    private ClientRequestDTO clientRequestDTO;
    private List<InvoiceResponseDTO> invoiceResponseDTOList;
}
