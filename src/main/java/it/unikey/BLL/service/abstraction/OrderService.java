package it.unikey.BLL.service.abstraction;

import it.unikey.BLL.dto.request.OrderRequestDTO;
import it.unikey.BLL.dto.response.OrderResponseDTO;
import it.unikey.BLL.exception.IdNotFoundException;

import java.util.List;

public interface OrderService {
    void saveOrder (OrderRequestDTO orderRequestDTO);
    OrderResponseDTO findById(Long id) throws IdNotFoundException;
    void deleteOrderById(Long id) throws IdNotFoundException;
    List<OrderResponseDTO> findAllOrders();
}
