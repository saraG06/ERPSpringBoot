package com.example.jpatest.BLL.mapper.implementation;

import com.example.jpatest.BLL.dto.request.AziendaRequestDTO;
import com.example.jpatest.BLL.mapper.abstraction.GenericRequestMapper;
import com.example.jpatest.DAL.Entity.Azienda;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface AziendaRequestMapper extends GenericRequestMapper<Azienda, AziendaRequestDTO> {
}
