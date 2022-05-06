package it.unikey.erpspring.BLL.service.implementation;

import it.unikey.erpspring.BLL.DTO.request.OrderRequestDTO;
import it.unikey.erpspring.BLL.DTO.response.OrderResponseDTO;
import it.unikey.erpspring.BLL.mapper.implementation.ClientRequestMapper;
import it.unikey.erpspring.BLL.mapper.implementation.OrderRequestMapper;
import it.unikey.erpspring.BLL.mapper.implementation.OrderResponseMapper;
import it.unikey.erpspring.BLL.service.abstraction.OrderService;
import it.unikey.erpspring.BLL.service.exception.EntityNotFoundException;
import it.unikey.erpspring.DAL.entity.Client;
import it.unikey.erpspring.DAL.entity.Order;
import it.unikey.erpspring.DAL.repository.OrderRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class OrderServiceImpl implements OrderService {
    private final OrderRepository orderRepository;
    private final OrderRequestMapper orderRequestMapper;
    private final OrderResponseMapper orderResponseMapper;
    private final ClientRequestMapper clientRequestMapper;

    @Override
    public void saveOrder(OrderRequestDTO orderRequestDTO) {
        Order o = orderRequestMapper.asEntity(orderRequestDTO);
        Client client = clientRequestMapper.asEntity(orderRequestDTO.getClientRequestDTO());
        o.setClient(client);
        orderRepository.save(o);
    }



    @Override
    public OrderResponseDTO getOrderById(Long id) throws EntityNotFoundException {
        Order o = null;
        if (orderRepository.findById(id).isPresent()) {
            o = orderRepository.findById(id).get();
        }
        if (o == null) {
            throw new EntityNotFoundException("Id " + id + " non è presente nel db");
        } else {
            return orderResponseMapper.asDTO(o);
        }
    }


    @Override
    public void deleteOrderById(Long id) throws EntityNotFoundException {
        if (orderRepository.findById(id).isPresent()) {
            Order o = orderRepository.findById(id).get();
            if (o != null) {
                orderRepository.delete(o);
            } else {
                throw new EntityNotFoundException("Id " + id + " non è presente nel db");
            }
        }
    }

    @Override
    public List<OrderResponseDTO> getAllOrder() {
        return orderResponseMapper.asDTOList(orderRepository.findAll());
    }

    @Override
    public List<OrderResponseDTO> getAllOrderWithNoinvoice() {
        return orderResponseMapper.asDTOList(orderRepository.orderWithNoInvoice());
    }
}


