package it.unikey.erp_springboot.BLL.mapper.implementation;

import it.unikey.erp_springboot.BLL.dto.request.ClientRequestDTO;
import it.unikey.erp_springboot.BLL.mapper.abstraction.GenericRequestMapper;
import it.unikey.erp_springboot.DAL.Entity.Client;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface ClientRequestMapper extends GenericRequestMapper<Client, ClientRequestDTO> {
}
