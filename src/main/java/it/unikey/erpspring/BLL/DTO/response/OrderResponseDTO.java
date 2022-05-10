package it.unikey.erpspring.BLL.DTO.response;

import it.unikey.erpspring.BLL.DTO.request.ClientRequestDTO;
import it.unikey.erpspring.BLL.DTO.request.CompanyRequestDTO;
import it.unikey.erpspring.BLL.DTO.request.InvoiceRequestDTO;
import it.unikey.erpspring.BLL.DTO.request.WorkerRequestDTO;
import lombok.Data;

import java.time.LocalDate;

@Data
public class OrderResponseDTO {

    private Long id;
    private String detail;
    private LocalDate date;
    private Double price;
    private WorkerRequestDTO workerResponseDTO;
    private ClientRequestDTO clientResponseDTO;
    private InvoiceRequestDTO invoiceResponseDTO;
    private CompanyRequestDTO companyResponseDTO;
}
