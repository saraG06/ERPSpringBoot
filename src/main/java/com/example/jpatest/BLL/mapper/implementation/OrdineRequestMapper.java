package com.example.jpatest.BLL.mapper.implementation;

import com.example.jpatest.BLL.dto.request.OrdineRequestDTO;
import com.example.jpatest.BLL.mapper.abstraction.GenericRequestMapper;
import com.example.jpatest.DAL.Entity.Ordine;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface OrdineRequestMapper extends GenericRequestMapper<Ordine, OrdineRequestDTO> {
}
