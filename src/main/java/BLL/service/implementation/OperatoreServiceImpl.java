package BLL.service.implementation;

import BLL.dto.request.OperatoreRequestDTO;
import BLL.dto.response.OperatoreResponseDTO;
import BLL.mapper.implementation.OperatoreRequestMapper;
import BLL.mapper.implementation.OperatoreResponseMapper;
import BLL.service.abstraction.OperatoreService;
import DAL.Entity.persone.Operatore;
import DAL.Repository.OperatoreRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
@RequiredArgsConstructor
public class OperatoreServiceImpl implements OperatoreService {

    OperatoreRepository operatoreRepository;
    OperatoreResponseMapper operatoreResponseMapper;
    OperatoreRequestMapper operatoreRequestMapper;

    @Override
    public void saveOperatore(OperatoreRequestDTO operatoreRequestDTO) {
        operatoreRepository.save(operatoreRequestMapper.asEntity(operatoreRequestDTO));
    }

    @Override
    public OperatoreResponseDTO findById(Long id) {
        return operatoreResponseMapper.asDTO(operatoreRepository.findById(id).get());
    }

    @Override
    public void deleteOperatoreById(Long id) {
        operatoreRepository.deleteById(id);
    }

    @Override
    public List<OperatoreResponseDTO> findAllOperatore() {
        return operatoreResponseMapper.asDTOList(operatoreRepository.findAll());
    }
}
