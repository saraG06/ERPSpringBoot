package com.example.jpatest.BLL.mapper.implementation;

import com.example.jpatest.BLL.dto.request.ClienteRequestDTO;
import com.example.jpatest.BLL.mapper.abstraction.GenericRequestMapper;
import com.example.jpatest.DAL.Entity.Cliente;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface ClienteRequestMapper extends GenericRequestMapper<Cliente, ClienteRequestDTO> {
}
