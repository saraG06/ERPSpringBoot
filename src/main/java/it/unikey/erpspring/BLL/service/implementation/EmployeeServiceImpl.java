package it.unikey.erpspring.BLL.service.implementation;

import it.unikey.erpspring.BLL.DTO.request.CollaboratorRequestDTO;
import it.unikey.erpspring.BLL.DTO.request.EmployeeRequestDTO;
import it.unikey.erpspring.BLL.DTO.response.CollaboratorResponseDTO;
import it.unikey.erpspring.BLL.DTO.response.EmployeeResponseDTO;
import it.unikey.erpspring.BLL.mapper.implementation.request.EmployeeRequestMapper;
import it.unikey.erpspring.BLL.mapper.implementation.response.EmployeeResponseMapper;
import it.unikey.erpspring.BLL.service.abstraction.EmployeeService;
import it.unikey.erpspring.DAL.entity.Collaborator;
import it.unikey.erpspring.DAL.entity.Employee;
import it.unikey.erpspring.DAL.repository.EmployeeRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.repository.query.FluentQuery;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import java.util.Optional;
import java.util.function.Function;

@Service
@RequiredArgsConstructor
public class EmployeeServiceImpl implements EmployeeService {

    private final EmployeeRepository employeeRepository;
    private final EmployeeRequestMapper employeeRequestMapper;
    private final EmployeeResponseMapper employeeResponseMapper;
    private final EmployeeResponseDTO employeeResponseDTO;
    private final EmployeeRequestDTO employeeRequestDTO;


    @Override
    public List<EmployeeResponseDTO> getEmployeeWithCar() {
        List<Employee> lista = employeeRepository.getEmployeeWithCar();
        return employeeResponseMapper.asDTOList(lista);
    }

    @Override
    public List<EmployeeResponseDTO> getAllLastMonth() {
        List<Employee> lista = employeeRepository.getAllLastMonth();
        return employeeResponseMapper.asDTOList(lista);
    }

    @Override
    public void saveEmployee(EmployeeRequestDTO employeeRequestDTO) {
        Employee e = employeeRequestMapper.asEntity(employeeRequestDTO);
        employeeRepository.save(e);
    }

    @Override
    public EmployeeResponseDTO findById(Long id) {
        Employee e = employeeRepository.getById(id);

        if (id != null){
            return employeeResponseMapper.asDTO(e);
        }
        else throw new NullPointerException();
    }


}
