package com.example.erpspring.BLL.mapper.implementation;
import com.example.erpspring.BLL.dto.request.OrdineRequestDTO;
import com.example.erpspring.BLL.mapper.abstraction.GenericRequestMapper;
import com.example.erpspring.DAL.Entity.Ordine;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface OrdineRequestMapper extends GenericRequestMapper<Ordine, OrdineRequestDTO> {
}
