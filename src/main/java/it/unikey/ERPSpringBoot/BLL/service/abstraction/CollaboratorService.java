package it.unikey.ERPSpringBoot.BLL.service.abstraction;

import it.unikey.ERPSpringBoot.BLL.dto.request.CollaboratorRequestDto;
import it.unikey.ERPSpringBoot.BLL.dto.response.CollaboratorResponseDto;

public interface CollaboratorService {

    void saveCollaborator (CollaboratorRequestDto collaboratorRequestDto);
    CollaboratorResponseDto findById (Long id);
}
