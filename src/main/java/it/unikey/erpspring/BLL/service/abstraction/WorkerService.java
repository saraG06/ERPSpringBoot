package it.unikey.erpspring.BLL.service.abstraction;

import it.unikey.erpspring.BLL.DTO.request.InvoiceRequestDTO;
import it.unikey.erpspring.BLL.DTO.request.OrderRequestDTO;
import it.unikey.erpspring.BLL.DTO.request.WorkerRequestDTO;
import it.unikey.erpspring.BLL.DTO.response.InvoiceResponseDTO;
import it.unikey.erpspring.BLL.DTO.response.WorkerResponseDTO;

public interface WorkerService {

    void saveOrder (OrderRequestDTO orderRequestDTO);

    void saveInvoice (InvoiceRequestDTO invoiceRequestDTO);

    void saveWorker (WorkerRequestDTO workerRequestDTO);

    WorkerResponseDTO findById (Long id);


}
