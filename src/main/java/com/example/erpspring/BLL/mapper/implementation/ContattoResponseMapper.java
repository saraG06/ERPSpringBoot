package com.example.erpspring.BLL.mapper.implementation;
import com.example.erpspring.BLL.dto.response.ContattoResponseDTO;
import com.example.erpspring.BLL.mapper.abstraction.GenericResponseMapper;
import com.example.erpspring.DAL.Entity.persone.Contatto;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface ContattoResponseMapper extends GenericResponseMapper<Contatto, ContattoResponseDTO> {
}
