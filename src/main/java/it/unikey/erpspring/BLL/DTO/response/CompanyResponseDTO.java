package it.unikey.erpspring.BLL.DTO.response;

import lombok.Data;

import java.util.List;
@Data
public class CompanyResponseDTO {

    private Long id;
    private List<EmployeeResponseDTO> employeeResponseDTOList;
    private List<OrderResponseDTO> orderResponseDTOList;
    private List<InvoiceResponseDTO> invoiceRequestDTOList;
    private List<WorkerResponseDTO> workerResponseDTOList;
    private List<ClientResponseDTO> clientResponseDTOList;
}
