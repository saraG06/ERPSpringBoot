package com.example.jpatest.BLL.mapper.implementation;

import com.example.jpatest.BLL.dto.response.CollaboratoreResponseDTO;
import com.example.jpatest.BLL.mapper.abstraction.GenericResponseMapper;
import com.example.jpatest.DAL.Entity.Collaboratore;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface CollaboratoreResponseMapper extends GenericResponseMapper<Collaboratore, CollaboratoreResponseDTO> {
}
