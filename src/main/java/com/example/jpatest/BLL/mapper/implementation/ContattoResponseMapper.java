package com.example.jpatest.BLL.mapper.implementation;

import com.example.jpatest.BLL.dto.response.ContattoResponseDTO;
import com.example.jpatest.BLL.mapper.abstraction.GenericResponseMapper;
import com.example.jpatest.DAL.Entity.Contatto;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface ContattoResponseMapper extends GenericResponseMapper<Contatto, ContattoResponseDTO> {
}
