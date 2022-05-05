package com.example.ERPSpringBoot.BLL.mapper.implementation;

import com.example.ERPSpringBoot.BLL.dto.response.OrdineResponseDTO;
import com.example.ERPSpringBoot.BLL.mapper.abstraction.GenericResponseMapper;
import com.example.ERPSpringBoot.DAL.Entity.Ordine;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface OrdineResponseMapper extends GenericResponseMapper<Ordine, OrdineResponseDTO> {
}
