package it.unikey.erpspring.BLL.mapper.implementation;

import it.unikey.erpspring.BLL.DTO.response.OrderResponseDTO;
import it.unikey.erpspring.BLL.mapper.abstraction.GenericReponseMapper;
import it.unikey.erpspring.DAL.entity.Order;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface OrderResponseMapper extends GenericReponseMapper<Order, OrderResponseDTO> {
}
