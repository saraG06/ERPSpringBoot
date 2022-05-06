package it.unikey.erpspring.BLL.service.implementation;

import it.unikey.erpspring.BLL.DTO.request.ContactRequestDTO;
import it.unikey.erpspring.BLL.DTO.request.InvoiceRequestDTO;
import it.unikey.erpspring.BLL.DTO.request.OrderRequestDTO;
import it.unikey.erpspring.BLL.DTO.request.WorkerRequestDTO;
import it.unikey.erpspring.BLL.DTO.response.WorkerResponseDTO;
import it.unikey.erpspring.BLL.mapper.implementation.InvoiceRequestMapper;
import it.unikey.erpspring.BLL.mapper.implementation.WorkerRequestMapper;
import it.unikey.erpspring.BLL.mapper.implementation.WorkerResponseMapper;
import it.unikey.erpspring.BLL.service.abstraction.WorkerService;
import it.unikey.erpspring.DAL.entity.Invoice;
import it.unikey.erpspring.DAL.entity.Worker;
import it.unikey.erpspring.DAL.repository.InvoiceRepository;
import it.unikey.erpspring.DAL.repository.WorkerRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.time.LocalDate;

@Service
@RequiredArgsConstructor
public class WorkerServiceImpl implements WorkerService {

    private final WorkerRepository workerRepository;
    private final WorkerRequestMapper workerRequestMapper;
    private final WorkerResponseMapper workerResponseMapper;
    private final InvoiceRequestMapper invoiceRequestMapper;
    private final InvoiceRepository invoiceRepository;

    @Override
    public void saveInvoice(OrderRequestDTO orderRequestDTO, ContactRequestDTO contactRequestDTO) {
        InvoiceRequestDTO invoiceRequestDTO = new InvoiceRequestDTO();
        invoiceRequestDTO.setOrderRequestDTO(orderRequestDTO);
        invoiceRequestDTO.setContactRequestDTO(contactRequestDTO);
        invoiceRequestDTO.setDate(LocalDate.now());
        Invoice i = invoiceRequestMapper.asEntity(invoiceRequestDTO);
        invoiceRepository.save(i);
    }

    @Override
    public void saveWorker(WorkerRequestDTO workerRequestDTO) {
        Worker w = workerRequestMapper.asEntity(workerRequestDTO);
        workerRepository.save(w);
    }

    @Override
    public WorkerResponseDTO findWorkerById(Long id) throws NullPointerException{
        Worker w = workerRepository.getById(id);
        if(id != null){
            return workerResponseMapper.asDTO(w);
        }else{
            throw new NullPointerException();
        }
    }
}
