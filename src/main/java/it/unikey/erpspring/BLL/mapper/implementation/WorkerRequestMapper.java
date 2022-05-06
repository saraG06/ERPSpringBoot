package it.unikey.erpspring.BLL.mapper.implementation;

import it.unikey.erpspring.BLL.DTO.request.WorkerRequestDTO;
import it.unikey.erpspring.BLL.mapper.abstraction.GenericRequestMapper;
import it.unikey.erpspring.DAL.entity.Worker;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface WorkerRequestMapper extends GenericRequestMapper<Worker, WorkerRequestDTO> {
}
