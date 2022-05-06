package it.unikey.erpspringboot.BLL.service.abstraction;

import it.unikey.erpspringboot.BLL.dto.Request.FatturaRequestDTO;
import it.unikey.erpspringboot.BLL.dto.Response.FatturaResponseDTO;
import it.unikey.erpspringboot.DAL.Entity.Cliente;
import it.unikey.erpspringboot.DAL.Entity.Fattura;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface FatturaService {

    void saveFattura(FatturaRequestDTO fatturaRequestDTO);

    FatturaResponseDTO findById(Long id);

    void deleteFatturaById (Long id);

    List<FatturaResponseDTO> findAllFattura();

    List<FatturaResponseDTO> getAllFattureEmesseDopo31_12_2019();

    List<FatturaResponseDTO> getAllFattureClienteReply();

    List<FatturaResponseDTO> getAllFattureCliente(Cliente cliente);
}
