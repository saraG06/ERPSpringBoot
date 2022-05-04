package it.unikey.erp_springboot.BLL.dto.request;

import lombok.Data;

import java.time.LocalDate;

@Data
public class OrderRequestDTO {
    
    private String details;
    private LocalDate date;
    private Double price;
    private CollaboratorRequestDTO collaboratorRequestDTO;
    private ClientRequestDTO clientRequestDTO;
    private EmployeeRequestDTO employeeRequestDTO;
    private InvoiceRequestDTO invoiceRequestDTO;

}
