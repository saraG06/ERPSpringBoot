package it.unikey.erpspring.BLL.mapper.implementation;

import it.unikey.erpspring.BLL.DTO.response.WorkerResponseDTO;
import it.unikey.erpspring.BLL.mapper.abstraction.GenericReponseMapper;
import it.unikey.erpspring.DAL.entity.Worker;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface WorkerResponseMapper extends GenericReponseMapper<Worker, WorkerResponseDTO> {
}
