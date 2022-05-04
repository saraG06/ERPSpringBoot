package com.example.jpatest.BLL.mapper.implementation;

import com.example.jpatest.BLL.dto.request.ContattoRequestDTO;
import com.example.jpatest.BLL.mapper.abstraction.GenericRequestMapper;
import com.example.jpatest.DAL.Entity.Contatto;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface ContattoRequestMapper extends GenericRequestMapper<Contatto, ContattoRequestDTO> {
}
