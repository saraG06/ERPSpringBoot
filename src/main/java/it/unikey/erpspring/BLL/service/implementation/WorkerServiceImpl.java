package it.unikey.erpspring.BLL.service.implementation;

import it.unikey.erpspring.BLL.DTO.request.WorkerRequestDTO;
import it.unikey.erpspring.BLL.DTO.response.WorkerResponseDTO;
import it.unikey.erpspring.BLL.mapper.implementation.CompanyRequestMapper;
import it.unikey.erpspring.BLL.mapper.implementation.OrderRequestMapper;
import it.unikey.erpspring.BLL.mapper.implementation.WorkerRequestMapper;
import it.unikey.erpspring.BLL.mapper.implementation.WorkerResponseMapper;
import it.unikey.erpspring.BLL.service.exception.EntityNotFoundException;
import it.unikey.erpspring.DAL.entity.Worker;
import it.unikey.erpspring.DAL.repository.WorkerRepository;
import it.unikey.erpspring.BLL.service.abstraction.WorkerService;
import it.unikey.erpspring.DAL.entity.Company;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class WorkerServiceImpl implements WorkerService {
    private final WorkerRepository workerRepository;
    private final WorkerRequestMapper workerRequestMapper;
    private final WorkerResponseMapper workerResponseMapper;
    private final CompanyRequestMapper companyRequestMapper;
    private final OrderRequestMapper orderRequestMapper;
    @Override
    public void saveWorker(WorkerRequestDTO workerRequestDTO) {
        Worker o = workerRequestMapper.asEntity(workerRequestDTO);
        Company company = companyRequestMapper.asEntity(workerRequestDTO.getCompanyRequestDTO());
        o.setCompany(company);
        workerRepository.save(o);
    }

    @Override
    public WorkerResponseDTO getWorkerById(Long id) throws EntityNotFoundException {
        Worker o = null;
        if (workerRepository.findById(id).isPresent()) {
            o = workerRepository.findById(id).get();
        }
        if(o == null){
            throw new EntityNotFoundException("Id " + id + " non è presente nel db");
        }
        else {
            return workerResponseMapper.asDTO(o);
        }
    }

    @Override
    public void deleteWorkerById(Long id) throws EntityNotFoundException {
        if(workerRepository.findById(id).isPresent()) {
            Worker o = workerRepository.findById(id).get();
            if (o != null) {
                workerRepository.delete(o);
            }
            else{
                throw new EntityNotFoundException("Id " + id + " non è presente nel db");
            }
        }
    }

    @Override
    public List<WorkerResponseDTO> getAllWorker() {
        return workerResponseMapper.asDTOList(workerRepository.findAll());
    }




}
