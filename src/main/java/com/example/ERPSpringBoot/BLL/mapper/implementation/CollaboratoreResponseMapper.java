package com.example.ERPSpringBoot.BLL.mapper.implementation;

import com.example.ERPSpringBoot.BLL.dto.response.CollaboratoreResponseDTO;
import com.example.ERPSpringBoot.BLL.mapper.abstraction.GenericResponseMapper;
import com.example.ERPSpringBoot.DAL.Entity.Collaboratore;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface CollaboratoreResponseMapper extends GenericResponseMapper<Collaboratore, CollaboratoreResponseDTO> {
}
