package it.unikey.erp_springboot.BLL.dto.request;

import lombok.Data;

import java.util.List;

@Data
public class CompanyRequestDTO {

    private String name;
    private List<InvoiceRequestDTO> invoiceRequestDTOList;
    private List<ClientRequestDTO> clientRequestDTOList;
    private List<OperatorRequestDTO> operatorRequestDTOList;
    private List<EmployeeRequestDTO> employeeRequestDTOList;
    private List<OrderRequestDTO> orderRequestDTOList;

}
