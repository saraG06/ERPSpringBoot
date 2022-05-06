package it.unikey.ERPSpringBoot.BLL.service.abstraction;

import it.unikey.ERPSpringBoot.BLL.dto.request.OrderRequestDto;
import it.unikey.ERPSpringBoot.BLL.dto.request.WorkerRequestDto;
import it.unikey.ERPSpringBoot.BLL.dto.response.WorkerResponseDto;
import it.unikey.ERPSpringBoot.DAL.Entity.Worker;

import java.util.List;

public interface WorkerService {

    void saveOrder (OrderRequestDto orderRequestDto);
    void saveWorker (WorkerRequestDto workerRequestDto);
    WorkerResponseDto findById (Long id);

    List<WorkerResponseDto> findAllByName(String nome);
}
