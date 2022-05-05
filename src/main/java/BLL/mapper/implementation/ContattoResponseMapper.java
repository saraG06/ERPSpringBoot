package BLL.mapper.implementation;

import BLL.mapper.abstraction.GenericResponseMapper;
import BLL.mapper.dto.response.ContattoResponseDTO;
import DAL.Entity.Contatto;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface ContattoResponseMapper extends GenericResponseMapper<Contatto, ContattoResponseDTO> {
}
