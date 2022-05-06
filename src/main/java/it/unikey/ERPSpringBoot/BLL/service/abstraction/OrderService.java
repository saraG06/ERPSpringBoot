package it.unikey.ERPSpringBoot.BLL.service.abstraction;

import it.unikey.ERPSpringBoot.BLL.dto.request.OrderRequestDto;
import it.unikey.ERPSpringBoot.BLL.dto.response.OrderResponseDto;
import it.unikey.ERPSpringBoot.DAL.Entity.Order;

import java.util.List;

public interface OrderService {

    List<Order> getOrderWithoutInvoice();
    void save (OrderRequestDto orderRequestDto);
    OrderResponseDto findById (Long id);
}
