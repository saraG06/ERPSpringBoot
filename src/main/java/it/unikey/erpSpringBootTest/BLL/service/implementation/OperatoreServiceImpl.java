package it.unikey.erpSpringBootTest.BLL.service.implementation;

import it.unikey.erpSpringBootTest.BLL.dto.request.OperatoreRequestDTO;
import it.unikey.erpSpringBootTest.BLL.mapper.implementation.request.OperatoreRequestMapper;
import it.unikey.erpSpringBootTest.BLL.mapper.implementation.request.OrdineRequestMapper;
import it.unikey.erpSpringBootTest.BLL.mapper.implementation.response.OperatoreResponseMapper;
import it.unikey.erpSpringBootTest.BLL.mapper.implementation.response.OrdineResponseMapper;
import it.unikey.erpSpringBootTest.BLL.service.abstraction.OperatoreService;
import it.unikey.erpSpringBootTest.DAL.Entity.Operatore;
import it.unikey.erpSpringBootTest.DAL.Entity.Ordine;
import it.unikey.erpSpringBootTest.DAL.Repository.OperatoreRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class OperatoreServiceImpl implements OperatoreService {

    private final OperatoreRepository operatoreRepository;
    private final OperatoreRequestMapper operatoreRequestMapper;
    private final OperatoreResponseMapper operatoreResponseMapper;
    private final OrdineResponseMapper ordineResponseMapper;
    private final OrdineRequestMapper ordineRequestMapper;

    @Override
    public void saveOperatore(OperatoreRequestDTO operatoreRequestDTO) {
        Operatore o = operatoreRequestMapper.asEntity(operatoreRequestDTO);
        List<Ordine> ordineList = ordineRequestMapper.asEntityList(operatoreRequestDTO.getOrdineRequestDTOList());
        o.setOrdine(ordineList);
        operatoreRepository.save(o);
    }

    @Override
    public void deleteOperatoreById(Long id) {

    }
}
