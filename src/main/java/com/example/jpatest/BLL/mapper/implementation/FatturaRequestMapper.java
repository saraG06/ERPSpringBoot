package com.example.jpatest.BLL.mapper.implementation;

import com.example.jpatest.BLL.dto.request.FatturaRequestDTO;
import com.example.jpatest.BLL.mapper.abstraction.GenericRequestMapper;
import com.example.jpatest.DAL.Entity.Fattura;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface FatturaRequestMapper extends GenericRequestMapper<Fattura, FatturaRequestDTO> {
}
