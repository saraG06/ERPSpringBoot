package it.unikey.erp_springboot.BLL.dto.request;

import lombok.Data;

import java.time.LocalDate;

@Data
public class InvoiceRequestDTO {

    private LocalDate date;
    private OrderRequestDTO orderRequestDTO;
    private ContactRequestDTO contactRequestDTO;
}
