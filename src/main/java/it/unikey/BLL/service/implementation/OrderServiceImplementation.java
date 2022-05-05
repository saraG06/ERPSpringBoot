package it.unikey.BLL.service.implementation;

import it.unikey.BLL.dto.request.OrderRequestDTO;
import it.unikey.BLL.dto.response.OrderResponseDTO;
import it.unikey.BLL.service.abstraction.OrderService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class OrderServiceImplementation implements OrderService {
    @Override
    public void saveOrder(OrderRequestDTO orderRequestDTO) {

    }

    @Override
    public OrderResponseDTO findById(Long id) {
        return null;
    }

    @Override
    public void deleteOrderById(Long id) {

    }

    @Override
    public List<OrderResponseDTO> findAllOrders() {
        return null;
    }
}
