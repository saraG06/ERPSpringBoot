package it.unikey.erpspring.BLL.DTO.response;

import it.unikey.erpspring.BLL.DTO.request.ContactRequestDTO;
import it.unikey.erpspring.BLL.DTO.request.InvoiceRequestDTO;
import it.unikey.erpspring.BLL.DTO.request.OrderRequestDTO;

import java.util.List;

public class ClientResponseDTO {

    private Long id;
    private String name;
    private String IVA;
    private List<ContactResponseDTO> contactResponseDTOList;
    private List<OrderResponseDTO> orderResponseDTOList;
    private List<InvoiceResponseDTO> invoiceResponseDTOList;
}
