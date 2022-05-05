package com.example.ERPSpringBoot.BLL.mapper.implementation;

import com.example.ERPSpringBoot.BLL.dto.response.FatturaResponseDTO;
import com.example.ERPSpringBoot.BLL.mapper.abstraction.GenericResponseMapper;
import com.example.ERPSpringBoot.DAL.Entity.Fattura;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface FatturaResponseMapper extends GenericResponseMapper<Fattura, FatturaResponseDTO> {
}
