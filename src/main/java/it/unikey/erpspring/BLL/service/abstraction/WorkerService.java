package it.unikey.erpspring.BLL.service.abstraction;

import it.unikey.erpspring.BLL.DTO.request.OrderRequestDTO;

public interface WorkerService {

    void saveOrder(OrderRequestDTO orderRequestDTO);
}
