package com.example.ERPSpringBoot.BLL.mapper.implementation;

import com.example.ERPSpringBoot.BLL.dto.request.OperatoreRequestDTO;
import com.example.ERPSpringBoot.BLL.mapper.abstraction.GenericRequestMapper;
import com.example.ERPSpringBoot.DAL.Entity.Operatore;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface OperatoreRequestMapper extends GenericRequestMapper<Operatore, OperatoreRequestDTO> {
}
