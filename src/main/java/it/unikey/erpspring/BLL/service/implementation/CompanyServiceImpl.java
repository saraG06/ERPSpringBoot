package it.unikey.erpspring.BLL.service.implementation;


import it.unikey.erpspring.BLL.DTO.response.CompanyResponseDTO;
import it.unikey.erpspring.BLL.mapper.implementation.*;
import it.unikey.erpspring.BLL.service.exception.EntityNotFoundException;
import it.unikey.erpspring.DAL.entity.*;
import it.unikey.erpspring.DAL.repository.CompanyRepository;
import it.unikey.erpspring.BLL.DTO.request.CompanyRequestDTO;
import it.unikey.erpspring.BLL.mapper.implementation.*;
import it.unikey.erpspring.BLL.service.abstraction.CompanyService;
import it.unikey.erpspring.DAL.entity.*;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class CompanyServiceImpl implements CompanyService {
    private final CompanyRepository companyRepository;
    private final CompanyRequestMapper companyRequestMapper;
    private final CompanyResponseMapper companyResponseMapper;
    private final ClientRequestMapper clientRequestMapper;
    private final OrderRequestMapper orderRequestMapper;
    private final InvoiceRequestMapper invoiceRequestMapper;
    private final EmployeeRequestMapper employeeRequestMapper;

    @Override
    public void saveCompany(CompanyRequestDTO companyRequestDTO) {
        Company c = companyRequestMapper.asEntity(companyRequestDTO);
        List<Client> clientList = clientRequestMapper.asEntityList(companyRequestDTO.getClientRequestDTOList());
        List<Invoice> invoiceList = invoiceRequestMapper.asEntityList(companyRequestDTO.getInvoiceRequestDTOList());
        List<Order> orderList = orderRequestMapper.asEntityList(companyRequestDTO.getOrderRequestDTOList());
        List<Employee> employeeList = employeeRequestMapper.asEntityList(companyRequestDTO.getEmployeeRequestDTOList());
        c.setClients(clientList);
        c.setEmployees(employeeList);
        c.setInvoices(invoiceList);
        c.setOrders(orderList);
        companyRepository.save(c);
    }

    @Override
    public CompanyResponseDTO getCompanyById(Long id) throws EntityNotFoundException {
        Company c = null;
        if (companyRepository.findById(id).isPresent()) {
            c = companyRepository.findById(id).get();
        }
        if(c == null){
            throw new EntityNotFoundException("Id " + id + " non è presente nel db");
        }
        else {
            return companyResponseMapper.asDTO(c);
        }
    }

    @Override
    public void deleteCompanyById(Long id) throws EntityNotFoundException {
        if(companyRepository.findById(id).isPresent()) {
            Company c = companyRepository.findById(id).get();
            if (c != null) {
                companyRepository.delete(c);
            }
            else{
                throw new EntityNotFoundException("Id " + id + " non è presente nel db");
            }
        }
    }

    @Override
    public List<CompanyResponseDTO> getAllCompany() {
        return companyResponseMapper.asDTOList(companyRepository.findAll());
    }
}