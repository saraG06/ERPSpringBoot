package com.example.jpatest.BLL.mapper.implementation;

import com.example.jpatest.BLL.dto.response.ClienteResponseDTO;
import com.example.jpatest.BLL.mapper.abstraction.GenericResponseMapper;
import com.example.jpatest.DAL.Entity.Cliente;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface ClienteResponseMapper extends GenericResponseMapper<Cliente, ClienteResponseDTO> {
}
