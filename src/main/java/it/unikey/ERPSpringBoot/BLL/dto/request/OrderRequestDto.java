package it.unikey.ERPSpringBoot.BLL.dto.request;

import lombok.Data;

import java.time.LocalDate;
@Data
public class OrderRequestDto {

    private String detail;
    private LocalDate date;
    private double price;
    private WorkerRequestDto workerRequestDto;
    private ClientRequestDto clientRequestDto;
    private InvoiceRequestDto invoiceRequestDto;
    private StreamsRequestDto streamsRequestDto;
}
