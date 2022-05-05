package com.example.ERPSpringBoot.BLL.mapper.implementation;

import com.example.ERPSpringBoot.BLL.dto.response.AziendaResponseDTO;
import com.example.ERPSpringBoot.BLL.mapper.abstraction.GenericResponseMapper;
import com.example.ERPSpringBoot.DAL.Entity.Azienda;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface AziendaResponseMapper extends GenericResponseMapper<Azienda, AziendaResponseDTO> {
}
