package it.unikey.BLL.service.impl;

import it.unikey.BLL.mapper.dto.request.OperatoreRequestDTO;
import it.unikey.BLL.mapper.dto.response.OperatoreResponseDTO;
import it.unikey.BLL.mapper.implementation.OperatoreRequestMapper;
import it.unikey.BLL.mapper.implementation.OperatoreResponseMapper;
import it.unikey.BLL.service.abstraction.OperatoreService;
import it.unikey.DAL.Entity.Operatore;
import it.unikey.DAL.Repository.OperatoreRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import javax.persistence.EntityNotFoundException;
import java.util.List;

@Service
@RequiredArgsConstructor
public class OperatoreServiceImpl implements OperatoreService {

    private final OperatoreRepository operatoreRepository;
    private final OperatoreRequestMapper operatoreRequestMapper;
    private final OperatoreResponseMapper operatoreResponseMapper;

    @Override
    public void saveOperatore(OperatoreRequestDTO operatoreRequestDTO) {
        Operatore o= operatoreRequestMapper.asEntity(operatoreRequestDTO);
        operatoreRepository.save(o);
    }

    @Override
    public OperatoreResponseDTO findById(Long id) {
        Operatore o= operatoreRepository.findById(id).get();
        if(o!=null)
            return operatoreResponseMapper.asDTO(o);
        else throw new EntityNotFoundException();
    }

    @Override
    public void deleteById(Long id) {
        Operatore o= operatoreRepository.findById(id).get();
        if(o!=null)
            operatoreRepository.delete(o);
        else
            throw new EntityNotFoundException();
    }

    @Override
    public List<OperatoreResponseDTO> findAllOperatore() {
        List<Operatore> operatoreList= operatoreRepository.findAll();
        return operatoreResponseMapper.asDTOList(operatoreList);
    }

    @Override
    public List<OperatoreResponseDTO> findDipendentiMacchina() {
        List<Operatore> operatoreList= operatoreRepository.dipendentiMacchina();
        return operatoreResponseMapper.asDTOList(operatoreList);
    }

    @Override
    public Long contaOperatori() {
        Long nOperatori= operatoreRepository.contaOperatori();
        return nOperatori;
    }

}
