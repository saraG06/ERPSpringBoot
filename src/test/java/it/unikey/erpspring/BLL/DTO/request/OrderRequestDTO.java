package it.unikey.erpspring.BLL.DTO.request;

import lombok.Data;

import java.time.LocalDate;
@Data
public class OrderRequestDTO {

    private Long id;
    private String detail;
    private LocalDate date;
    private Double price;
    private WorkerRequestDTO workerRequestDTO;
    private ClientRequestDTO clientRequestDTO;
    private InvoiceRequestDTO invoiceRequestDTO;
    private CompanyRequestDTO companyRequestDTO;

}
