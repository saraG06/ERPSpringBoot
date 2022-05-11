package it.unikey.BLL.service.implementation;

import it.unikey.BLL.dto.request.OperatorRequestDTO;
import it.unikey.BLL.dto.response.OperatorResponseDTO;
import it.unikey.BLL.exception.IdNotFoundException;
import it.unikey.BLL.mapper.implementation.request.CompanyRequestMapper;
import it.unikey.BLL.mapper.implementation.request.OperatorRequestMapper;
import it.unikey.BLL.mapper.implementation.response.CompanyResponseMapper;
import it.unikey.BLL.mapper.implementation.response.OperatorResponseMapper;
import it.unikey.BLL.service.abstraction.OperatorService;
import it.unikey.DAL.Entity.Company;
import it.unikey.DAL.Entity.Employee;
import it.unikey.DAL.Entity.Operator;
import it.unikey.DAL.Entity.Order;
import it.unikey.DAL.Repository.OperatorRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class OperatorServiceImplementation implements OperatorService {
    private final OperatorRepository operatorRepository;
    private final OperatorRequestMapper operatorRequestMapper;
    private final OperatorResponseMapper operatorResponseMapper;
    private final CompanyRequestMapper companyRequestMapper;
    private final CompanyResponseMapper companyResponseMapper;
    @Override
    public void saveOperator(OperatorRequestDTO operatorRequestDTO) {
        Operator o = operatorRequestMapper.asEntity(operatorRequestDTO);
        Company company = companyRequestMapper.asEntity(operatorRequestDTO.getCompanyRequestDTO());
        o.setCompany(company);
        operatorRepository.save(o);
    }

    @Override
    public OperatorResponseDTO findById(Long id) throws IdNotFoundException {
        Operator o = null;
        if (operatorRepository.findById(id).isPresent()) {
            o = operatorRepository.findById(id).get();
            OperatorResponseDTO oDto = operatorResponseMapper.asDto(o);
            oDto.setCompanyResponseDTO(companyResponseMapper.asDto(o.getCompany()));
            return oDto;
        }
        if(o == null){
            throw new IdNotFoundException("Id " + id + " non è presente nel db");
        }
        else {
            return operatorResponseMapper.asDto(o);
        }
    }

    @Override
    public void deleteOperatorById(Long id) throws IdNotFoundException {
        if(operatorRepository.findById(id).isPresent()) {
            Operator o = operatorRepository.findById(id).get();
            if (o != null) {
                operatorRepository.delete(o);
            }
            else{
                throw new IdNotFoundException("Id " + id + " non è presente nel db");
            }
        }
    }

    @Override
    public List<OperatorResponseDTO> findAllOperators() {
        return operatorResponseMapper.asDTOList(operatorRepository.findAll());
    }
}
