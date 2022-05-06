package it.unikey.ERPSpringBoot.BLL.service.implementation;

import it.unikey.ERPSpringBoot.BLL.dto.request.EmployeeRequestDto;
import it.unikey.ERPSpringBoot.BLL.dto.response.EmployeeResponseDto;
import it.unikey.ERPSpringBoot.BLL.mapper.implementation.EmployeeRequestMapper;
import it.unikey.ERPSpringBoot.BLL.mapper.implementation.EmployeeResponseMapper;
import it.unikey.ERPSpringBoot.BLL.service.abstraction.EmployeeService;
import it.unikey.ERPSpringBoot.DAL.Entity.Employee;
import it.unikey.ERPSpringBoot.DAL.Repository.EmployeeRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
@RequiredArgsConstructor
public class EmployeeServiceImpl implements EmployeeService {

    private final EmployeeRepository employeeRepository;
    private final EmployeeRequestMapper employeeRequestMapper;
    private final EmployeeResponseMapper employeeResponseMapper;
    @Override
    public List<Employee> getEmployeeWithCar() {
        return null;
    }

    @Override
    public void save(EmployeeRequestDto employeeRequestDto) {
        Employee e = employeeRequestMapper.asEntity(employeeRequestDto);
        employeeRepository.save(e);

    }

    @Override
    public EmployeeResponseDto findById(Long id) {
        Employee e = employeeRepository.getById(id);
        if(e!=null){
            employeeRepository.getById(id);
        } else {
            throw new NullPointerException();
        }
        return employeeResponseMapper.asDto(e);
    }
}
