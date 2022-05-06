package com.example.erpspring.BLL.mapper.implementation;
import com.example.erpspring.BLL.dto.response.DipendenteResponseDTO;
import com.example.erpspring.BLL.mapper.abstraction.GenericResponseMapper;
import com.example.erpspring.DAL.Entity.persone.Dipendente;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")

public interface DipendenteResponseMapper extends GenericResponseMapper<Dipendente, DipendenteResponseDTO> {
}
