package com.example.jpatest.BLL.mapper.implementation;

import com.example.jpatest.BLL.dto.response.AziendaResponseDTO;
import com.example.jpatest.BLL.mapper.abstraction.GenericResponseMapper;
import com.example.jpatest.DAL.Entity.Azienda;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface AziendaResponseMapper extends GenericResponseMapper<Azienda, AziendaResponseDTO> {
}
