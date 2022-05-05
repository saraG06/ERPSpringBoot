package com.example.ERPSpringBoot.BLL.mapper.implementation;

import com.example.ERPSpringBoot.BLL.dto.response.OperatoreResponseDTO;
import com.example.ERPSpringBoot.BLL.mapper.abstraction.GenericResponseMapper;
import com.example.ERPSpringBoot.DAL.Entity.Operatore;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface OperatoreResponseMapper extends GenericResponseMapper<Operatore, OperatoreResponseDTO> {
}
