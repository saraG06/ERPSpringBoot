package it.unikey.erpspring.BLL.service.abstraction;


import it.unikey.erpspring.BLL.DTO.response.OrderResponseDTO;

import java.util.List;

public interface OrderService {

    List<OrderResponseDTO> getOrderWithoutInvoice();
}
