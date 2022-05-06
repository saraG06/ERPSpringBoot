package it.unikey.erpspring.BLL.service.implementation;

import it.unikey.erpspring.BLL.DTO.request.EmployeeRequestDTO;
import it.unikey.erpspring.BLL.DTO.request.ResourceRequestDTO;
import it.unikey.erpspring.BLL.DTO.response.EmployeeResponseDTO;
import it.unikey.erpspring.BLL.mapper.implementation.CompanyRequestMapper;
import it.unikey.erpspring.BLL.mapper.implementation.EmployeeRequestMapper;
import it.unikey.erpspring.BLL.mapper.implementation.EmployeeResponseMapper;
import it.unikey.erpspring.BLL.mapper.implementation.WorkerRequestMapper;
import it.unikey.erpspring.BLL.service.abstraction.EmployeeService;
import it.unikey.erpspring.DAL.entity.Contact;
import it.unikey.erpspring.DAL.entity.Employee;
import it.unikey.erpspring.DAL.repository.EmployeeRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor

public class EmployeeServiceImpl implements EmployeeService {

    private final EmployeeRepository employeeRepository;
    private final EmployeeResponseMapper employeeResponseMapper;
    private final EmployeeRequestMapper employeeRequestMapper;
    private final CompanyRequestMapper companyRequestMapper;
    private final WorkerRequestMapper workerRequestMapper;

    @Override
    public void insertResource(ResourceRequestDTO resourceRequestDTO) {

    }

    @Override
    public void saveEmployee(EmployeeRequestDTO employeeRequestDTO) {
        Employee e = employeeRequestMapper.asEntity(employeeRequestDTO);
        employeeRepository.save(e);
    }

    @Override
    public List<EmployeeResponseDTO> getEmployeesWithCar() {
        List<Employee> e = employeeRepository.getEmployeesWithCar();
        return employeeResponseMapper.asDTOList(e);
    }

    @Override
    public List<EmployeeResponseDTO> getOperatorsHiredLastMonth() {
        List<Employee> e = employeeRepository.getOperatorsHiredLastMonth();
        return employeeResponseMapper.asDTOList(e);
    }

    @Override
    public EmployeeResponseDTO findById(Long id) throws NullPointerException {
        Employee e = employeeRepository.getById(id);

        if (id != null) {
            return employeeResponseMapper.asDTO(e);
        } else throw new NullPointerException();
    }
}
