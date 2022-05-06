package it.unikey.erpspring.BLL.DTO.request;

import lombok.Data;

import java.util.List;
@Data
public class CompanyRequestDTO {


    private List<EmployeeRequestDTO> employeeRequestDTOList;
    private List<OrderRequestDTO> orderRequestDTOList;
    private List<InvoiceRequestDTO> invoiceRequestDTOList;
    private List<WorkerRequestDTO> workerRequestDTOList;
    private List<ClientRequestDTO> clientRequestDTOList;
}
