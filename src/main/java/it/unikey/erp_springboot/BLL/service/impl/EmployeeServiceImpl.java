package it.unikey.erp_springboot.BLL.service.impl;

import it.unikey.erp_springboot.BLL.dto.request.EmployeeRequestDTO;
import it.unikey.erp_springboot.BLL.dto.response.EmployeeResponseDTO;
import it.unikey.erp_springboot.BLL.mapper.implementation.*;
import it.unikey.erp_springboot.BLL.service.abstraction.EmployeeService;
import it.unikey.erp_springboot.DAL.Entity.Company;
import it.unikey.erp_springboot.DAL.Entity.Employee;
import it.unikey.erp_springboot.DAL.Entity.Operator;
import it.unikey.erp_springboot.DAL.Repository.EmployeeRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class EmployeeServiceImpl implements EmployeeService {

    private EmployeeRepository employeeRepository;
    private EmployeeRequestMapper employeeRequestMapper;
    private EmployeeResponseMapper employeeResponseMapper;
    private OperatorRequestMapper operatorRequestMapper;
    private OperatorResponseMapper operatorResponseMapper;
    private CompanyRequestMapper companyRequestMapper;
    @Override
    public void saveEmployee(EmployeeRequestDTO employeeRequestDTO) {
        Employee e = employeeRequestMapper.asEntity(employeeRequestDTO);
        Operator o = operatorRequestMapper.asEntity(employeeRequestDTO.getOperatorRequestDTO());
        Company c = o.getCompany();
        o.setCompany(c);
        e.setOperator(o);
        employeeRepository.save(e);
    }

    @Override
    public EmployeeResponseDTO findById(Long id) {
        Employee e = employeeRepository.getById(id);
        if(e != null){
            return employeeResponseMapper.asDTO(e);
        }else{
            throw new NullPointerException();
        }
    }

    @Override
    public void deleteEmployeeById(Long id) {
        if(employeeRepository.existsById(id)){
            employeeRepository.deleteById(id);
        }else{
            throw new NullPointerException();
        }
    }

    @Override
    public List<EmployeeResponseDTO> findAllEmployee() {
        List<Employee> list = employeeRepository.findAll();
        return employeeResponseMapper.asDTOList(list);
    }
}
