package com.example.jpatest.BLL.mapper.implementation;

import com.example.jpatest.BLL.dto.response.FatturaResponseDTO;
import com.example.jpatest.BLL.mapper.abstraction.GenericResponseMapper;
import com.example.jpatest.DAL.Entity.Fattura;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface FatturaResponseMapper extends GenericResponseMapper<Fattura, FatturaResponseDTO> {
}
