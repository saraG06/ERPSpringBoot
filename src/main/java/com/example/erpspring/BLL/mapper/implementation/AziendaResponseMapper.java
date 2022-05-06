package com.example.erpspring.BLL.mapper.implementation;

import com.example.erpspring.BLL.mapper.abstraction.GenericResponseMapper;
import com.example.erpspring.BLL.dto.response.AziendaResponseDTO;
import com.example.erpspring.DAL.Entity.Azienda;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface AziendaResponseMapper extends GenericResponseMapper<Azienda, AziendaResponseDTO> {
}
