package com.example.erpspring.BLL.service.implementation;

import com.example.erpspring.BLL.dto.request.OperatoreRequestDTO;
import com.example.erpspring.BLL.dto.response.OperatoreResponseDTO;
import com.example.erpspring.BLL.mapper.implementation.OperatoreRequestMapper;
import com.example.erpspring.BLL.mapper.implementation.OperatoreResponseMapper;
import com.example.erpspring.BLL.service.abstraction.OperatoreService;
import com.example.erpspring.DAL.Entity.persone.Operatore;
import com.example.erpspring.DAL.Repository.OperatoreRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
@RequiredArgsConstructor
public class OperatoreServiceImpl implements OperatoreService {

    private final OperatoreRepository operatoreRepository;
    private final OperatoreResponseMapper operatoreResponseMapper;
    private final OperatoreRequestMapper operatoreRequestMapper;

    @Override
    public void saveOperatore(OperatoreRequestDTO operatoreRequestDTO) {
        Operatore o = operatoreRequestMapper.asEntity(operatoreRequestDTO) ;
        operatoreRepository.save(o);
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
