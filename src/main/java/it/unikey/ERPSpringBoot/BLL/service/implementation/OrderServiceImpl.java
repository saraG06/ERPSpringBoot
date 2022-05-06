package it.unikey.ERPSpringBoot.BLL.service.implementation;

import it.unikey.ERPSpringBoot.BLL.dto.request.OrderRequestDto;
import it.unikey.ERPSpringBoot.BLL.dto.response.OrderResponseDto;
import it.unikey.ERPSpringBoot.BLL.mapper.implementation.OrderRequestMapper;
import it.unikey.ERPSpringBoot.BLL.mapper.implementation.OrderResponseMapper;
import it.unikey.ERPSpringBoot.BLL.service.abstraction.OrderService;
import it.unikey.ERPSpringBoot.DAL.Entity.Order;
import it.unikey.ERPSpringBoot.DAL.Repository.OrderRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor

public class OrderServiceImpl implements OrderService {

    private final OrderRepository orderRepository;
    private final OrderRequestMapper orderRequestMapper;
    private final OrderResponseMapper orderResponseMapper;


    @Override
    public List<Order> getOrderWithoutInvoice() {
        return null;
    }

    @Override
    public void save(OrderRequestDto orderRequestDto) {

        Order o = orderRequestMapper.asEntity(orderRequestDto);
        orderRepository.save(o);
    }

    @Override
    public OrderResponseDto findById(Long id) {
        Order o = orderRepository.getById(id);
        if(o!= null){
            orderRepository.findById(id);
        } else throw new NullPointerException();
        return orderResponseMapper.asDto(o);
    }
}
