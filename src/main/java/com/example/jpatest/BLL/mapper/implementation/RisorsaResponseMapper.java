package com.example.jpatest.BLL.mapper.implementation;

import com.example.jpatest.BLL.dto.response.RisorsaResponseDTO;
import com.example.jpatest.BLL.mapper.abstraction.GenericResponseMapper;
import com.example.jpatest.DAL.Entity.Risorsa;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface RisorsaResponseMapper extends GenericResponseMapper<Risorsa, RisorsaResponseDTO> {
}
