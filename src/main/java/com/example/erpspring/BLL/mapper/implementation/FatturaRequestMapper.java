package com.example.erpspring.BLL.mapper.implementation;
import com.example.erpspring.BLL.mapper.abstraction.GenericRequestMapper;
import com.example.erpspring.BLL.dto.request.FatturaRequestDTO;
import com.example.erpspring.DAL.Entity.Fattura;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface FatturaRequestMapper extends GenericRequestMapper<Fattura, FatturaRequestDTO> {
}
