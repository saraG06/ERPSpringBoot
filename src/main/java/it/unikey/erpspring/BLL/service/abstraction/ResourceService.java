package it.unikey.erpspring.BLL.service.abstraction;

import it.unikey.erpspring.BLL.DTO.request.ResourceRequestDTO;
import it.unikey.erpspring.BLL.DTO.response.ResourceResponseDTO;

public interface ResourceService {

    void saveResource(ResourceRequestDTO resourceRequestDTO);

    ResourceResponseDTO findById(Long id);
}
