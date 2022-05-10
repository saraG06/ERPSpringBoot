package it.unikey.erpspring.BLL.service.implementation;

import it.unikey.erpspring.BLL.DTO.request.OrderRequestDTO;
import it.unikey.erpspring.BLL.DTO.response.OrderResponseDTO;
import it.unikey.erpspring.BLL.mapper.implementation.*;
import it.unikey.erpspring.BLL.service.abstraction.OrderService;
import it.unikey.erpspring.DAL.entity.Order;
import it.unikey.erpspring.DAL.repository.OrderRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class OrderServiceImpl implements OrderService {

    private final OrderRepository orderRepository;
    private final OrderRequestMapper orderRequestMapper;
    private final OrderResponseMapper orderResponseMapper;
    private final WorkerRequestMapper workerRequestMapper;
    private final ClientRequestMapper clientRequestMapper;
    private final CompanyRequestMapper companyRequestMapper;
/*
    @Override
    public List<OrderResponseDTO> getOrderWithoutInvoice() {
        List<Order> o = orderRepository.getOrderWithoutInvoice();
        return orderResponseMapper.asDTOList(o);
    }*/

    @Override
    public void saveOrder(OrderRequestDTO orderRequestDTO) {
        Order o = orderRequestMapper.asEntity(orderRequestDTO);
        o.setWorker(workerRequestMapper.asEntity(orderRequestDTO.getWorkerRequestDTO()));
        o.setClient(clientRequestMapper.asEntity(orderRequestDTO.getClientRequestDTO()));
        o.setCompany(companyRequestMapper.asEntity(orderRequestDTO.getCompanyRequestDTO()));
        orderRepository.save(o);
    }

    @Override
    public OrderResponseDTO findOrderById(Long id) {
        Order o = orderRepository.getById(id);
        if(id != null){
            return orderResponseMapper.asDTO(o);
        }else{
            throw new NullPointerException();
        }
    }

    @Override
    public void deleteOrderById(Long id) throws NullPointerException{
        if(orderRepository.existsById(id)){
            orderRepository.deleteById(id);
        }else{
            throw new NullPointerException();
        }
    }

    @Override
    public List<OrderResponseDTO> findAllOrder() {
        List<Order> o = orderRepository.findAll();
        return orderResponseMapper.asDTOList(o);
    }
}
