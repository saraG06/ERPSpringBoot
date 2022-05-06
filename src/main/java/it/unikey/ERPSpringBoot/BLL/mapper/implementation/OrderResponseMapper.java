package it.unikey.ERPSpringBoot.BLL.mapper.implementation;

import it.unikey.ERPSpringBoot.BLL.dto.response.OrderResponseDto;
import it.unikey.ERPSpringBoot.BLL.mapper.abstraction.GenericResponseMapper;
import it.unikey.ERPSpringBoot.DAL.Entity.Order;
import org.mapstruct.Mapper;
import org.mapstruct.ReportingPolicy;

@Mapper(componentModel = "spring")
public interface OrderResponseMapper extends GenericResponseMapper<Order, OrderResponseDto> {
}
