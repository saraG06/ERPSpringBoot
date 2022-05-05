package com.example.ERPSpringBoot.BLL.mapper.implementation;

import com.example.ERPSpringBoot.BLL.dto.request.DipendenteRequestDTO;
import com.example.ERPSpringBoot.BLL.mapper.abstraction.GenericRequestMapper;
import com.example.ERPSpringBoot.DAL.Entity.Dipendente;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface DipendenteRequestMapper extends GenericRequestMapper<Dipendente, DipendenteRequestDTO> {
}
