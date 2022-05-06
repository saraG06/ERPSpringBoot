package it.unikey.erpspring.BLL.service.abstraction;

import it.unikey.erpspring.BLL.DTO.request.OrderRequestDTO;
import it.unikey.erpspring.BLL.DTO.response.OrderResponseDTO;
import it.unikey.erpspring.DAL.entity.Order;

import java.util.List;

public interface OrderService {

    List<OrderResponseDTO> getOrderWithoutInvoice();

    void saveOrder (OrderRequestDTO orderRequestDTO);

    OrderResponseDTO findById(Long id);
}
