package it.unikey.erp_springboot.BLL.dto.response;

import it.unikey.erp_springboot.BLL.dto.request.ClientRequestDTO;
import it.unikey.erp_springboot.BLL.dto.request.InvoiceRequestDTO;
import lombok.Data;

import java.time.LocalDate;
@Data
public class OrderResponseDTO {

    private Long id;
    private String details;
    private LocalDate date;
    private Double price;
    private CollaboratorResponseDTO collaboratorResponseDTO;
    private ClientResponseDTO clientResponseDTO;
    private EmployeeResponseDTO employeeResponseDTO;

}
