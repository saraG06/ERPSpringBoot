package it.unikey.BLL.service.implementation;

import it.unikey.BLL.dto.request.CompanyRequestDTO;
import it.unikey.BLL.dto.response.CompanyResponseDTO;

import it.unikey.BLL.exception.IdNotFoundException;
import it.unikey.BLL.mapper.implementation.request.*;

import it.unikey.BLL.mapper.implementation.response.CompanyResponseMapper;
import it.unikey.BLL.service.abstraction.CompanyService;
import it.unikey.DAL.Entity.*;

import it.unikey.DAL.Repository.CompanyRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class CompanyServiceImplementation implements CompanyService {
    private final CompanyRepository companyRepository;
    private final CompanyRequestMapper companyRequestMapper;
    private final CompanyResponseMapper companyResponseMapper;
    private final ClientRequestMapper clientRequestMapper;
    private final OrderRequestMapper orderRequestMapper;
    private final InvoiceRequestMapper invoiceRequestMapper;
    private final EmployeeRequestMapper employeeRequestMapper;

    private final OperatorRequestMapper operatorRequestMapper;

    @Override
    public void saveCompany(CompanyRequestDTO companyRequestDTO) {
        Company c = companyRequestMapper.asEntity(companyRequestDTO);
        List<Client> clientList = clientRequestMapper.asEntityList(companyRequestDTO.getClientRequestDTOList());
        List<Invoice> invoiceList = invoiceRequestMapper.asEntityList(companyRequestDTO.getInvoiceRequestDTOList());
        List<Order> orderList = orderRequestMapper.asEntityList(companyRequestDTO.getOrderRequestDTOList());
        List<Employee> employeeList = employeeRequestMapper.asEntityList(companyRequestDTO.getEmployeeRequestDTOList());
        List<Operator> operatorList = operatorRequestMapper.asEntityList(companyRequestDTO.getOperatorRequestDTOList());
        c.setClients(clientList);
        c.setEmployees(employeeList);
        c.setInvoices(invoiceList);
        c.setOrders(orderList);
        c.setOperator(operatorList);
        companyRepository.save(c);
    }

    @Override
    public CompanyResponseDTO findById(Long id) throws IdNotFoundException {
        Company c = null;
        if (companyRepository.findById(id).isPresent()) {
            c = companyRepository.findById(id).get();
        }
        if(c == null){
            throw new IdNotFoundException("Id " + id + " non è presente nel db");
        }
        else {
            return companyResponseMapper.asDto(c);
        }
    }

    @Override
    public void deleteCompanyById(Long id) throws IdNotFoundException {
        if(companyRepository.findById(id).isPresent()) {
            Company c = companyRepository.findById(id).get();
            if (c != null) {
                companyRepository.delete(c);
            }
            else{
                throw new IdNotFoundException("Id " + id + " non è presente nel db");
            }
        }
    }

    @Override
    public List<CompanyResponseDTO> findAllCompanies() {
        return companyResponseMapper.asDTOList(companyRepository.findAll());
    }
}
