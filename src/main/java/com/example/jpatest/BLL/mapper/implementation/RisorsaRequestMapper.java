package com.example.jpatest.BLL.mapper.implementation;

import com.example.jpatest.BLL.dto.request.RisorsaRequestDTO;
import com.example.jpatest.BLL.mapper.abstraction.GenericRequestMapper;
import com.example.jpatest.DAL.Entity.Risorsa;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface RisorsaRequestMapper extends GenericRequestMapper<Risorsa, RisorsaRequestDTO> {
}
