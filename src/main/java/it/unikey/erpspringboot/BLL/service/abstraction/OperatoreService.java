package it.unikey.erpspringboot.BLL.service.abstraction;

import it.unikey.erpspringboot.BLL.dto.Request.OperatoreRequestDTO;
import it.unikey.erpspringboot.BLL.dto.Request.OperatoreRequestDTO2;
import it.unikey.erpspringboot.BLL.dto.Response.OperatoreResponseDTO;
import it.unikey.erpspringboot.DAL.Entity.Operatore;
import org.springframework.data.repository.query.Param;

import java.time.LocalDate;
import java.util.List;

public interface OperatoreService {

    void saveOperatore(OperatoreRequestDTO operatoreRequestDTO);

    void saveOperatoreSenzaAzienda(OperatoreRequestDTO2 operatoreRequestDTO);

    OperatoreResponseDTO findById(Long id);

    void deleteOperatoreById (Long id);

    List<OperatoreResponseDTO> findAllOperatore();

    List<OperatoreResponseDTO> getAllAssuntiUltimoMese(LocalDate now);
}
