package it.unikey.BLL.dto.request;

import lombok.Data;

import java.util.List;

@Data
public class CompanyRequestDTO {

    private String name;
    private List<ClientRequestDTO> clientRequestDTOList;
    private List<InvoiceRequestDTO> invoiceRequestDTOList;
    private List<OrderRequestDTO> orderRequestDTOList;
    private List<EmployeeRequestDTO> employeeRequestDTOList;
}
