package com.example.erpspring.BLL.mapper.implementation;

import com.example.erpspring.BLL.mapper.abstraction.GenericRequestMapper;
import com.example.erpspring.BLL.dto.request.AziendaRequestDTO;
import com.example.erpspring.DAL.Entity.Azienda;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface AziendaRequestMapper extends GenericRequestMapper<Azienda, AziendaRequestDTO> {
}
