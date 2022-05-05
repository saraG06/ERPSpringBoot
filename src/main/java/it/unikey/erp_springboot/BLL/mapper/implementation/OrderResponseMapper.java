package it.unikey.erp_springboot.BLL.mapper.implementation;

import it.unikey.erp_springboot.BLL.dto.response.OrderResponseDTO;
import it.unikey.erp_springboot.BLL.mapper.abstraction.GenericResponseMapper;
import it.unikey.erp_springboot.DAL.Entity.Order;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface OrderResponseMapper extends GenericResponseMapper<Order, OrderResponseDTO> {
}
