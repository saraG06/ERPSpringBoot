package it.unikey.erpSpringBootTest.BLL.service.abstraction;

import it.unikey.erpSpringBootTest.BLL.dto.request.OperatoreRequestDTO;

public interface OperatoreService {

    void saveOperatore(OperatoreRequestDTO operatoreRequestDTO);

    void deleteOperatoreById(Long id);
}
