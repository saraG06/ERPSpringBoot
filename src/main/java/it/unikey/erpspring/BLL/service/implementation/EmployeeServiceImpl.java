package it.unikey.erpspring.BLL.service.implementation;

import it.unikey.erpspring.BLL.DTO.request.EmployeeRequestDTO;
import it.unikey.erpspring.BLL.DTO.request.ResourceRequestDTO;
import it.unikey.erpspring.BLL.DTO.response.EmployeeResponseDTO;
import it.unikey.erpspring.BLL.mapper.implementation.*;
import it.unikey.erpspring.BLL.service.abstraction.EmployeeService;
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
    public void saveEmployee(EmployeeRequestDTO employeeRequestDTO) {
        Employee e = employeeRequestMapper.asEntity(employeeRequestDTO);
        e.setRole(employeeRequestDTO.getRole());
        e.setCompany(companyRequestMapper.asEntity(employeeRequestDTO.getCompanyRequestDTO()));
        e.setWorker(workerRequestMapper.asEntity(employeeRequestDTO.getWorkerRequestDTO()));
        employeeRepository.save(e);
    }

    @Override
    public EmployeeResponseDTO findEmployeeById(Long id) throws NullPointerException{
        Employee e = employeeRepository.getById(id);
        if(id != null){
            return employeeResponseMapper.asDTO(e);
        }else{
            throw new NullPointerException();
        }
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
    public void deleteEmployeeById(Long id) throws NullPointerException{
        if(employeeRepository.existsById(id)){
            employeeRepository.deleteById(id);
        }else{
            throw new NullPointerException();
        }
    }

    @Override
    public List<EmployeeResponseDTO> findAllEmployee() {
        List<Employee> e = employeeRepository.findAll();
        return employeeResponseMapper.asDTOList(e);
    }
}
