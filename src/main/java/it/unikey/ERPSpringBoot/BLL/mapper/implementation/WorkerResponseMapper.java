package it.unikey.ERPSpringBoot.BLL.mapper.implementation;

import it.unikey.ERPSpringBoot.BLL.dto.response.WorkerResponseDto;
import it.unikey.ERPSpringBoot.BLL.mapper.abstraction.GenericResponseMapper;
import it.unikey.ERPSpringBoot.DAL.Entity.Worker;
import org.mapstruct.Mapper;
import org.mapstruct.ReportingPolicy;

@Mapper(componentModel = "spring")
public interface WorkerResponseMapper extends GenericResponseMapper<Worker, WorkerResponseDto> {
}
