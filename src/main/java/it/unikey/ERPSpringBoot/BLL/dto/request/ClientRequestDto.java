package it.unikey.ERPSpringBoot.BLL.dto.request;

import lombok.Data;

import java.util.List;
@Data

public class ClientRequestDto {

    private List<InvoiceRequestDto> invoiceRequestDtoList;
    private String name;
    private String Iva;
    private List<ContactRequestDto> contactRequestDtoList;
    private List<OrderRequestDto> orderRequestDtoList;

}
