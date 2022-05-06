package it.unikey.ERPSpringBoot.BLL.dto.response;

import lombok.Data;

import java.time.LocalDate;
@Data
public class OrderResponseDto {

    private Long id;
    private String detail;
    private LocalDate date;
    private double price;
    private WorkerResponseDto workerResponseDto;
    private ClientResponseDto clientResponseDto;
    private InvoiceResponseDto invoiceResponseDto;
    private StreamsResponseDto streamsResponseDto;
}
