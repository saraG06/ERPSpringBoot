package it.unikey.erp_springboot.BLL.service.abstraction;

import it.unikey.erp_springboot.BLL.dto.request.OrderRequestDTO;
import it.unikey.erp_springboot.BLL.dto.response.OrderResponseDTO;

import java.util.List;

public interface OrderService {

    void saveOrder(OrderRequestDTO orderRequestDTO);

    OrderResponseDTO findById(Long id);

    void deleteOrderById(Long id);

    List<OrderResponseDTO> findAllOrder();
}
