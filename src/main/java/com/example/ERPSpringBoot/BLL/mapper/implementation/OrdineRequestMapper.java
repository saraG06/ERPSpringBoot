package com.example.ERPSpringBoot.BLL.mapper.implementation;

import com.example.ERPSpringBoot.BLL.dto.request.OrdineRequestDTO;
import com.example.ERPSpringBoot.BLL.mapper.abstraction.GenericRequestMapper;
import com.example.ERPSpringBoot.DAL.Entity.Ordine;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface OrdineRequestMapper extends GenericRequestMapper<Ordine, OrdineRequestDTO> {
}
