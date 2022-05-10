package it.unikey.erpspring.BLL.service.abstraction;

import it.unikey.erpspring.BLL.DTO.request.WorkerRequestDTO;
import it.unikey.erpspring.BLL.DTO.response.WorkerResponseDTO;
import it.unikey.erpspring.BLL.service.exception.EntityNotFoundException;
import org.springframework.stereotype.Service;

import java.util.List;

public interface WorkerService {

    void saveWorker(WorkerRequestDTO workerRequestDTO);

    WorkerResponseDTO getWorkerById(Long id) throws EntityNotFoundException;

    void deleteWorkerById(Long id) throws EntityNotFoundException;

    List<WorkerResponseDTO> getAllWorker();


}
