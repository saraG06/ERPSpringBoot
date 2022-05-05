package it.unikey.BLL.service.implementation;

import it.unikey.BLL.dto.request.EmployeeRequestDTO;
import it.unikey.BLL.dto.response.EmployeeResponseDTO;
import it.unikey.BLL.exception.IdNotFoundException;
import it.unikey.BLL.mapper.implementation.request.CompanyRequestMapper;
import it.unikey.BLL.mapper.implementation.request.EmployeeRequestMapper;
import it.unikey.BLL.mapper.implementation.request.OrderRequestMapper;
import it.unikey.BLL.mapper.implementation.response.EmployeeResponseMapper;
import it.unikey.BLL.service.abstraction.EmployeeService;
import it.unikey.DAL.Entity.*;
import it.unikey.DAL.Repository.EmployeeRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class EmployeeServiceImplementation implements EmployeeService {
    private final EmployeeRepository employeeRepository;
    private final EmployeeRequestMapper employeeRequestMapper;
    private final EmployeeResponseMapper employeeResponseMapper;
    private final CompanyRequestMapper companyRequestMapper;
    private final OrderRequestMapper orderRequestMapper;

    @Override
    public void saveEmployee(EmployeeRequestDTO employeeRequestDTO) {
        Employee e = employeeRequestMapper.asEntity(employeeRequestDTO);
        List<Order> orderList = orderRequestMapper.asEntityList(employeeRequestDTO.getOrderRequestDTOList());
        Company company = companyRequestMapper.asEntity(employeeRequestDTO.getCompanyRequestDTO());
        e.setOrders(orderList);
        e.setCompany(company);
        employeeRepository.save(e);
    }

    @Override
    public EmployeeResponseDTO findById(Long id) throws IdNotFoundException {
        Employee e = null;
        if (employeeRepository.findById(id).isPresent()) {
            e = employeeRepository.findById(id).get();
        }
        if(e == null){
            throw new IdNotFoundException("Id " + id + " non è presente nel db");
        }
        else {
            return employeeResponseMapper.asDto(e);
        }
    }

    @Override
    public void deleteEmployeeById(Long id) throws IdNotFoundException {
        if(employeeRepository.findById(id).isPresent()) {
            Employee e = employeeRepository.findById(id).get();
            if (e != null) {
                employeeRepository.delete(e);
            }
            else{
                throw new IdNotFoundException("Id " + id + " non è presente nel db");
            }
        }
    }

    @Override
    public List<EmployeeResponseDTO> findAllEmployees() {
        return employeeResponseMapper.asDTOList(employeeRepository.findAll());
    }
}
