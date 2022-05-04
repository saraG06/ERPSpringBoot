package it.unikey.erp_springboot.BLL.mapper.implementation;

import it.unikey.erp_springboot.BLL.dto.response.ClientResponseDTO;
import it.unikey.erp_springboot.BLL.mapper.abstraction.GenericResponseMapper;
import it.unikey.erp_springboot.DAL.Entity.Client;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface ClientResponseMapper extends GenericResponseMapper<Client, ClientResponseDTO> {
}
