package com.example.ERPSpringBoot.BLL.mapper.implementation;

import com.example.ERPSpringBoot.BLL.dto.request.CollaboratoreRequestDTO;
import com.example.ERPSpringBoot.BLL.mapper.abstraction.GenericRequestMapper;
import com.example.ERPSpringBoot.DAL.Entity.Collaboratore;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface CollaboratoreRequestMapper extends GenericRequestMapper<Collaboratore, CollaboratoreRequestDTO> {
}
