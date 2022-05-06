package com.example.erpspring.BLL.mapper.implementation;
import com.example.erpspring.DAL.Entity.Cliente;
import com.example.erpspring.BLL.dto.response.ClienteResponseDTO;
import com.example.erpspring.BLL.mapper.abstraction.GenericResponseMapper;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface ClienteResponseMapper extends GenericResponseMapper<Cliente, ClienteResponseDTO> {
}
