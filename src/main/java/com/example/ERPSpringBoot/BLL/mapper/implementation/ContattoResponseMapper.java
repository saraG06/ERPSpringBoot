package com.example.ERPSpringBoot.BLL.mapper.implementation;

import com.example.ERPSpringBoot.BLL.dto.response.ContattoResponseDTO;
import com.example.ERPSpringBoot.BLL.mapper.abstraction.GenericResponseMapper;
import com.example.ERPSpringBoot.DAL.Entity.Contatto;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface ContattoResponseMapper extends GenericResponseMapper<Contatto, ContattoResponseDTO> {
}
