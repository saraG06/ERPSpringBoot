package it.unikey.ERPSpringBoot.BLL.service.implementation;

import it.unikey.ERPSpringBoot.BLL.dto.request.StreamsRequestDto;
import it.unikey.ERPSpringBoot.BLL.dto.response.StreamsResponseDto;
import it.unikey.ERPSpringBoot.BLL.mapper.implementation.StreamsRequestMapper;
import it.unikey.ERPSpringBoot.BLL.mapper.implementation.StreamsResponseMapper;
import it.unikey.ERPSpringBoot.BLL.service.abstraction.StreamsService;
import it.unikey.ERPSpringBoot.DAL.Entity.Streams;
import it.unikey.ERPSpringBoot.DAL.Repository.StreamRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class StreamsServiceImpl implements StreamsService {

    private final StreamRepository streamRepository;
    private final StreamsRequestMapper streamsRequestMapper;
    private final StreamsResponseMapper streamsResponseMapper;


    @Override
    public void save(StreamsRequestDto streamsRequestDto) {
        Streams s = streamsRequestMapper.asEntity(streamsRequestDto);
        streamRepository.save(s);
    }

    @Override
    public StreamsResponseDto findById(Long id) {
        Streams s = streamRepository.getById(id);
        if(s!=null){
            streamRepository.findById(id);
        } else throw  new NullPointerException();
        return streamsResponseMapper.asDto(s);
    }
}
