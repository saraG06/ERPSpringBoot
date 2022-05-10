package it.unikey.erpspring.BLL.service.abstraction;

import it.unikey.erpspring.BLL.DTO.request.OrderRequestDTO;
import it.unikey.erpspring.BLL.DTO.response.OrderResponseDTO;

import java.util.List;

public interface OrderService {

    /*List<OrderResponseDTO> getOrderWithoutInvoice();*/

    void saveOrder(OrderRequestDTO orderRequestDTO);

    OrderResponseDTO findOrderById(Long id);

    void deleteOrderById(Long id);

    List<OrderResponseDTO> findAllOrder();
}
