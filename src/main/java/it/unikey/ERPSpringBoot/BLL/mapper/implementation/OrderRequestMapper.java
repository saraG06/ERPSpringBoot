package it.unikey.ERPSpringBoot.BLL.mapper.implementation;

import it.unikey.ERPSpringBoot.BLL.dto.request.OrderRequestDto;
import it.unikey.ERPSpringBoot.BLL.mapper.abstraction.GenericRequestMapper;
import it.unikey.ERPSpringBoot.DAL.Entity.Order;
import org.mapstruct.Mapper;
import org.mapstruct.ReportingPolicy;

@Mapper(componentModel = "spring")
public interface OrderRequestMapper extends GenericRequestMapper<OrderRequestDto, Order> {
}
