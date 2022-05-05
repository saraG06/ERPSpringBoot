package BLL.mapper.implementation;

import BLL.mapper.abstraction.GenericRequestMapper;
import BLL.mapper.dto.request.ContattoRequestDTO;
import DAL.Entity.Contatto;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface ContattoRequestMapper extends GenericRequestMapper<Contatto, ContattoRequestDTO> {
}
