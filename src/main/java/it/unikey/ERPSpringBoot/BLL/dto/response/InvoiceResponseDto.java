package it.unikey.ERPSpringBoot.BLL.dto.response;

import lombok.Data;

import java.time.LocalDate;
@Data
public class InvoiceResponseDto {

    private Long id;
    private LocalDate date;
    private OrderResponseDto orderResponseDto;
    private ContactResponseDto contactResponseDto;
    private ClientResponseDto clientResponseDto;
    private StreamsResponseDto streamsResponseDto;
}
