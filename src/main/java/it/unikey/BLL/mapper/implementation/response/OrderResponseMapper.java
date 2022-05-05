package it.unikey.BLL.mapper.implementation.response;

import it.unikey.BLL.dto.response.OrderResponseDTO;
import it.unikey.BLL.mapper.abstraction.GenericResponseMapper;
import it.unikey.DAL.Entity.Order;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface OrderResponseMapper extends GenericResponseMapper<Order, OrderResponseDTO> {
}
