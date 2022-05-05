package it.unikey.BLL.service.implementation;

import it.unikey.BLL.dto.request.OperatorRequestDTO;
import it.unikey.BLL.dto.response.OperatorResponseDTO;
import it.unikey.BLL.service.abstraction.OperatorService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class OperatorServiceImplementation implements OperatorService {
    private final Operator
    @Override
    public void saveOperator(OperatorRequestDTO operatorRequestDTO) {

    }

    @Override
    public OperatorResponseDTO findById(Long id) {
        return null;
    }

    @Override
    public void deleteOperatorById(Long id) {

    }

    @Override
    public List<OperatorResponseDTO> findAllOperators() {
        return null;
    }
}
