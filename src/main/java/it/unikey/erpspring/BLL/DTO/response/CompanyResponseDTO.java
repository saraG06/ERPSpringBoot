package it.unikey.erpspring.BLL.DTO.response;

import it.unikey.erpspring.BLL.DTO.request.EmployeeRequestDTO;
import it.unikey.erpspring.BLL.DTO.request.InvoiceRequestDTO;
import it.unikey.erpspring.BLL.DTO.request.OrderRequestDTO;

import java.util.List;

public class CompanyResponseDTO {

    private Long id;
    private List<EmployeeResponseDTO> employeeResponseDTOList;
    private List<OrderResponseDTO> orderResponseDTOList;
    private List<InvoiceResponseDTO> invoiceResponseDTOList;
}
