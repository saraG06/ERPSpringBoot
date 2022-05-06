package com.example.erpspring.BLL.mapper.implementation;
import com.example.erpspring.DAL.Entity.persone.Collaboratore;
import com.example.erpspring.BLL.dto.response.CollaboratoreResponseDTO;
import com.example.erpspring.BLL.mapper.abstraction.GenericResponseMapper;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface CollaboratoreResponseMapper extends GenericResponseMapper<Collaboratore, CollaboratoreResponseDTO> {
}
