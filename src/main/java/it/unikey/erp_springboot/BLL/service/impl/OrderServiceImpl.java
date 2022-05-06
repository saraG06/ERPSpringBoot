package it.unikey.erp_springboot.BLL.service.impl;

import it.unikey.erp_springboot.BLL.dto.request.OrderRequestDTO;
import it.unikey.erp_springboot.BLL.dto.response.OrderResponseDTO;
import it.unikey.erp_springboot.BLL.mapper.implementation.ClientRequestMapper;
import it.unikey.erp_springboot.BLL.mapper.implementation.CompanyRequestMapper;
import it.unikey.erp_springboot.BLL.mapper.implementation.OrderRequestMapper;
import it.unikey.erp_springboot.BLL.mapper.implementation.OrderResponseMapper;
import it.unikey.erp_springboot.BLL.service.abstraction.OrderService;
import it.unikey.erp_springboot.DAL.Entity.Client;
import it.unikey.erp_springboot.DAL.Entity.Company;
import it.unikey.erp_springboot.DAL.Entity.Order;
import it.unikey.erp_springboot.DAL.Repository.OrderRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class OrderServiceImpl implements OrderService {
    private final OrderRepository orderRepository;
    private final OrderRequestMapper orderRequestMapper;
    private final OrderResponseMapper orderResponseMapper;
    private final CompanyRequestMapper companyRequestMapper;
    private final ClientRequestMapper clientRequestMapper;

    @Override
    public void saveOrder(OrderRequestDTO orderRequestDTO) {
        Order o = orderRequestMapper.asEntity(orderRequestDTO);
        Client cl = clientRequestMapper.asEntity(orderRequestDTO.getClientRequestDTO());
        o.setClient(cl);
        orderRepository.save(o);
    }

    @Override
    public OrderResponseDTO findById(Long id) {
        Order o = orderRepository.getById(id);
        if(o != null){
            return orderResponseMapper.asDTO(o);
        }else{
            throw new NullPointerException();
        }
    }
    @Override
    public void deleteOrderById(Long id) {
        if(orderRepository.existsById(id)){
            orderRepository.deleteById(id);
        }else{
            throw new NullPointerException();
        }
    }

    @Override
    public List<OrderResponseDTO> findAllOrder() {
        List<Order> list = orderRepository.findAll();
        return orderResponseMapper.asDTOList(list);
    }

    @Override
    public List<OrderResponseDTO> findOrderWithoutInvoice() {
        return orderResponseMapper.asDTOList(orderRepository.findOrderWithoutInvoice());
    }
}
