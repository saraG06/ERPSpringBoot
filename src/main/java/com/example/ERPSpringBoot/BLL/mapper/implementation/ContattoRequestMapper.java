package com.example.ERPSpringBoot.BLL.mapper.implementation;

import com.example.ERPSpringBoot.BLL.dto.request.ContattoRequestDTO;
import com.example.ERPSpringBoot.BLL.mapper.abstraction.GenericRequestMapper;
import com.example.ERPSpringBoot.DAL.Entity.Contatto;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface ContattoRequestMapper extends GenericRequestMapper<Contatto, ContattoRequestDTO> {
}
