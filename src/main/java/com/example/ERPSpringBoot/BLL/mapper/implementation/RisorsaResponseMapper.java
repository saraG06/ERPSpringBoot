package com.example.ERPSpringBoot.BLL.mapper.implementation;

import com.example.ERPSpringBoot.BLL.dto.response.RisorsaResponseDTO;
import com.example.ERPSpringBoot.BLL.mapper.abstraction.GenericResponseMapper;
import com.example.ERPSpringBoot.DAL.Entity.Risorsa;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface RisorsaResponseMapper extends GenericResponseMapper<Risorsa, RisorsaResponseDTO> {
}
