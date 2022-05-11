package it.unikey.BLL.service.abstraction;

import it.unikey.BLL.dto.request.OrderRequestDTO;
import it.unikey.BLL.dto.response.OrderResponseDTO;
import it.unikey.BLL.exception.IdNotFoundException;

import java.util.List;

public interface OrderService {
    void saveOrdine (OrderRequestDTO orderRequestDTO);
    OrderResponseDTO findById(Long id) throws IdNotFoundException;
    void deleteOrdineById(Long id) throws IdNotFoundException;
    List<OrderResponseDTO> findAllOrdini();
}
