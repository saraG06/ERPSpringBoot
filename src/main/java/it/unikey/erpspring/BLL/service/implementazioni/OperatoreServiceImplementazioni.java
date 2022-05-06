package it.unikey.erpspring.BLL.service.implementazioni;

import it.unikey.erpspring.BLL.dto.request.OperatoreRequestDTO;
import it.unikey.erpspring.BLL.dto.response.OperatoreResponseDTO;
import it.unikey.erpspring.BLL.mapper.implementazioni.request.OperatoreRequestMapper;
import it.unikey.erpspring.BLL.mapper.implementazioni.response.OperatoreResponseMapper;
import it.unikey.erpspring.BLL.service.astratti.OperatoreService;
import it.unikey.erpspring.DAL.Entity.Operatore;
import it.unikey.erpspring.DAL.Repository.OperatoreRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class OperatoreServiceImplementazioni implements OperatoreService {

    private final OperatoreRepository operatoreRepository;
    private final OperatoreRequestMapper operatoreRequestMapper;
    private final OperatoreResponseMapper operatoreResponseMapper;

    @Override
    public void saveOperatore(OperatoreRequestDTO operatoreRequestDTO) {
        Operatore o = operatoreRequestMapper.asEntity(operatoreRequestDTO);
        operatoreRepository.save(o);
    }

    @Override
    public OperatoreResponseDTO findbyId(Long id) {
        Operatore o = operatoreRepository.findById(id).get();
        return operatoreResponseMapper.asDTO(o);
    }

    @Override
    public void deleteById(Long id) {
        Operatore o = operatoreRepository.findById(id).get();
        operatoreRepository.delete(o);
    }

    @Override
    public List<OperatoreResponseDTO> findAllOperatori() {
        List<Operatore> operatores = operatoreRepository.findAll();
        return operatoreResponseMapper.asDTOList(operatores);
    }
}