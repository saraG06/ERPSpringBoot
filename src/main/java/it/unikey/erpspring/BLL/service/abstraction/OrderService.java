package it.unikey.erpspring.BLL.service.abstraction;

import it.unikey.erpspring.BLL.DTO.request.OrderRequestDTO;
import it.unikey.erpspring.BLL.DTO.response.OrderResponseDTO;
import it.unikey.erpspring.BLL.service.exception.EntityNotFoundException;


import java.util.List;

public interface OrderService {

    void saveOrder(OrderRequestDTO orderRequestDTO);

    OrderResponseDTO getOrderById(Long id) throws EntityNotFoundException;

    void deleteOrderById(Long id) throws EntityNotFoundException;

    List<OrderResponseDTO> getAllOrder();

    List<OrderResponseDTO> getAllOrderWithNoinvoice();


}
