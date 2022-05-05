package BLL.mapper.implementation.response;

import BLL.dto.Response.ContattoResponseDTO;
import BLL.mapper.abstraction.GenericResponseMapper;
import DAL.Entity.Contatto;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface ContattoResponseMapper extends GenericResponseMapper<Contatto, ContattoResponseDTO> {
}
