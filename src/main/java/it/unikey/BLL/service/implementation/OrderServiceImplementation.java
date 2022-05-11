package it.unikey.BLL.service.implementation;

import it.unikey.BLL.dto.request.OrderRequestDTO;
import it.unikey.BLL.dto.response.OrderResponseDTO;
import it.unikey.BLL.exception.IdNotFoundException;
import it.unikey.BLL.mapper.implementation.request.ClientRequestMapper;
import it.unikey.BLL.mapper.implementation.request.OrderRequestMapper;
import it.unikey.BLL.mapper.implementation.response.OrderResponseMapper;
import it.unikey.BLL.service.abstraction.OrderService;
import it.unikey.DAL.Entity.Client;
import it.unikey.DAL.Entity.Company;
import it.unikey.DAL.Entity.Employee;
import it.unikey.DAL.Entity.Order;
import it.unikey.DAL.Repository.OrderRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class OrderServiceImplementation implements OrderService {
    private final OrderRepository orderRepository;
    private final OrderRequestMapper orderRequestMapper;
    private final OrderResponseMapper orderResponseMapper;
    private final ClientRequestMapper clientRequestMapper;

    @Override
    public void saveOrdine(OrderRequestDTO orderRequestDTO) {
        Order o = orderRequestMapper.asEntity(orderRequestDTO);
        Client client = clientRequestMapper.asEntity(orderRequestDTO.getClientRequestDTO());
        o.setClient(client);
        orderRepository.save(o);
    }

    @Override
    public OrderResponseDTO findById(Long id) throws IdNotFoundException {
        Order o = null;
        if (orderRepository.findById(id).isPresent()) {
            o = orderRepository.findById(id).get();
        }
        if(o == null){
            throw new IdNotFoundException("Id " + id + " non è presente nel db");
        }
        else {
            return orderResponseMapper.asDto(o);
        }
    }

    @Override
    public void deleteOrdineById(Long id) throws IdNotFoundException {
        if(orderRepository.findById(id).isPresent()) {
            Order o = orderRepository.findById(id).get();
            if (o != null) {
                orderRepository.delete(o);
            }
            else{
                throw new IdNotFoundException("Id " + id + " non è presente nel db");
            }
        }
    }
    @Override
    public List<OrderResponseDTO> findAllOrdini() {
        return orderResponseMapper.asDTOList(orderRepository.findAll());
    }
}
