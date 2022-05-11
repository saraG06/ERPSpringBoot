package it.unikey.BLL.service.implementation;

import it.unikey.BLL.dto.request.CompanyRequestDTO;
import it.unikey.BLL.dto.response.*;

import it.unikey.BLL.exception.IdNotFoundException;
import it.unikey.BLL.mapper.implementation.request.*;

import it.unikey.BLL.mapper.implementation.response.*;
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
    private final ClientResponseMapper clientResponseMapper;
    private final OrderResponseMapper orderResponseMapper;
    private final InvoiceResponseMapper invoiceResponseMapper;
    private final EmployeeResponseMapper employeeResponseMapper;
    private final OperatorResponseMapper operatorResponseMapper;

    @Override
    public void saveCompany(CompanyRequestDTO companyRequestDTO) {
        Company c = companyRequestMapper.asEntity(companyRequestDTO);
        c.setClients(clientRequestMapper.asEntityList(companyRequestDTO.getClientRequestDTOList()));
        c.setOrders(orderRequestMapper.asEntityList(companyRequestDTO.getOrderRequestDTOList()));
        c.setInvoices(invoiceRequestMapper.asEntityList(companyRequestDTO.getInvoiceRequestDTOList()));
        c.setEmployees(employeeRequestMapper.asEntityList(companyRequestDTO.getEmployeeRequestDTOList()));
        c.setOperator(operatorRequestMapper.asEntityList(companyRequestDTO.getOperatorRequestDTOList()));
        companyRepository.save(c);
    }

    @Override
    public CompanyResponseDTO findById(Long id) throws IdNotFoundException {
        Company c = null;
        if (companyRepository.findById(id).isPresent()) {
            c = companyRepository.findById(id).get();
            CompanyResponseDTO cDto = companyResponseMapper.asDto(c);
            cDto.setInvoiceResponseDTOList(invoiceResponseMapper.asDTOList(c.getInvoices()));
            cDto.setEmployeeResponseDTOList(employeeResponseMapper.asDTOList(c.getEmployees()));
            cDto.setOrderResponseDTOList(orderResponseMapper.asDTOList(c.getOrders()));
            cDto.setClientResponseDTOList(clientResponseMapper.asDTOList(c.getClients()));
            cDto.setOperatorResponseDTOList(operatorResponseMapper.asDTOList(c.getOperator()));
            return cDto;
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
