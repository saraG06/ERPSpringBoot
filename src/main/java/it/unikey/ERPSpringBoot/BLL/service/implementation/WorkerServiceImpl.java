package it.unikey.ERPSpringBoot.BLL.service.implementation;

import it.unikey.ERPSpringBoot.BLL.dto.request.OrderRequestDto;
import it.unikey.ERPSpringBoot.BLL.dto.request.WorkerRequestDto;
import it.unikey.ERPSpringBoot.BLL.dto.response.WorkerResponseDto;
import it.unikey.ERPSpringBoot.BLL.mapper.implementation.WorkerRequestMapper;
import it.unikey.ERPSpringBoot.BLL.mapper.implementation.WorkerResponseMapper;
import it.unikey.ERPSpringBoot.BLL.service.abstraction.WorkerService;
import it.unikey.ERPSpringBoot.DAL.Entity.Worker;
import it.unikey.ERPSpringBoot.DAL.Repository.WorkerRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class WorkerServiceImpl implements WorkerService {

            private final WorkerRepository workerRepository;
            private final WorkerRequestMapper workerRequestMapper;
            private final WorkerResponseMapper workerResponseMapper;

    @Override
    public void saveOrder(OrderRequestDto orderRequestDto) {


    }

    @Override
    public void saveWorker(WorkerRequestDto workerRequestDto) {
    Worker w = workerRequestMapper.asEntity(workerRequestDto);
    workerRepository.save(w);
    }

    @Override
    public WorkerResponseDto findById(Long id) {
        Worker w = workerRepository.getById(id);
        if(w!=null){
            workerRepository.findById(id);
        } else throw new NullPointerException();
        return workerResponseMapper.asDto(w);
    }

    @Override
    public List<WorkerResponseDto> findAllByName(String nome) {
        return null;
    }
}
