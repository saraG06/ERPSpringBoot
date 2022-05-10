package it.unikey.erpspring.BLL.service.abstraction;


import it.unikey.erpspring.BLL.DTO.request.ContactRequestDTO;
import it.unikey.erpspring.BLL.DTO.request.OrderRequestDTO;
import it.unikey.erpspring.BLL.DTO.request.WorkerRequestDTO;
import it.unikey.erpspring.BLL.DTO.response.WorkerResponseDTO;

import java.util.List;


public interface WorkerService {


    void saveInvoice(OrderRequestDTO orderRequestDTO, ContactRequestDTO contactRequestDTO);

    void saveWorker(WorkerRequestDTO workerRequestDTO);

    WorkerResponseDTO findWorkerById(Long id);

    void deleteWorkerById(Long id);

    List<WorkerResponseDTO> findAllWorker();
}
