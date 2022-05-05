package it.unikey.erp_springboot.BLL.mapper.implementation;

import it.unikey.erp_springboot.BLL.dto.request.OrderRequestDTO;
import it.unikey.erp_springboot.BLL.mapper.abstraction.GenericRequestMapper;
import it.unikey.erp_springboot.DAL.Entity.Order;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface OrderRequestMapper extends GenericRequestMapper<Order, OrderRequestDTO> {
}
