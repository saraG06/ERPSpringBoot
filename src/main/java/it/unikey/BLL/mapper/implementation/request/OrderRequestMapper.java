package it.unikey.BLL.mapper.implementation.request;

import it.unikey.BLL.dto.request.OrderRequestDTO;
import it.unikey.BLL.mapper.abstraction.GenericRequestMapper;
import it.unikey.DAL.Entity.Order;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface OrderRequestMapper extends GenericRequestMapper<Order, OrderRequestDTO> {
}
