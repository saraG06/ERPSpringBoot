package it.unikey.erp_springboot.BLL.dto.response;

import it.unikey.erp_springboot.BLL.dto.request.ContactRequestDTO;
import lombok.Data;

import java.time.LocalDate;
@Data
public class InvoiceResponseDTO {

    private Long id;
    private LocalDate date;
    private OrderResponseDTO orderResponseDTO;
    private ContactResponseDTO contactResponseDTO;
}
