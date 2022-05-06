package com.example.erpspring.BLL.mapper.implementation;
import com.example.erpspring.BLL.mapper.abstraction.GenericResponseMapper;
import com.example.erpspring.BLL.dto.response.FatturaResponseDTO;
import com.example.erpspring.DAL.Entity.Fattura;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface FatturaResponseMapper extends GenericResponseMapper<Fattura, FatturaResponseDTO> {
}
