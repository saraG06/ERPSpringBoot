package com.example.ERPSpringBoot.BLL.mapper.implementation;

import com.example.ERPSpringBoot.BLL.dto.request.FatturaRequestDTO;
import com.example.ERPSpringBoot.BLL.mapper.abstraction.GenericRequestMapper;
import com.example.ERPSpringBoot.DAL.Entity.Fattura;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface FatturaRequestMapper extends GenericRequestMapper<Fattura, FatturaRequestDTO> {
}
