package com.example.erpspring.BLL.mapper.implementation;
import com.example.erpspring.BLL.mapper.abstraction.GenericRequestMapper;
import com.example.erpspring.BLL.dto.request.ClienteRequestDTO;
import com.example.erpspring.DAL.Entity.Cliente;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface ClienteRequestMapper extends GenericRequestMapper<Cliente, ClienteRequestDTO> {
}
