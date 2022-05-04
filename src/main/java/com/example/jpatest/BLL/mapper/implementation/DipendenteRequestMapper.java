package com.example.jpatest.BLL.mapper.implementation;

import com.example.jpatest.BLL.dto.request.DipendenteRequestDTO;
import com.example.jpatest.BLL.mapper.abstraction.GenericRequestMapper;
import com.example.jpatest.DAL.Entity.Dipendente;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface DipendenteRequestMapper extends GenericRequestMapper<Dipendente, DipendenteRequestDTO> {
}
