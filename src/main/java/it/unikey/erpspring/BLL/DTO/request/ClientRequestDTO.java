package it.unikey.erpspring.BLL.DTO.request;


import lombok.Data;

import java.util.List;

@Data
public class ClientRequestDTO {

    private String name;
    private String iva;
    private List<ContactRequestDTO> contactRequestDTOList;
    private List<OrderRequestDTO> orderRequestDTOList;
    private List<InvoiceRequestDTO> invoiceRequestDTOList;
}
