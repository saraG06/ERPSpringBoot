package it.unikey.ERPSpringBoot.BLL.service.abstraction;

import it.unikey.ERPSpringBoot.BLL.dto.request.StreamsRequestDto;
import it.unikey.ERPSpringBoot.BLL.dto.response.StreamsResponseDto;

public interface StreamsService {

    void save (StreamsRequestDto streamsRequestDto);
    StreamsResponseDto findById(Long id);


}
