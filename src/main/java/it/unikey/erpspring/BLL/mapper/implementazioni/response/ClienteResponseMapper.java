package it.unikey.erpspring.BLL.mapper.implementazioni.response;

import it.unikey.erpspring.BLL.dto.response.ClienteResponseDTO;
import it.unikey.erpspring.BLL.mapper.astratti.GenericResponseMapper;
import it.unikey.erpspring.DAL.Entity.Cliente;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface ClienteResponseMapper extends GenericResponseMapper<Cliente, ClienteResponseDTO> {
}
