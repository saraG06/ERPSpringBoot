package it.unikey.erpspring.BLL.service.implementation;

import it.unikey.erpspring.BLL.DTO.request.EmployeeRequestDTO;
import it.unikey.erpspring.BLL.DTO.request.ResourceRequestDTO;
import it.unikey.erpspring.BLL.DTO.response.ResourceResponseDTO;
import it.unikey.erpspring.BLL.mapper.implementation.CollaboratorRequestMapper;
import it.unikey.erpspring.BLL.mapper.implementation.EmployeeRequestMapper;
import it.unikey.erpspring.BLL.mapper.implementation.ResourceRequestMapper;
import it.unikey.erpspring.BLL.mapper.implementation.ResourceResponseMapper;
import it.unikey.erpspring.BLL.service.abstraction.ResourceService;
import it.unikey.erpspring.DAL.entity.Resource;
import it.unikey.erpspring.DAL.repository.EmployeeRepository;
import it.unikey.erpspring.DAL.repository.ResourceRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class ResourceServiceImpl implements ResourceService {

    private final ResourceRepository resourceRepository;
    private final ResourceRequestMapper resourceRequestMapper;
    private final ResourceResponseMapper resourceResponseMapper;
    private final EmployeeRequestMapper employeeRequestMapper;
    private final CollaboratorRequestMapper collaboratorRequestMapper;
    private final EmployeeRepository employeeRepository;


    @Override
    public void assignResource(EmployeeRequestDTO one, EmployeeRequestDTO two, ResourceRequestDTO resource) {
        if(one.getRole().getValue() < two.getRole().getValue()){
            two.getResourceRequestDTOList().add(resource);
        } else if (one.getRole().getValue() == two.getRole().getValue() && one.getRole().getValue() == 1) {
            two.getResourceRequestDTOList().add(resource);
        }
        employeeRepository.save(employeeRequestMapper.asEntity(two));
    }

    @Override
    public ResourceResponseDTO findResourceById(Long id) throws NullPointerException{
        Resource r = resourceRepository.getById(id);
        if(id != null){
            return resourceResponseMapper.asDTO(r);
        }else{
            throw new NullPointerException();
        }
    }

    @Override
    public void saveResource(ResourceRequestDTO resourceRequestDTO) {
        Resource r = resourceRequestMapper.asEntity(resourceRequestDTO);
        resourceRepository.save(r);
    }
}
