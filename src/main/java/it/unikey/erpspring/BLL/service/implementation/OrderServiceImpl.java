package it.unikey.erpspring.BLL.service.implementation;

import it.unikey.erpspring.BLL.DTO.response.OrderResponseDTO;
import it.unikey.erpspring.BLL.mapper.implementation.response.OrderResponseMapper;
import it.unikey.erpspring.BLL.service.abstraction.OrderService;
import it.unikey.erpspring.DAL.entity.Order;
import it.unikey.erpspring.DAL.repository.OrderRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class OrderServiceImpl implements OrderService {

    private final OrderResponseMapper orderResponseMapper;
    private final OrderRepository orderRepository;

    @Override
    public List<OrderResponseDTO> getOrderWithoutInvoice() {
        List<Order> lista = orderRepository.getOrderWithoutInvoice();
        return orderResponseMapper.asDTOList(lista);
    }
}
