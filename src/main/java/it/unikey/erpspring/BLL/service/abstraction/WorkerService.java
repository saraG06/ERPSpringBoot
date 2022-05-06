package it.unikey.erpspring.BLL.service.abstraction;


import it.unikey.erpspring.BLL.DTO.request.ContactRequestDTO;
import it.unikey.erpspring.BLL.DTO.request.OrderRequestDTO;
import it.unikey.erpspring.BLL.DTO.request.WorkerRequestDTO;
import it.unikey.erpspring.BLL.DTO.response.WorkerResponseDTO;


public interface WorkerService {


    void saveInvoice(OrderRequestDTO orderRequestDTO, ContactRequestDTO contactRequestDTO);

    void saveWorker(WorkerRequestDTO workerRequestDTO);

    WorkerResponseDTO findWorkerById(Long id);
}
