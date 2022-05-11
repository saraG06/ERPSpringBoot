package it.unikey.BLL.dto.response;

import it.unikey.BLL.dto.request.ClientRequestDTO;
import it.unikey.BLL.dto.request.EmployeeRequestDTO;
import it.unikey.BLL.dto.request.InvoiceRequestDTO;
import it.unikey.BLL.dto.request.OrderRequestDTO;
import lombok.Data;

import java.util.List;

@Data
public class CompanyResponseDTO {
    private Long id;
    private String name;
    private List<ClientResponseDTO> clientResponseDTOList;
    private List<InvoiceResponseDTO> invoiceResponseDTOList;
    private List<OrderResponseDTO> orderResponseDTOList;
    private List<EmployeeResponseDTO> employeeResponseDTOList;
    private List<OperatorResponseDTO> operatorResponseDTOList;
}
