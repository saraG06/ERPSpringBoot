package it.unikey.erpspring.BLL.DTO.response;

import it.unikey.erpspring.BLL.DTO.request.EmployeeRequestDTO;
import it.unikey.erpspring.BLL.DTO.request.InvoiceRequestDTO;
import it.unikey.erpspring.BLL.DTO.request.OrderRequestDTO;
import lombok.Data;

import java.util.List;

@Data
public class CompanyResponseDTO {

    private Long id;
    private List<EmployeeRequestDTO> employeeResponseDTOList;
    private List<OrderRequestDTO> orderResponseDTOList;
    private List<InvoiceRequestDTO> invoiceResponseDTOList;

}
