package it.unikey.BLL.dto.request;

import lombok.Data;

import java.time.LocalDate;

@Data
public class OrderRequestDTO {
    private String details;
    private LocalDate date;
    private Double price;
    private ClientRequestDTO clientRequestDTO;
}
