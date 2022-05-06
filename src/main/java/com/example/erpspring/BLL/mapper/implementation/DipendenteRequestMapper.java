package com.example.erpspring.BLL.mapper.implementation;
import com.example.erpspring.BLL.dto.request.DipendenteRequestDTO;
import com.example.erpspring.BLL.mapper.abstraction.GenericRequestMapper;
import com.example.erpspring.DAL.Entity.persone.Dipendente;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface DipendenteRequestMapper extends GenericRequestMapper<Dipendente, DipendenteRequestDTO> {
}
