package it.unikey.ERPSpringBoot.BLL.dto.request;

import lombok.Data;

import java.time.LocalDate;
@Data
public class InvoiceRequestDto {

    private LocalDate date;
    private OrderRequestDto orderRequestDto;
    private ContactRequestDto contactRequestDto;
    private ClientRequestDto clientRequestDto;
    private StreamsRequestDto streamsRequestDto;
}
