package it.unikey.erpspring.BLL.service.implementation;

import it.unikey.erpspring.BLL.DTO.request.InvoiceRequestDTO;
import it.unikey.erpspring.BLL.DTO.request.OrderRequestDTO;
import it.unikey.erpspring.BLL.DTO.request.WorkerRequestDTO;
import it.unikey.erpspring.BLL.DTO.response.WorkerResponseDTO;
import it.unikey.erpspring.BLL.service.abstraction.WorkerService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor

public class WorkerServiceImpl implements WorkerService {
    @Override
    public void saveOrder(OrderRequestDTO orderRequestDTO) {

    }

    @Override
    public void saveInvoice(InvoiceRequestDTO invoiceRequestDTO) {

    }

    @Override
    public void saveWorker(WorkerRequestDTO workerRequestDTO) {

    }

    @Override
    public WorkerResponseDTO findById(Long id) {
        return null;
    }
}
