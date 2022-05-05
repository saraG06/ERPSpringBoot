package com.example.ERPSpringBoot.BLL.mapper.implementation;

import com.example.ERPSpringBoot.BLL.dto.request.AziendaRequestDTO;
import com.example.ERPSpringBoot.BLL.mapper.abstraction.GenericRequestMapper;
import com.example.ERPSpringBoot.DAL.Entity.Azienda;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface AziendaRequestMapper extends GenericRequestMapper<Azienda, AziendaRequestDTO> {
}
