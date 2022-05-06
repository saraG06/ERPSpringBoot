package it.unikey.erpspring.BLL.service.implementation;

import it.unikey.erpspring.BLL.DTO.request.OrderRequestDTO;
import it.unikey.erpspring.BLL.DTO.response.OrderResponseDTO;
import it.unikey.erpspring.BLL.service.abstraction.OrderService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class OrderServiceImpl implements OrderService {
    @Override
    public List<OrderResponseDTO> getOrderWithoutInvoice() {
        return null;
    }

    @Override
    public void saveOrder(OrderRequestDTO orderRequestDTO) {

    }

    @Override
    public OrderResponseDTO findById(Long id) {
        return null;
    }
}
