package com.example.ERPSpringBoot.BLL.mapper.implementation;

import com.example.ERPSpringBoot.BLL.dto.response.ClienteResponseDTO;
import com.example.ERPSpringBoot.BLL.mapper.abstraction.GenericResponseMapper;
import com.example.ERPSpringBoot.DAL.Entity.Cliente;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface ClienteResponseMapper extends GenericResponseMapper<Cliente, ClienteResponseDTO> {
}
