package it.unikey.erp_springboot.BLL.dto.response;

import it.unikey.erp_springboot.BLL.dto.request.ClientRequestDTO;
import it.unikey.erp_springboot.BLL.dto.request.EmployeeRequestDTO;
import it.unikey.erp_springboot.BLL.dto.request.InvoiceRequestDTO;
import it.unikey.erp_springboot.BLL.dto.request.OrderRequestDTO;
import lombok.Data;

import java.time.LocalDate;
import java.util.List;

@Data
public class CompanyResponseDTO {

    private Long id;
    private String name;
    private List<ClientResponseDTO> clientResponseDTOList;
    private List<InvoiceResponseDTO> invoiceResponseDTOList;
    private List<OrderRequestDTO> orderRequestDTOList;
    private List<EmployeeRequestDTO> employeeRequestDTOList;
    private List<OperatorResponseDTO> operatorResponseDTOList;
}
