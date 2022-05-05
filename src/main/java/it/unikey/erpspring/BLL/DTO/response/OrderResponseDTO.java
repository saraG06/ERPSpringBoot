package it.unikey.erpspring.BLL.DTO.response;

import it.unikey.erpspring.BLL.DTO.request.ClientRequestDTO;
import it.unikey.erpspring.BLL.DTO.request.CompanyRequestDTO;
import lombok.Data;

import java.time.LocalDate;

@Data
public class OrderResponseDTO {

    private String detail;
    private LocalDate date;
    private Double price;
    private WorkerResponseDTO workerResponseDTO;
    private ClientResponseDTO clientResponseDTO;
    private InvoiceResponseDTO invoiceResponseDTO;
    private CompanyResponseDTO companyResponseDTO;
}
