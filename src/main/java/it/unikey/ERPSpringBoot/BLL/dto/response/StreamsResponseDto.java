package it.unikey.ERPSpringBoot.BLL.dto.response;

import lombok.Data;

import java.util.List;
@Data
public class StreamsResponseDto {

    private Long id;
    private List<EmployeeResponseDto> employeeResponseDtoList;
    private List<OrderResponseDto> orderResponseDtoList;
    private List<InvoiceResponseDto> invoiceResponseDtoList;
}
