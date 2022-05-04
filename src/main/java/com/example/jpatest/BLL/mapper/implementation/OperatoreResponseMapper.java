package com.example.jpatest.BLL.mapper.implementation;

import com.example.jpatest.BLL.dto.response.OperatoreResponseDTO;
import com.example.jpatest.BLL.mapper.abstraction.GenericResponseMapper;
import com.example.jpatest.DAL.Entity.Operatore;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface OperatoreResponseMapper extends GenericResponseMapper<Operatore, OperatoreResponseDTO> {
}
