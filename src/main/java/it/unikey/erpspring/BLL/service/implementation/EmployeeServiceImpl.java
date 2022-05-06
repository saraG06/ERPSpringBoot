package it.unikey.erpspring.BLL.service.implementation;

import it.unikey.erpspring.BLL.DTO.request.EmployeeRequestDTO;
import it.unikey.erpspring.BLL.DTO.response.EmployeeResponseDTO;
import it.unikey.erpspring.BLL.mapper.implementation.CompanyRequestMapper;
import it.unikey.erpspring.BLL.mapper.implementation.EmployeeRequestMapper;
import it.unikey.erpspring.BLL.mapper.implementation.EmployeeResponseMapper;
import it.unikey.erpspring.BLL.mapper.implementation.OrderRequestMapper;
import it.unikey.erpspring.BLL.service.exception.EntityNotFoundException;
import it.unikey.erpspring.DAL.entity.Employee;
import it.unikey.erpspring.DAL.repository.EmployeeRepository;
import it.unikey.erpspring.BLL.service.abstraction.EmployeeService;
import it.unikey.erpspring.DAL.entity.Company;
import it.unikey.erpspring.DAL.entity.Order;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class EmployeeServiceImpl implements EmployeeService {
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
        e.getWorker().setOrders(orderList);
        e.setCompany(company);
        employeeRepository.save(e);
    }

    @Override
    public EmployeeResponseDTO getEmployeeById(Long id) throws EntityNotFoundException {
        Employee e = null;
        if (employeeRepository.findById(id).isPresent()) {
            e = employeeRepository.findById(id).get();
        }
        if(e == null){
            throw new EntityNotFoundException("Id " + id + " non è presente nel db");
        }
        else {
            return employeeResponseMapper.asDTO(e);
        }
    }

    @Override
    public void deleteEmployeeById(Long id) throws EntityNotFoundException {
        if(employeeRepository.findById(id).isPresent()) {
            Employee e = employeeRepository.findById(id).get();
            if (e != null) {
                employeeRepository.delete(e);
            }
            else{
                throw new EntityNotFoundException("Id " + id + " non è presente nel db");
            }
        }
    }

    @Override
    public List<EmployeeResponseDTO> getAllEmployee() {
        return employeeResponseMapper.asDTOList(employeeRepository.findAll());
    }

    @Override
    public List<EmployeeResponseDTO> getAllEmployeeWithCar() {
        return employeeResponseMapper.asDTOList(employeeRepository.getEmployeeWithCar());
    }

    @Override
    public List<EmployeeResponseDTO> getAllWorkerLastMonthHired() {
        return employeeResponseMapper.asDTOList((employeeRepository.getOperatorHiredLastMonth()));
    }


}
