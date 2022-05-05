package it.unikey.BLL.dto.response;

import it.unikey.BLL.dto.request.ClientRequestDTO;
import lombok.Data;

import java.time.LocalDate;

@Data
public class OrderResponseDTO {
    private Long id;
    private String details;
    private LocalDate date;
    private Double price;
    private ClientRequestDTO clientRequestDTO;

}
