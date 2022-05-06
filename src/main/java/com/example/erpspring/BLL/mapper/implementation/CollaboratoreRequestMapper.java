package com.example.erpspring.BLL.mapper.implementation;
import com.example.erpspring.DAL.Entity.persone.Collaboratore;
import com.example.erpspring.BLL.mapper.abstraction.GenericRequestMapper;
import com.example.erpspring.BLL.dto.request.CollaboratoreRequestDTO;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface CollaboratoreRequestMapper extends GenericRequestMapper<Collaboratore, CollaboratoreRequestDTO> {
}
