package com.example.ERPSpringBoot.BLL.mapper.implementation;

import com.example.ERPSpringBoot.BLL.dto.request.RisorsaRequestDTO;
import com.example.ERPSpringBoot.BLL.mapper.abstraction.GenericRequestMapper;
import com.example.ERPSpringBoot.DAL.Entity.Risorsa;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface RisorsaRequestMapper extends GenericRequestMapper<Risorsa, RisorsaRequestDTO> {
}
