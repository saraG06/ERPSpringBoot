package com.example.jpatest.BLL.mapper.implementation;

import com.example.jpatest.BLL.dto.request.OperatoreRequestDTO;
import com.example.jpatest.BLL.mapper.abstraction.GenericRequestMapper;
import com.example.jpatest.DAL.Entity.Operatore;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface OperatoreRequestMapper extends GenericRequestMapper<Operatore, OperatoreRequestDTO> {
}
