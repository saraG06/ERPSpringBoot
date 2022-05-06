package com.example.erpspring.BLL.mapper.implementation;
import com.example.erpspring.BLL.dto.response.OperatoreResponseDTO;
import com.example.erpspring.BLL.mapper.abstraction.GenericResponseMapper;
import com.example.erpspring.DAL.Entity.persone.Operatore;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface OperatoreResponseMapper extends GenericResponseMapper<Operatore, OperatoreResponseDTO> {
}
