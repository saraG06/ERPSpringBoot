package com.example.erpspring.BLL.mapper.implementation;
import com.example.erpspring.BLL.dto.request.ContattoRequestDTO;
import com.example.erpspring.BLL.mapper.abstraction.GenericRequestMapper;
import com.example.erpspring.DAL.Entity.persone.Contatto;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface ContattoRequestMapper extends GenericRequestMapper<Contatto, ContattoRequestDTO> {
}
