package it.unikey.erpspring.BLL.DTO.response;

import it.unikey.erpspring.BLL.DTO.request.ContactRequestDTO;
import it.unikey.erpspring.BLL.DTO.request.InvoiceRequestDTO;
import it.unikey.erpspring.BLL.DTO.request.OrderRequestDTO;
import lombok.Data;
import java.util.List;

@Data
public class ClientResponseDTO {

    private Long id;
    private String name;
    private String IVA;
    private List<ContactRequestDTO> contactResponseDTOList;
    private List<OrderRequestDTO> orderResponseDTOList;
    private List<InvoiceRequestDTO> invoiceResponseDTOList;


}
