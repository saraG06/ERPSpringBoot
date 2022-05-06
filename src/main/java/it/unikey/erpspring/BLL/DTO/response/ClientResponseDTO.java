package it.unikey.erpspring.BLL.DTO.response;


import lombok.Data;

import java.util.List;

@Data
public class ClientResponseDTO {

    private Long id;
    private String name;
    private String IVA;
    private List<ContactResponseDTO> contactResponseDTOList;
    private List<OrderResponseDTO> orderResponseDTOList;
    private List<InvoiceResponseDTO> invoiceResponseDTOList;
}