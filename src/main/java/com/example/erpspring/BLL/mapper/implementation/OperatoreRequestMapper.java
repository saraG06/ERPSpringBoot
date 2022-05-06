package com.example.erpspring.BLL.mapper.implementation;
import com.example.erpspring.BLL.dto.request.OperatoreRequestDTO;
import com.example.erpspring.BLL.mapper.abstraction.GenericRequestMapper;
import com.example.erpspring.DAL.Entity.persone.Operatore;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface OperatoreRequestMapper extends GenericRequestMapper<Operatore, OperatoreRequestDTO> {
}
