package it.unikey.erpSpringBootTest.BLL.service.abstraction;

import it.unikey.erpSpringBootTest.BLL.dto.request.ClienteRequestDTO;
import it.unikey.erpSpringBootTest.BLL.dto.request.FatturaRequestDTO;
import it.unikey.erpSpringBootTest.BLL.dto.response.FatturaResponseDTO;
import it.unikey.erpSpringBootTest.DAL.Entity.Fattura;

import java.util.List;

public interface FatturaService {

    void saveFattura(FatturaRequestDTO fatturaRequestDTO);

    void deleteFatturaById(Long id);

    List<FatturaResponseDTO> findAllFattureByCliente(ClienteRequestDTO clienteRequestDTO);

    List<FatturaResponseDTO> findAllFattureAfter2019();
}
