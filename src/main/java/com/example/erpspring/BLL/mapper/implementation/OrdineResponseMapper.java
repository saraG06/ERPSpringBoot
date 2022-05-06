package com.example.erpspring.BLL.mapper.implementation;
import com.example.erpspring.BLL.dto.response.OrdineResponseDTO;
import com.example.erpspring.BLL.mapper.abstraction.GenericResponseMapper;
import com.example.erpspring.DAL.Entity.Ordine;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface OrdineResponseMapper extends GenericResponseMapper<Ordine, OrdineResponseDTO> {
}
