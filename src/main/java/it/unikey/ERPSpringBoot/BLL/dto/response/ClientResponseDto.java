package it.unikey.ERPSpringBoot.BLL.dto.response;

import lombok.Data;

import java.util.List;
@Data
public class ClientResponseDto {

    private Long id;
    private List<InvoiceResponseDto> invoiceResponseDtoList;
    private String name;
    private String Iva;
    private List<ContactResponseDto> contactResponseDtoList;
    private List<OrderResponseDto> orderResponseDtoList;
}
