package it.unikey.erpspring.BLL.service.abstraction;

import it.unikey.erpspring.BLL.DTO.request.EmployeeRequestDTO;
import it.unikey.erpspring.BLL.DTO.request.ResourceRequestDTO;
import it.unikey.erpspring.BLL.DTO.response.ResourceResponseDTO;

import java.util.List;


public interface ResourceService {

    void assignResource(EmployeeRequestDTO one, EmployeeRequestDTO two, ResourceRequestDTO resource);

    ResourceResponseDTO findResourceById(Long id);

    void saveResource(ResourceRequestDTO resourceRequestDTO);

    void deleteResourceById(Long id);

    List<ResourceResponseDTO> findAllResource();
}
