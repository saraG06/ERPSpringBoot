package it.unikey.ERPSpringBoot.BLL.dto.request;

import lombok.Data;

import java.util.List;
@Data
public class StreamsRequestDto {

    private List<EmployeeRequestDto> employeeRequestDtoList;
    private List<OrderRequestDto> orderRequestDtoList;
    private List<InvoiceRequestDto> invoiceRequestDtoList;
}
