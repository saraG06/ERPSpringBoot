package it.unikey.ERPSpringBoot.BLL.service.abstraction;

import it.unikey.ERPSpringBoot.BLL.dto.response.ResourceResponseDto;

public interface ResourseService {

    void save (ResourceResponseDto resourceResponseDto);
   ResourceResponseDto findById (long id);
}
