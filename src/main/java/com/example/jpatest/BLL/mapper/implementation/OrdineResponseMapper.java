package com.example.jpatest.BLL.mapper.implementation;

import com.example.jpatest.BLL.dto.response.OrdineResponseDTO;
import com.example.jpatest.BLL.mapper.abstraction.GenericResponseMapper;
import com.example.jpatest.DAL.Entity.Ordine;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface OrdineResponseMapper extends GenericResponseMapper<Ordine, OrdineResponseDTO> {
}
