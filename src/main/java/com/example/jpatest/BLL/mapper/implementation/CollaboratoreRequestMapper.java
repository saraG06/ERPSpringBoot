package com.example.jpatest.BLL.mapper.implementation;

import com.example.jpatest.BLL.dto.request.CollaboratoreRequestDTO;
import com.example.jpatest.BLL.mapper.abstraction.GenericRequestMapper;
import com.example.jpatest.DAL.Entity.Collaboratore;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface CollaboratoreRequestMapper extends GenericRequestMapper<Collaboratore, CollaboratoreRequestDTO> {
}
